package com.example.neopetcarev1.model

import java.util.*

data class Cita(
        var id_cita: Long,
        var estado: Boolean,
        var fecha: Date,
        var mascota: Long,
        var veterinario: Long
)