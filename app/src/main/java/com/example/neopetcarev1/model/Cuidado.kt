package com.example.neopetcarev1.model

data class Cuidado(
        var idCuidado: Long,
        var nombre: String,
        var registro_cuidado: List<RegistroCuidado>
)