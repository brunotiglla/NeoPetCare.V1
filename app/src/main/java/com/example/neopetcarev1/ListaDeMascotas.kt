package com.example.neopetcarev1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaDeMascotas : AppCompatActivity() {
    var Mascotas: ArrayList<MascotaModelos>? = null

    var lista:RecyclerView? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var adaptador:AdaptadorCustom? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iten_mascota)

        Mascotas = ArrayList()
        Mascotas?.add(MascotaModelos("Chuwaca", "10",R.drawable.download))

        lista = findViewById(R.id.lista)
        layoutManager = LinearLayoutManager(this)
        adaptador = AdaptadorCustom(Mascotas!!)
        lista?.layoutManager = layoutManager
        lista?.adapter = adaptador

    }
}