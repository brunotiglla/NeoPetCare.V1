package com.example.neopetcarev1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VacunasActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var editTextName : EditText
    lateinit var  buttonClickMe : Button
    lateinit var  textViewMeessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacunas)


        editTextName = findViewById(R.id.editTxtVacunas)
        buttonClickMe = findViewById(R.id.button)
        textViewMeessage = findViewById(R.id.txtViewVacunas)


        buttonClickMe.setOnClickListener (this)




    }

    override fun onClick(view: View?) {
        val name = editTextName.text
        textViewMeessage.text = "Hello $name"
    }

}