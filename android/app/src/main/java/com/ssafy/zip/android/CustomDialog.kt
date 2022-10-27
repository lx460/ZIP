package com.ssafy.zip.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.fragment.app.DialogFragment
import com.ssafy.zip.android.databinding.FragmentDialogBinding

class CustomDialog : DialogFragment() {
    private var _binding: FragmentDialogBinding? = null
    private val binding get() = _binding!!
    private var editflag = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDialogBinding.inflate(inflater, container, false)
        val data = requireArguments().getParcelable<Member>("key")
        if (data != null) {
            binding.dialogImage.setImageResource(data.image)
            binding.dialogRightName.setText(data.name)
            binding.dialogRightFamily.setText(data.family)
            binding.dialogRightNickname.setText(data.nickname)
        }
        binding.dialogButton.setOnClickListener {
            if(binding.dialogButton.text.equals("닫기")) {
                dismiss()
            } else{
                println(binding.dialogRightEditname.text)
                if( data!= null){
               val modifyMember = Member(data.id, binding.dialogRightEditname.text.toString(),
                   binding.dialogRightFamily.text.toString(), binding.dialogRightEditnickname.text.toString(),
                   data.image)
                    println(modifyMember)
                }
            }
        }
        binding.editBtn.setOnClickListener {
            if (!editflag) {
                editflag = true
                binding.dialogRightName.isGone = true
                binding.dialogRightEditnameLayout.isGone = false
                binding.dialogRightFamily.isGone = true
                binding.dialogRightEditfamilyLayout.isGone = false
                binding.dialogRightNickname.isGone = true
                binding.dialogRightEditnicknameLayout.isGone = false
                binding.dialogButton.setText("수정하기")
            } else {
                editflag = false
                binding.dialogRightName.isGone = false
                binding.dialogRightEditnameLayout.isGone = true
                binding.dialogRightFamily.isGone = false
                binding.dialogRightEditfamilyLayout.isGone = true
                binding.dialogRightNickname.isGone = false
                binding.dialogRightEditnicknameLayout.isGone = true
                binding.dialogButton.setText("닫기")
            }
        }
        binding.dialogRightEditname.hint = binding.dialogRightName.text
        binding.dialogRightEditfamily.hint = binding.dialogRightFamily.text
        binding.dialogRightEditnickname.hint = binding.dialogRightNickname.text

        binding.dialogRightEditname.setOnFocusChangeListener{_,hasFocus ->
            if(hasFocus){
                binding.dialogRightEditname.hint = ""
            } else {
                binding.dialogRightEditname.hint = binding.dialogRightName.text
            }
        }
        binding.dialogRightEditfamily.setOnFocusChangeListener{_,hasFocus ->
            if(hasFocus){
                binding.dialogRightEditfamily.hint = ""
            } else {
                binding.dialogRightEditfamily.hint = binding.dialogRightFamily.text
            }
        }
        binding.dialogRightEditnickname.setOnFocusChangeListener{_,hasFocus ->
            if(hasFocus){
                binding.dialogRightEditnickname.hint = ""
            } else {
                binding.dialogRightEditnickname.hint = binding.dialogRightNickname.text
            }
        }
        return binding.root
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
}