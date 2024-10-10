package org.example.ej7

import kotlin.random.Random


class Personaje(val nombre: String, var vida: Int, val ataque: Int = Random.nextInt(1,10)) {


    private var vivo = true

    init {
        if (!(1..100).contains(vida)) {
            vida = 100
        }
    }


    fun ataque(): Int{
        return ataque
    }


    fun recivirDmg(dmg: Int){
        if (dmg >= vida){
            vida = 0
            vivo = false
        }
        else{
            if (vida - dmg < 0 ){
                vida = 0
                vivo = false
            }
            else{
                vida -= dmg
            }
        }
    }


    fun getVivo(): Boolean{
        return vivo
    }

}