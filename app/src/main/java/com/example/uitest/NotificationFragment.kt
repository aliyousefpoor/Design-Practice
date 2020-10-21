package com.example.uitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_layout.*
import kotlinx.android.synthetic.main.bottom_sheet_layout.view.*
import kotlinx.android.synthetic.main.notification_fragment.*
import kotlinx.android.synthetic.main.sheet.*

class NotificationFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.notification_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)


        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)


        shareTxt.setOnClickListener {
            Toast.makeText(context, "Share ...", Toast.LENGTH_SHORT).show()
        }
        uploadTxt.setOnClickListener {
            Toast.makeText(context, "Upload File ...", Toast.LENGTH_SHORT).show()
        }
        saveTxt.setOnClickListener {
            Toast.makeText(context, "Save File ...", Toast.LENGTH_SHORT).show()
        }
    }
}

