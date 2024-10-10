package org.example.ej5

import org.example.Console


// Crea un programa que pida el nivel de un personaje. Si el nivel es menor
// a 10, debe imprimir "Personaje principiante". Si es entre 10 y 20,
// "Personaje intermedio". Si es mayor a 20, "Personaje avanzado".

fun ejercicio5(){

    Console.writeText("Ingrese el nivel del personaje.")
    Console.writeText("> ", false)
    val nivel = Console.getInput()

    Console.writeText()

    try {
        if (nivel.toInt() < 0){
            Console.writeText("Ni siquiera creaste el personaje.")
        }
        else {
            when (nivel.toInt()) {

                in 0..10 -> {
                    Console.writeText("Personaje principiante")
                }

                in 10..20 -> {
                    Console.writeText("Personaje intermedio.")
                }

                else -> {
                    Console.writeText("Personaje avanzado.")
                }

            }
        }
    }
    catch (e: NumberFormatException){
        Console.writeText("Lo ingresado no era un número.")
    }
}