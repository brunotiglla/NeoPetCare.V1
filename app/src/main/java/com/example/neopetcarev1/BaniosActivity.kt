package com.example.neopetcarev1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class BaniosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banios)
    }

    fun FuncionesBasicas(){

        val btnListas = findViewById<Button>(R.id.btnBaños)
        val nuevoBanio = findViewById<EditText>(R.id.nuevoLista)
        val listaNew = findViewById<ListView>(R.id.ListaBanios)


        btnListas.setOnClickListener {








        }



    }


}