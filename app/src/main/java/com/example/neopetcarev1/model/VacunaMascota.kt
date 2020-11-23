package com.example.neopetcarev1.model

import java.util.*

data class VacunaMascota(
        var id_vacuna_mascota: Long,
        var fecha_registro: Date,
        var fecha_vacuna_realizada: Date,
        var status: Boolean,
        var mascota: Long,
        var vacuna: Long
)