package org.example.ej3

import org.example.Console


// Escribe una función llamada multiplicarAtaques que tome un número
// entero como argumento y lo multiplique por 5. Usa esa función para
// calcular y mostrar el daño total de 3 ataques.

fun ejercicio3(){

    Console.writeText("El primer ataque ha hecho: ${multiplicarAtaques(3)} puntos de daño!")
    Console.writeText("El segundo ataque ha hecho: ${multiplicarAtaques(4)} puntos de daño!")
    Console.writeText("El tercer ataque ha hecho: ${multiplicarAtaques(5)} puntos de daño!")
}


fun multiplicarAtaques(damage: Int): Int{
    return damage * 5
}
