package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.neopetcarev1.api.RetrofitClient
import com.example.neopetcarev1.model.Mascota
import com.example.neopetcarev1.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        //Fuciones Nuevas
        botonCambioInicio()
        botonCambioRegistro()
    }

    companion object{
        lateinit var mascotas: MutableList<Mascota>
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

                var us: Usuario = Usuario(1,"","","",textID.text.toString(),"","",textPass.text.toString())

                //listar las mascotas

                RetrofitClient.instance.listarMascotas(us.id_usuario).enqueue(object: Callback<MutableList<Mascota>>{
                    override fun onResponse(call: Call<MutableList<Mascota>>, response: Response<MutableList<Mascota>>) {
                        mascotas = response.body()!!
                        val intent = Intent(applicationContext, InicioMascota::class.java)
                        startActivity(intent)
                    }

                    override fun onFailure(call: Call<MutableList<Mascota>>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                })


                    }

            }
        }
    }







