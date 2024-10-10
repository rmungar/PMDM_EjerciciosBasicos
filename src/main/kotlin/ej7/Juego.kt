package org.example.ej7

class Juego {

    fun comenzarJuego(pj1: Personaje, pj2: Personaje) {

        var ronda = 0
        var dmg: Int
        val orden = listOf(pj1, pj2).shuffled()

        while (pj1.getVivo() && pj2.getVivo()) {

            println("\n-- Ronda: $ronda --")

            dmg = orden[0].ataque()
            orden[1].recivirDmg(dmg)
            println("${orden[1].nombre} ha recivido $dmg puntos de daño (hp: ${orden[1].vida})")

            if (orden[1].getVivo()){
                dmg = orden[1].ataque()
                orden[0].recivirDmg(dmg)
                println("${orden[0].nombre} ha recivido $dmg puntos de daño (hp: ${orden[0].vida})")
                ronda ++
            }

        }

        if (pj1.getVivo()) {
            println("\nHA GANADO ${pj1.nombre} EN LA RONDA: $ronda!!!")
        }
        else{
            println("\nHA GANADO ${pj2.nombre} EN LA RONDA: $ronda!!!")
        }

    }

}