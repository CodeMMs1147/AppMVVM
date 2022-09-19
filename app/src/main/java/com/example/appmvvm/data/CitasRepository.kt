package com.example.appmvvm.data

import com.example.appmvvm.data.model.CitasModel
import com.example.appmvvm.data.model.ProveedorCitas
import com.example.appmvvm.data.network.CitasService
import javax.inject.Inject

class CitasRepository @Inject constructor(private val api : CitasService, private val proveedorCitas: ProveedorCitas){

    //sin inyeccion
    //private val api = CitasService()

    suspend fun getAllCitas():List<CitasModel>{
        val response = api.getCitas()
        proveedorCitas.citas=response
        return response
    }
}