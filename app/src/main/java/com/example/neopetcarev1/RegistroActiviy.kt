 package com.example.neopetcarev1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.w3c.dom.Text
import android.widget.EditText
import android.widget.Toast

 class RegistroActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_activiy)

        //Funcion para Registro
        botonRegistrace()

    }

    fun botonRegistrace(){

        // variables para validar los valores
        val usuario = findViewById<EditText>(R.id.editUsuarioTextR)
        val correo = findViewById<EditText>(R.id.editEmailTextR)
        val pass = findViewById<EditText>(R.id.editPasswordTextR)

        // variable para el boton registro
        val btnRegistrace = findViewById<Button>(R.id.singUpButton)


        btnRegistrace.setOnClickListener {
            if (usuario.text.isEmpty() || correo.text.isEmpty() || pass.text.isEmpty()){
                Toast.makeText(this, "Daton Insuficientes", Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(this, "Se Registro Exitosamente", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, AuthActivity::class.java)
                startActivity(intent)
            }
        }






    }


}