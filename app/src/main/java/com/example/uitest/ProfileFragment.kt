package com.example.uitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    private lateinit var btn: Button
    private lateinit var password: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.profile_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.submit)
        password = view.findViewById(R.id.password)

        btn.setOnClickListener() {
            Toast.makeText(requireContext(), "PassWord : ${password.text}", Toast.LENGTH_SHORT).show()

        }
    }
}