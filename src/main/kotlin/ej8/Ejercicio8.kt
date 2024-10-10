package org.example.ej8




// Crea un programa que simule un inventario de un personaje usando una
// lista. El personaje puede añadir un objeto al inventario, eliminarlo o
// mostrar los objetos actuales.

fun ejercicio8(){

    val pj = PersonajeConInventario("Loko")

    val item1 = Objetos("Pico", 0)
    val item2 = Objetos("Pala", 2)
    val item3 = Objetos("Pesas", 100)


    pj.addToInventory(item1)
    pj.addToInventory(item2)
    pj.addToInventory(item3)

    pj.addToInventory(item1)

    pj.addToInventory(item2)
}