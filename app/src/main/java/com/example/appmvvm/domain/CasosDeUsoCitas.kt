package com.example.appmvvm.domain

import com.example.appmvvm.data.CitasRepository
import com.example.appmvvm.data.model.CitasModel
import javax.inject.Inject

class CasosDeUsoCitas @Inject constructor(private val repository : CitasRepository) {

    //sin inyeccion
    //private val repository = CitasRepository()

    suspend operator fun invoke():List<CitasModel>? = repository.getAllCitas()

}