package com.ssafy.zip.android.viewmodel

import android.app.Application
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import androidx.lifecycle.*
import com.ssafy.zip.android.data.Album
import com.ssafy.zip.android.repository.AlbumRepository
import kotlinx.coroutines.launch

class AlbumViewModel(private val repository: AlbumRepository) : ViewModel() {
    // mutablelivedata는 수정 가능, 그냥 livedata는 읽기 전용(수정 불가)
    // kotlin convention: 값이 바뀌는 얘들은 이 클래스 안에서만 사용되기 때문에 앞에 '_' 붙여줌
    private val _albumList = MutableLiveData<ArrayList<Album>>()
    // kotlin convention: 위에 애랑 같은 값인데 외부에서 사용가능  (현재의 _albumList를 get)
    val albumList: LiveData<ArrayList<Album>> get() = _albumList

    init { // 초기화 시 서버에서 데이터를 받아옴
        Log.d(TAG, "AlbumViewModel 생성자 호출")
        viewModelScope.launch {
            // .value : livedata가 가지고 있는 값으로 접근
//            _albumList.value = repository.getAllAlbumList()
            println(repository.getAllAlbumList())
        }
    }

    class Factory(private val application : Application) : ViewModelProvider.Factory { // factory pattern
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return AlbumViewModel(AlbumRepository.getInstance(application)!!) as T
        }
    }
}