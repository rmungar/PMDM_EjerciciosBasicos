package org.example.ej9

import org.example.Console
import kotlin.random.Random

// Escribe un programa que simule el sistema de experiencia de un
// personaje. Cada vez que gane una batalla, aumenta su experiencia en
// 50 puntos. Al llegar a 200 puntos o más, sube de nivel.

fun ejercicio9(){

    Console.writeText("Ingrese el número de batallas deseadas.")
    Console.writeText("> ", false)
    val batallas = Console.getInput()

    Console.writeText()

    var nivel = 0
    var exp = 0
    try{
        var cont = 1
        repeat(batallas.toInt()){

            val winOrLose = Random.nextBoolean()
            Console.writeText("-- BATALLA $cont --")
            if (winOrLose){
                exp += 50
                Console.writeText("¡HAS GANADO 50 PUNTOS DE EXPERIENCIA!")
            }
            else{
                Console.writeText("PERDISTE LA BATALLA..")
            }
            Console.writeText()
            if (exp == 200){
                nivel++
                exp = 0
                Console.writeText("¡HAS SUBIDO AL NIVEL $nivel!")
            }
            cont ++
        }
    }
    catch (e: NumberFormatException){
        Console.writeText("Lo ingresado no era un número.")
    }

}