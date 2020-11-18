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


    //CREAR MASCOTA
    @POST("api/mascota/registrarMascota/{codUsuario}")
    fun crearMascota(@Path("codUsuario") codUsuario: Long, @Body mascota: Mascota): Call<Void>

    //ACTUALIZAR DATOS DE LA MASCOTA
    @PUT("api/mascota/actualizarMascota/{idMascota}")
    fun actualizarMascota(@Path("idMascota") idMascota: Long, @Body mascota: Mascota): Call<Void>

    //ELIMINAR MASCOTA
    @DELETE("api/mascota/eliminarMascota/{codigo}")
    fun eliminarMascota(@Path("codigo") codigo:Long): Call<Void>


    //REGISTRAR CUIDADO
    @POST("api/cuidado/registrar")
    fun registrarCuidado(@Body cuidado: Cuidado): Call<Void>


    //REGISTRAR VACUNA
    @POST("api//vacuna/registrarVacuna/{idTipoMascota}")
    fun registrarVacuna(@Path("idTipoMascota") idTipoMascota: Long, @Body vacuna: Vacuna): Call<Void>

}