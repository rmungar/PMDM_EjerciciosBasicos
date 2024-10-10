package org.example

import org.example.ej1.ejercicio1
import org.example.ej10.ejercicio10
import org.example.ej2.ejercicio2
import org.example.ej3.ejercicio3
import org.example.ej4.ejercicio4
import org.example.ej5.ejercicio5
import org.example.ej6.ejercicio6
import org.example.ej7.ejercicio7
import org.example.ej8.ejercicio8
import org.example.ej9.ejercicio9

class Menu {

    fun mostrarMenu(){
        Console.writeText("-- LISTA DE EJERCICIOS --")

        Console.writeText("1 - EJERCICIO 1")
        Console.writeText("2 - EJERCICIO 2")
        Console.writeText("3 - EJERCICIO 3")
        Console.writeText("4 - EJERCICIO 4")
        Console.writeText("5 - EJERCICIO 5")
        Console.writeText("6 - EJERCICIO 6")
        Console.writeText("7 - EJERCICIO 7")
        Console.writeText("8 - EJERCICIO 8")
        Console.writeText("9 - EJERCICIO 9")
        Console.writeText("10 - EJERCICIO 10")
        Console.writeText("0 - SALIR")
        Console.writeText()
        Console.writeText("Ingrese el número del ejercicio que desee ver")
        Console.writeText("> ", false)

    }

    fun recogerEntrada(): Int?{
        return Console.getInput().toIntOrNull()
    }

    fun funcionar(){

        while (true){
            mostrarMenu()
            val entrada = recogerEntrada()

            when(entrada){
                1 -> {
                    ejercicio1()
                }
                2 -> {
                    ejercicio2()
                }
                3 -> {
                    ejercicio3()
                }
                4 -> {
                    ejercicio4()
                }
                5 -> {
                    ejercicio5()
                }
                6 -> {
                    ejercicio6()
                }
                7 -> {
                    ejercicio7()
                }
                8 -> {
                    ejercicio8()
                }
                9 -> {
                    ejercicio9()
                }
                10 -> {
                    ejercicio10()
                }
                0 -> {
                    break
                }
                else -> {
                    Console.writeText("El número ingresado no se corresponde con ningún ejercicio.")
                }
            }
            Thread.sleep(2000)
            repeat(10){
                Console.writeText()
            }
        }
    }
}