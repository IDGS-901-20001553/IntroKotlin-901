package org.utl.introkotlin_901.TemasKotlin


fun main() {
    var niveles: Int

    do {
        print("Ingrese el numero de asteriscos para fromar su piramide : ")
        niveles = readLine()?.toIntOrNull() ?: 0

        var i = 1
        do {
            var j = 1
            do {
                print("*")
                j++
            } while (j <= i)
            println()
            i++
        } while (i <= niveles)

    } while (niveles != 0)

    println("Programa terminado.")
}




