package com.example.neopetcarev1.model

import java.util.*

data class VacunaMascota(
        var idVacunaMascota: Long,
        var FechaRegistro: Date,
        var FechaVacunaRealizada: Date,
        var status: Boolean,
        var mascota: Mascota,
        var vacuna: Vacuna
)