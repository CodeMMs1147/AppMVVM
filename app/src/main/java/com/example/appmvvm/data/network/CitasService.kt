package com.example.appmvvm.data.network

import com.example.appmvvm.core.RetrofitHelper
import com.example.appmvvm.data.model.CitasModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CitasService @Inject constructor(private val api: ApiClientCitas){

    //private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCitas():List<CitasModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllCitas()
            response.body() ?: emptyList()
        }
    }
}