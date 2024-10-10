package org.example.ej6

import org.example.Console
import kotlin.random.Random

// Escribe una función que simule una batalla. El daño crítico se hace
// cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
// "¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
// solo devuelve el daño normal.

fun ejercicio6() {

    var ataque: Int

    repeat(5){
        ataque = Random.nextInt(1,100)
        if (ataque == 1){
            Console.writeText("Se hizo ${critDmg(ataque)} punto de daño")
        }
        else{
            Console.writeText("Se hicieron ${critDmg(ataque)} puntos de daño")
        }
    }
}

fun critDmg(dmg: Int): Int{
    if (dmg >= 50){
        Console.writeText("¡GOLPE CRÍTICO!")
        return dmg * 2
    }
    return dmg
}