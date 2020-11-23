package com.example.neopetcarev1.api

import com.example.neopetcarev1.model.*
import retrofit2.Call
import retrofit2.http.*

interface Api {

    //CREAR USUARIO
    @POST("api/usuario/registrarUsuario")
    fun crearUsuario(@Body usuario: Usuario): Call<Void>

    //OBTENER USUARIO POR ID
    @GET("api/usuario/obtenerUsuario/{codUsuario}")
    fun obtenerUsuarioId(@Path("codUsuario") codUsuario: Long): Call<Usuario>

    //ACTUALIZAR DATOS DEL USUARIO
    @PUT("api/usuario/actualizarUsuario/{idUsuario}")
    fun actualizarUsuario(@Path("codUsuario") codUsuario: Long, @Body usuario: Usuario): Call<Void>

    //LOGIN
    @POST("/api/usuario/login")
    fun login(@Body usuario: Usuario): Call<Usuario>


    //CREAR MASCOTA
    @POST("api/mascota/registrarMascota/{codUsuario}")
    fun crearMascota(@Path("codUsuario") codUsuario: Long, @Body mascota: Mascota): Call<Void>

    //ACTUALIZAR DATOS DE LA MASCOTA
    @PUT("api/mascota/actualizarMascota/{idMascota}")
    fun actualizarMascota(@Path("idMascota") idMascota: Long, @Body mascota: Mascota): Call<Void>

    //ELIMINAR MASCOTA
    @DELETE("api/mascota/eliminarMascota/{codigo}")
    fun eliminarMascota(@Path("codigo") codigo:Long): Call<Void>

    //LISTAR MASCOTAS
    @GET("/api/mascota/listarMascotasporUsuario/{idUsuario}")
    fun listarMascotas(@Path("idUsuario") idUsuario: Long): Call<MutableList<Mascota>>


    //REGISTRAR CUIDADO DE MASCOTA
    @POST("api/registroCuidado/registrarCuidado/{idMascota}")
    fun registrarCuidadoMascota(@Path("idMascota") idMascota: Long, @Body registroCuidado: RegistroCuidado): Call<Void>


    //REGISTRAR VACUNA DE UNA MASCOTA
    @POST("api/vacunamascota/registrarVacunaMascota/{idMascota}")
    fun registrarVacunaMascota(@Path("idMascota") idMascota: Long, @Body vacunaMascota: VacunaMascota): Call<Void>

}