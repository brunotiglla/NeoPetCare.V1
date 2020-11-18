package com.example.neopetcarev1.model

data class Veterinario(
        var idVeterinario: Long,
        var nombre: String,
        var apellido: String,
        var direccion_consultorio: String,
        var correo: String,
        var celular: String,
        var username: String,
        var password: String,
        var horarios: List<Horario>,
        var citas: List<Cita>
)