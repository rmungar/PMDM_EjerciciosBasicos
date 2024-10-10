package org.example.ej10

import kotlin.random.Random


class Integrante(private val ataque: Int = Random.nextInt(1,10)) {


    private var vivo = true

    fun ataque(): Int{
        return ataque
    }

}