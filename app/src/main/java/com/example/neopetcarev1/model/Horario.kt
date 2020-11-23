package com.example.neopetcarev1.model

data class Horario(
        var id_horario: Long,
        var dia: String,
        var hora: String,
        var nota: String,
        var veterinario: Long
)