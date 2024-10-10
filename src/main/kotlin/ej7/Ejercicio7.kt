package org.example.ej7




// Crea un programa que simule el combate entre dos personajes. Cada
// uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
// ataca a B y viceversa, restando vida. El combate termina cuando uno de
// los personajes tiene 0 o menos de vida.


fun ejercicio7(){

    val juego = Juego()


    val pj1 = Personaje("PACO", 100)
    val pj2 = Personaje("FRAN", 100)

    juego.comenzarJuego(pj1, pj2)

}