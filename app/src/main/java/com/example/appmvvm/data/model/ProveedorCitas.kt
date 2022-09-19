package com.example.appmvvm.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProveedorCitas @Inject constructor(){

    //sin inyeccion
    //companion object {

        var citas:List<CitasModel> = emptyList()

        /*
        //se crea una funcion que devuelve el private por estar dentro de companion ambos
        fun random(): CitasModel {
            val position = (0..10).random()
            //asignamos position a la posicion de la cita y la devolvemos
            return quote[position]
        }

        private val quote = listOf<CitasModel>(
            CitasModel(
                cita = "No es un error. ¡Es una característica no documentada!",
                autor = "Anonimo"
            ),
            CitasModel(
                cita = "“Software Developer” – An organism that turns caffeine into software",
                autor = "Anonimo"
            ),
            CitasModel(
                cita = "Si la depuración es el proceso de eliminación de errores de software, entonces la programación debe ser el proceso de ponerlos",
                autor = "Edsger Dijkstra"
            ),
            CitasModel(
                cita = "Una interfaz de usuario es como una broma. Si tienes que explicarlo, no es tan bueno..",
                autor = "Anonimo"
            ),
            CitasModel(
                cita = "¡No me importa si funciona en tu máquina! ¡No estamos contratando su máquina!",
                autor = "Vidiu Platon"
            ),
            CitasModel(
                cita = "Medir el progreso de la programación por líneas de código es como medir el progreso de la construcción de aviones por peso.",
                autor = "Bill Gates"
            ),
            CitasModel(
                cita = "Mi código NO funciona, no tengo idea de por qué. Mi código FUNCIONA, no tengo idea de por qué.",
                autor = "Anonimo"
            ),
            CitasModel(cita = "Las cosas no siempre son #000000 y #FFFFFF", autor = "Anonimo"),
            CitasModel(cita = "Hablar es barato. Muéstrame el código.", autor = "Linus Torvalds"),
            CitasModel(
                cita = "El software y las catedrales son muy parecidos: primero los construimos, luego rezamos.",
                autor = "Anonimo"
            ),
            CitasModel(cita = "Me comere Android !.", autor = "CodeMMs1147")
        )
        */
    //}
}