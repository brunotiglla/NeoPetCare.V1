package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        //Fuciones Nuevas
        botonCambioInicio()
        botonCambioRegistro()
    }


    fun botonCambioRegistro(){

        val btnReg = findViewById<Button>(R.id.singUpButton)
        btnReg.setOnClickListener {
            val intent = Intent(this, RegistroActiviy::class.java)
            startActivity(intent)

        }
    }

    fun botonCambioInicio(){

        //  Variables para el Email y Contraseña
        val textID = findViewById<EditText>(R.id.editEmailText)
        val textPass = findViewById<EditText>(R.id.passwordEditText)

        // Variable para el boton
        val btnIni = findViewById<Button>(R.id.loginButton)
        btnIni.setOnClickListener {

            // validar si los campos estan llenos
            if (textID.text.isEmpty()||textPass.text.isEmpty()){
                Toast.makeText(this, "Campos Incomplestos", Toast.LENGTH_SHORT).show()
            }else {

                // Funcion para activar el boton
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }




}


