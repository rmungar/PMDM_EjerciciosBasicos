package org.example

object Console {
    fun writeText(text: String = "", lineBreak: Boolean = true) {
        if (lineBreak){
            println(text)
        }
        else{
            print(text)
        }
    }

    fun getInput(): String {
        return readln()
    }
}