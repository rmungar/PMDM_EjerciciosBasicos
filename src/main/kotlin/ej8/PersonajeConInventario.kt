package org.example.ej8

import org.example.Console
import org.example.ej7.Personaje
import kotlin.random.Random


class PersonajeConInventario(val nombre: String) {


    private val _inventario: MutableList<Objetos> = mutableListOf()

    fun addToInventory(objeto: Objetos) {
        _inventario.add(objeto)
        Console.writeText("${objeto.nombre} ha sido añadido al inventario.")
    }

    fun removeFromInventory(objeto: Objetos) {

        if (_inventario.contains(objeto)) {
            _inventario.remove(objeto)
            Console.writeText("${objeto.nombre} ha sido eliminado del inventario.")
        }
        else{
            Console.writeText("Ese objeto no se encuentra en el inventario.")
        }

    }

    fun showInventory(){

        Console.writeText("-- INVENTARIO DE ${nombre.uppercase()} --\n")
        _inventario.forEach {
            Console.writeText(it.toString())
        }
    }

}