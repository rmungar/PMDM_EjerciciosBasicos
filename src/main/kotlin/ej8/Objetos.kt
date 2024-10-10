package org.example.ej8

import kotlin.random.Random

data class Objetos(val nombre: String, var peso: Int) {

    init {
        if (peso == 0) {
            peso = Random.nextInt(1,100)
        }
    }


    override fun toString(): String {
        return "Nombre: $nombre - Peso: $peso kg"
    }

}