package com.example.neopetcarev1.model

data class Veterinario(
        var id_veterinario: Long,
        var apellido: String,
        var celular: String,
        var correo: String,
        var direccion_consultorio: String,
        var nombre: String,
        var password: String,
        var username: String
)