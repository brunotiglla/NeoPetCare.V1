package com.example.neopetcarev1.model

data class Mascota(
        var id_mascota: Long,
        var nombre: String,
        var edad: Int,
        var peso: Double,
        var registro_cuidados: List<RegistroCuidado>,
        var citas: List<Cita>,
        var registro_vacunas: List<VacunaMascota>,
        var usuario: Usuario,
        var tipomascota: TipoMascota
)