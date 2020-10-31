package com.example.neopetcarev1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)


        //Fuciones Nuevas
        botonDeCambio()


    }



    fun botonDeCambio(){

        val btnReg = findViewById<Button>(R.id.singUpButton)
        btnReg.setOnClickListener {
            val intent = Intent(this, HomeActiviy::class.java)
            startActivity(intent)

        }
    }

}


