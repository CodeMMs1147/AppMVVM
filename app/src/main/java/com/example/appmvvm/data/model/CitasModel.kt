package com.example.appmvvm.data.model

import com.google.gson.annotations.SerializedName

data class CitasModel(@SerializedName("quote") val cita:String, @SerializedName("author") val autor:String)
