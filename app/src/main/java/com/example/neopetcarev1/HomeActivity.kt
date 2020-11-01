package com.example.neopetcarev1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.w3c.dom.Text
import android.widget.*



class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Cambios en el Home
        //cambioTexto()


        cambioBaños()
        //cambiosCitas()
        //cambiosComida()
        //cambiosPerfil()
        //cambiosVacunas()
    }


    /*fun cambioTexto() {
        val newText = findViewById<TextView>(R.id.textModificar)
        newText.setText("Bienvenido ")

        val Tag =  "MainActivity"
    }*/

    // LLamar a la clase(ventanta) Perfil
    fun cambiosPerfil(){}

    // LLamar a la clase(ventanta) Vacunas
    fun cambiosVacunas(){}

    // LLamar a la clase(ventanta) Comida
    fun cambiosComida(){}

    // LLamar a la clase(ventanta) Citas
    fun cambiosCitas(){}


    // LLamar a la clase(ventanta) Baños
    fun cambioBaños(){

        val btnBaño = findViewById<Button>(R.id.btnBaños)
        btnBaño.setOnClickListener {
            val intent = Intent(this, BaniosActivity::class.java)
            startActivity(intent)
        }

    }




}