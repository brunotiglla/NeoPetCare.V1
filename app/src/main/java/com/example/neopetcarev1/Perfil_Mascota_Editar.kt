package com.example.neopetcarev1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.neopetcarev1.AuthActivity.Companion.mascotas
import com.example.neopetcarev1.InicioMascota.Companion.nmasc
import com.example.neopetcarev1.api.RetrofitClient
import com.example.neopetcarev1.model.Mascota
import com.example.neopetcarev1.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class Perfil_Mascota_Editar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil__mascota__editar)

        botonEditar()
    }

    fun botonEditar(){

        var nombre = findViewById<EditText>(R.id.editTextTextPersonName2)
        var edad = findViewById<EditText>(R.id.editTextTextPersonName3)

        var boton = findViewById<Button>(R.id.button2)

        nombre.setText(mascotas[nmasc].nombre)
        edad.setText(mascotas[nmasc].edad.toString())


        boton.setOnClickListener {
            if (nombre.text.isEmpty() || edad.text.isEmpty()){
                Toast.makeText(this, "Datos Insuficientes", Toast.LENGTH_SHORT).show()
            }else{


                val masc = Mascota(mascotas[nmasc].id_mascota, nombre.text.toString(), edad.text.toString().toInt(), mascotas[nmasc].peso, mascotas[nmasc].tipomascota, mascotas[nmasc].usuario)

                mascotas[nmasc] = masc
                RetrofitClient.instance.actualizarMascota(masc.id_mascota, masc).enqueue(object: Callback<Void>{
                    override fun onResponse(call: Call<Void>, response: Response<Void>) {
                        Toast.makeText(applicationContext, "Se Actualizaron los Datos de su Mascota", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, InicioMascota::class.java)
                        startActivity(intent)
                    }

                    override fun onFailure(call: Call<Void>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }
                })

            }
        }
    }


}