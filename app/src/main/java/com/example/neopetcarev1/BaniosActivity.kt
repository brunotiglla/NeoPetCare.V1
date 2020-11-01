package com.example.neopetcarev1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class BaniosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banios)

        // Nuevas Funciones

        FuncionesBasicas()

    }

    fun FuncionesBasicas(){

        val btnListas = findViewById<Button>(R.id.btnBaños)
        val nuevoBanio = findViewById<EditText>(R.id.nuevoLista)
        val listaNew = findViewById<ListView>(R.id.ListaBanios)



      //  val productos = Producto("brayan", "20/10/2027", "se baño en la mañana")
      //  val ListaProductos = listOf<Producto>(productos)
       // val adapter = ProductoAdapter(this, ListaProductos)

       // listaNew.adapter = adapter




       /* btnListas.setOnClickListener {
            val intent = Intent(this, BaniosActivity::class.java)
             startActivity(intent)
       }*/



    }


}