package com.example.appmvvm.core

import com.example.appmvvm.data.network.ApiClientCitas
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//este objeto provee dependencias de librerias o clases con interfaces

@Module
@InstallIn(SingletonComponent::class) //activity
object NetworkModule {

    //indicamos que use el patron de diseño singleton para que no cree muchas instancias en muchas clases, sino solo una en muchas clases
    @Singleton
    //provee retrofit
    @Provides
    fun proveerRetrofit():Retrofit{
        return  Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun proveerApiClientCitas(retrofit: Retrofit):ApiClientCitas{
        return retrofit.create(ApiClientCitas::class.java)
    }
}