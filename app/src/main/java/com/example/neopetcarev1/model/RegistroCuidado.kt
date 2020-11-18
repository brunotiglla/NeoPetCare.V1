package com.example.neopetcarev1.model

import java.util.*

data class RegistroCuidado(
        var idRegistroCuidado: Long,
        var mascota: Mascota,
        var cuidado: Cuidado,
        var fechaRegistro: Date,
        var fechaRealizado: Date,
        var status: Boolean
)