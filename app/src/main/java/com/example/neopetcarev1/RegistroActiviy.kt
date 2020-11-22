package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.neopetcarev1.api.RetrofitClient
import com.example.neopetcarev1.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        val btnRegistrace = findViewById<Button>(R.id.singUpButtonR)


        btnRegistrace.setOnClickListener {

            if (usuario.text.isEmpty() || correo.text.isEmpty() || pass.text.isEmpty()){
                Toast.makeText(this, "Daton Insuficientes", Toast.LENGTH_SHORT).show()

            }else{

                //Toast.makeText(this, "Se Registro Exitosamente", Toast.LENGTH_SHORT).show()

                val user: Usuario = Usuario(0, "", "", "", correo.text.toString(), "",usuario.text.toString(), pass.text.toString())


                RetrofitClient.instance.crearUsuario(user).enqueue(object: Callback<Void> {
                    override fun onResponse(call: Call<Void>, response: Response<Void>) {
                        Toast.makeText(applicationContext, "Se Registro Exitosamente", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, AuthActivity::class.java)
                        startActivity(intent)
                    }

                    override fun onFailure(call: Call<Void>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }
                })

                //val intent = Intent(this, AuthActivity::class.java)
                //startActivity(intent)
            }
        }

    }


}