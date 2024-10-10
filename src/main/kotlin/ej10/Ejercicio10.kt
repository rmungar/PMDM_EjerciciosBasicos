package org.example.ej10

import org.example.Console


// Crea un programa que simule un ataque en equipo. Cada miembro del
// equipo tiene un daño diferente y todos atacan a un enemigo con vida
// inicial de 500. El programa debe restar la suma de los ataques de todos
// los miembros al enemigo hasta que su vida sea 0 o menor.

fun ejercicio10(){

    Console.writeText("Ingrese el número de integrantes deseados.")
    Console.writeText("> ", false)
    val numero = Console.getInput()

    val integrantes = mutableListOf<Integrante>()
    var vidaJefe = 500
    var ronda = 1
    try{
        repeat(numero.toInt()){
            integrantes.add(
                Integrante()
            )
        }

        while (vidaJefe > 0){
            var numeroIntegrante = 1
            Console.writeText("-- RONDA $ronda --")
            for(integrante in integrantes){
                val dmg = integrante.ataque()
                vidaJefe -= dmg
                Console.writeText("¡EL INTEGRANTE NUMERO $numeroIntegrante HA HECHO $dmg PUNTOS DE DAÑO AL JEFE!")
                if(vidaJefe <= 0){
                    break
                }
                numeroIntegrante++
            }
            if(vidaJefe < 0){
                Console.writeText("VIDA DEL JEFE: 0")
            }
            else{
                Console.writeText("VIDA DEL JEFE: $vidaJefe")
            }
            Thread.sleep(750)
            Console.writeText()
            ronda ++
        }
        Console.writeText("¡¡EL JEFE HA SIDO ELIMINADO!!")
    }
    catch (e:NumberFormatException){
        println("Lo ingresado no era un número.")
    }
}