package com.example.neopetcarev1.model

import java.util.*

data class RegistroCuidado(
        var id_registro_cuidado: Long,
        var fecha_realizado: Date,
        var fecha_registro: Date,
        var status: Boolean,
        var cuidado: Long,
        var mascota: Long
)