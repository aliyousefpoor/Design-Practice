package com.example.uitest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlinx.android.synthetic.main.collenction_fragment.*

class CollectionFragment : Fragment() {
    private lateinit var switchOne: SwitchMaterial
    private lateinit var switchTwo: SwitchMaterial
    private lateinit var switchThree: SwitchMaterial
    private lateinit var switchFour: SwitchMaterial
    private lateinit var submit: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.collenction_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        switchOne = view.findViewById(R.id.firstSwitch)
        switchTwo = view.findViewById(R.id.secondSwitch)
        switchThree = view.findViewById(R.id.thirdSwitch)
        switchFour = view.findViewById(R.id.forthSwitch)
        submit = view.findViewById(R.id.button)

        submit.setOnClickListener {
            val one: String
            val two: String
            val three: String
            val four: String

            if (switchOne.isChecked) {
                one = switchOne.textOn.toString()
            } else {
                one = switchOne.textOff.toString()
            }

            if (switchOne.isChecked) {
                two = switchTwo.textOn.toString()
            } else {
                two = switchTwo.textOff.toString()
            }

            if (switchOne.isChecked) {
                three = switchThree.textOn.toString()
            } else {
                three = switchThree.textOff.toString()
            }

            if (switchOne.isChecked) {
                four = switchFour.textOn.toString()
            } else {
                four = switchFour.textOff.toString()
            }
            Toast.makeText(
                context,
                "Switch1 -  " + one + " \n" + "Switch2 - " + two + "Switch3 -  " + three + " \n"
                        + "Switch4 - " + four,
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}