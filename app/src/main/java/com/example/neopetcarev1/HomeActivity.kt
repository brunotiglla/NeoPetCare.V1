package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Cambios en el Home
        //cambioTexto()


        cambioBanios()
        //cambiosCitas()

        cambiosComida()

        cambiosPerfil()

        cambiosVacunas()

    }


    /*fun cambioTexto() {
        val newText = findViewById<TextView>(R.id.textModificar)
        newText.setText("Bienvenido ")

        val Tag =  "MainActivity"
    }*/

    // LLamar a la clase(ventanta) Perfil
    fun cambiosPerfil(){
        val btnPerfil = findViewById<Button>(R.id.btnPerfilMascota)

        btnPerfil.setOnClickListener {
            val intent = Intent(this, Perfil_Mascota_Editar::class.java)
            startActivity(intent)
        }

    }


    // LLamar a la clase(ventanta) Vacunas
    fun cambiosVacunas(){
        val btnVacuna = findViewById<Button>(R.id.btnVacunas)

        btnVacuna.setOnClickListener {
            val intent = Intent(this, VacunasActivity::class.java)
            startActivity(intent)
        }
    }

    // LLamar a la clase(ventanta) Comida
    fun cambiosComida(){
        val btnComida = findViewById<Button>(R.id.btnComida)
        btnComida.setOnClickListener{
            val intent = Intent(this, RegistroAlimenticios::class.java)
            startActivity(intent)
        }
    }

    // LLamar a la clase(ventanta) Citas
    fun cambiosCitas(){}


    // LLamar a la clase(ventanta) Baños
    fun cambioBanios(){
        val btnBanios = findViewById<Button>(R.id.btnBaños)

        btnBanios.setOnClickListener {
            val intent = Intent(this,  RegistroBanios::class.java)
            startActivity(intent)
        }

    }




}