package org.example.ej4

import org.example.Console


// Escribe un programa que simule recoger monedas. El programa debe
// tener un bucle que repita 10 veces, sumando 5 monedas en cada
// iteración, e imprimiendo el número de monedas en cada paso.

fun ejercicio4(){

    var numeroMonedas = 0

    repeat(10){
        numeroMonedas += 5
        Console.writeText("Se han recogido $numeroMonedas monedas.")
    }

}