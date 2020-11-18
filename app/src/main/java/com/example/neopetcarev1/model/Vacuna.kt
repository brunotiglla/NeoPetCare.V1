package com.example.neopetcarev1.model

data class Vacuna(
        var idVacuna: Long,
        var nombrevacuna: String,
        var registro_vacunas: List<VacunaMascota>,
        var tipomascota: TipoMascota
)