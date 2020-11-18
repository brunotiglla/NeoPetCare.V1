package com.example.neopetcarev1.model

import java.util.*

data class Cita(
        var idCita: Long,
        var veterinario: Veterinario,
        var mascota: Mascota,
        var fecha: Date,
        var estado: Boolean
)