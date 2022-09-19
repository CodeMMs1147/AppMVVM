package com.example.appmvvm.data.network

import com.example.appmvvm.data.model.CitasModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiClientCitas {
    @GET("/.json")
    suspend fun getAllCitas():Response<List<CitasModel>>
}