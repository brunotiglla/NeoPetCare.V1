package com.example.neopetcarev1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.find

class BaniosActivity : AppCompatActivity()  {
    var fruits = mutableListOf<String>("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banios)


        // Nuevas Funciones

        val myRecyclerView: RecyclerView = find(R.id.RecyclerViewL)
        myRecyclerView.layoutManager = LinearLayoutManager(this)



        // Funciones conocidas

        val btnAddBanios = findViewById<Button>(R.id.button4)
        btnAddBanios.setOnClickListener {
            NuevoTexto()
            myRecyclerView.adapter = MyAdapter(fruits)
        }

    }

    fun NuevoTexto(): MutableList<String> {
        var editText = findViewById<EditText>(R.id.editTxtAdd)

        val newEditText = editText.text
        fruits.add("$newEditText")

        return fruits
    }






}