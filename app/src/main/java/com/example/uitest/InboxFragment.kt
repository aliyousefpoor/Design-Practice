package com.example.uitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mukesh.OtpView

class InboxFragment : Fragment() {
    private lateinit var otpView: OtpView
    private lateinit var validateButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.inbox_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        otpView = view.findViewById(R.id.otp_view)
        validateButton = view.findViewById(R.id.validate)

        validateButton.setOnClickListener {
            Toast.makeText(context," otpView.text", Toast.LENGTH_SHORT).show()
        }
    }
}