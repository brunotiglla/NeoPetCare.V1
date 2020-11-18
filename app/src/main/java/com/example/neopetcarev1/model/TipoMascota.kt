package com.example.neopetcarev1.model

data class TipoMascota(
        var idTipo: Long,
        var nombreTipo: String,
        var mascotas: List<Mascota>,
        var vacunas: List<Vacuna>
)