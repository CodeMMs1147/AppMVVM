package com.example.appmvvm.domain

import com.example.appmvvm.data.CitasRepository
import com.example.appmvvm.data.model.CitasModel
import com.example.appmvvm.data.model.ProveedorCitas
import javax.inject.Inject

class CasoDeUsoCitaRandom @Inject constructor(private val proveedorCitas: ProveedorCitas) {

    //sin inyeccion
    //private val repository = CitasRepository()

    operator fun invoke():CitasModel?{
        val citas = proveedorCitas.citas //sin inyeccion -> ProveedorCitas.citas
        if (!citas.isNullOrEmpty()){
            val randomNumber=(0..citas.size -1).random()
            return citas[randomNumber]
        }
        return null
    }
}