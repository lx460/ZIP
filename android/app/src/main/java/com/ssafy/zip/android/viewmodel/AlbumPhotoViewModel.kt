package com.ssafy.zip.android.viewmodel

import android.app.Application
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.exifinterface.media.ExifInterface
import androidx.lifecycle.*
import com.ssafy.zip.android.data.Album
import com.ssafy.zip.android.repository.AlbumRepository
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException


class AlbumPhotoViewModel(private val repository: AlbumRepository, private val id: Long?) : ViewModel() {
    private val _album = MutableLiveData<Album>()
    val album: LiveData<Album> get() = _album

    init { // 초기화 시 서버에서 데이터를 받아옴
//        Log.d(ControlsProviderService.TAG, "AlbumPhotoViewModel 생성자 호출")
        viewModelScope.launch {
            _album.value = id?.let { repository.getAlbumById(it) }
        }
    }

    class Factory(private val application : Application, private val id : Long?) : ViewModelProvider.Factory { // factory pattern
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return AlbumPhotoViewModel(AlbumRepository.getInstance(application)!!, id) as T
        }
    }

    fun addPhotos(images : ArrayList<Uri>, albumId : Long?, pictureId : Long?, context : Context) {
        val imageList = ArrayList<MultipartBody.Part>()
        val contentResolver : ContentResolver = context.contentResolver

        for(index in 0 until images.size) {
            try {
                val fileName = System.currentTimeMillis().toString()
                val filePath : String = context.applicationInfo.dataDir + File.separator + fileName
                val file = File(filePath)
                // 매개변수로 받은 uri를 통해 이미지에 필요한 데이터를 불러들임
                /*val inputStream = contentResolver.openInputStream(images[index])*/
                // 이미지 데이터를 다시 내보내면서 file 객체에 만들었던 경로를 이용

                // 회전값 저장해서 넣어놓기
                val inputStream = contentResolver.openInputStream(images[index])
                val exif = inputStream?.let { ExifInterface(it) }

                val outputStream = FileOutputStream(file) // 파일을 쓸 수 있는 스트림 생성

                var pictureBitmap: Bitmap? = null

                val options = BitmapFactory.Options()
                try {
                    BitmapFactory.decodeStream(
                        context.contentResolver.openInputStream(images[index]),
                        null,
                        options
                    ) // 1번
                    var width = options.outWidth
                    var height = options.outHeight

                    var samplesize = 1
                    while (true) { //2번
                        if (width / 2 < 512 || height / 2 < 512) break
                        width /= 2
                        height /= 2
                        samplesize *= 2
                    }
                    options.inSampleSize = samplesize
                    val bitmap = BitmapFactory.decodeStream(
                        context.contentResolver.openInputStream(images[index]),
                        null,
                        options
                    ) //3번
                    pictureBitmap = bitmap
                } catch (e: FileNotFoundException) {
                    e.printStackTrace()
                }
                if (inputStream != null) {
                    inputStream.close()
                }

//                val options = BitmapFactory.Options()
//                options.inSampleSize = 4
//                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, images[index]);
//
//                val width = 1024 // 축소시킬 너비
//                val height = 1024 // 축소시킬 높이
//
//                var bmpWidth = bitmap.width.toFloat()
//                var bmpHeight = bitmap.height.toFloat()
//
//                if (bmpWidth > width) {
//                    // 원하는 너비보다 클 경우의 설정
//                    val mWidth = bmpWidth / 100
//                    val scale = width / mWidth
//                    bmpWidth *= scale / 100
//                    bmpHeight *= scale / 100
//                } else if (bmpHeight > height) {
//                    // 원하는 높이보다 클 경우의 설정
//                    val mHeight = bmpHeight / 100
//                    val scale = height / mHeight
//                    bmpWidth *= scale / 100
//                    bmpHeight *= scale / 100
//                }
//                val pictureBitmap = Bitmap.createScaledBitmap(
//                    bitmap,
//                    bmpWidth.toInt(), bmpHeight.toInt(), true
//                )

                if (pictureBitmap != null) {
                    pictureBitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
                };
               /* val buf = ByteArray(1024)
                var len : Int
                if (inputStream != null) {
                    while(inputStream.read(buf).also { len = it } > 0)
                        outputStream.write(buf, 0, len)
                    inputStream.close()
                }*/
                outputStream.close()

                val newExif = filePath?.let {
                    ExifInterface(it)
                }
                if (exif != null) {
                    newExif?.setAttribute(ExifInterface.TAG_ORIENTATION, exif.getAttribute(ExifInterface.TAG_ORIENTATION))
                }
                newExif?.saveAttributes()

                val requestBody = RequestBody.create(MediaType.parse("image/*"), file)
                val body = MultipartBody.Part.createFormData("files", fileName, requestBody)
//                println("파일입니다"+ index + "  "+ file.length())
                imageList.add(body)
            } catch (ignore : IOException){
            }
        }

        viewModelScope.launch {
            val photoList = repository.uploadPhotos(imageList.toList(), albumId, pictureId)

//            println("추가된 photoList: " + photoList)
            if (photoList != null) {
                for(index in 0 until photoList.size){
                    _album.value?.photoList?.add(photoList[index])
                }

                _album.value = _album.value
            }
        }
    }

}