package com.example.neopetcarev1.model

data class Usuario (
    val id_usuario: Long,
    val nombre: String,
    val apellido: String,
    val direccion: String,
    val correo: String,
    val celular: String,
    val username: String,
    val password: String
)