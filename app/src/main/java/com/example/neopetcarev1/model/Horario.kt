package com.example.neopetcarev1.model

data class Horario(
        var idHorario: Long,
        var dia: String,
        var hora: String,
        var nota: String,
        var veterinario: Veterinario
)