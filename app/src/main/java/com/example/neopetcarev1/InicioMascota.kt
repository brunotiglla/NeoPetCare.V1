package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_inicio_mascota.*


class InicioMascota : AppCompatActivity(), RecyclerAdapter.OnAnimalClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_mascota)

        setupRecyclerView()
    }


    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        var listAnimales: List<Animal> = listOf(
            Animal(
                "Perro",
                "5 años",
                "data:image/jpeg;base64,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"
            ),
            Animal(
                "gato",
                "5 años",
                "data:image/jpeg;base64,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"
            )
        )

        recyclerView.adapter = RecyclerAdapter(this, listAnimales, this)

    }

    override fun onImageClick(imagen: String) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun onItemClick(nombre: String) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun onItem2Click(nombre: String) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }







}