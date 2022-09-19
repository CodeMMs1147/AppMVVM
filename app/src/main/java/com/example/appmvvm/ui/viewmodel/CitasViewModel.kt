package com.example.appmvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appmvvm.data.model.CitasModel
import com.example.appmvvm.data.model.ProveedorCitas
import com.example.appmvvm.domain.CasoDeUsoCitaRandom
import com.example.appmvvm.domain.CasosDeUsoCitas
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitasViewModel @Inject constructor(private val getCasoDeUsoCita: CasosDeUsoCitas, private val numeroRandom: CasoDeUsoCitaRandom) : ViewModel() {

    val citasModel = MutableLiveData<CitasModel>()
    val cargando = MutableLiveData<Boolean>()

    /*sin inyeccion de dependencias
    var getCasoDeUsoCita = CasosDeUsoCitas()
    var numeroRandom = CasoDeUsoCitaRandom()

     */

    fun onCreate() {
        viewModelScope.launch {
            cargando.postValue(true)
            val result = getCasoDeUsoCita()

            if (!result.isNullOrEmpty()){
                citasModel.postValue(result[0])
                cargando.postValue(false)
            }
        }
    }

    fun citaRandom(){
        cargando.postValue(true)
        val cita = numeroRandom()
        if(cita!=null){
            citasModel.postValue(cita)
        }
        cargando.postValue(false)
    }

}