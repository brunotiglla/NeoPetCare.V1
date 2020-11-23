package com.example.neopetcarev1.model

data class Mascota(
        var id_mascota: Long,
        var nombre: String,
        var edad: Int,
        var peso: Double,
        var tipomascota: Long,
        var usuario: Long
)