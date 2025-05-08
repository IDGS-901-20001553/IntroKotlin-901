package org.utl.introkotlin_901.TemasKotlin

import kotlin.math.pow

fun main(){

        var seleccion: Int

        do {
            println("escoja su opcion de figura para calcular su area:")
            println("1. Círculo")
            println("2. Cuadrado")
            println("3. Pentágono")
            println("4. Triángulo")
            println("5. Salir")
            print("Seleccione su tipo de figura : ")
            seleccion = readLine()?.toIntOrNull() ?: 0

            when (seleccion) {
                1 -> {
                    print("Ingrese el radio del círculo: ")
                    val radio = readLine()?.toDoubleOrNull() ?: 0.0
                    val area = 3.1416 * radio.pow(2)
                    println("El área del círculo es: $area")
                }
                2 -> {
                    print("Ingrese el lado del cuadrado: ")
                    val lado = readLine()?.toDoubleOrNull() ?: 0.0
                    val area = lado.pow(2)
                    println("El área del cuadrado es: $area")
                }
                3 -> {
                    print("Ingrese el lado del pentágono: ")
                    val lado = readLine()?.toDoubleOrNull() ?: 0.0
                    val area = (5 * lado.pow(2)) / (4 * kotlin.math.tan(3.1416 / 5))
                    println("El área del pentágono es: $area")
                }
                4 -> {
                    print("Ingrese la base del triángulo: ")
                    val base = readLine()?.toDoubleOrNull() ?: 0.0
                    print("Ingrese la altura del triángulo: ")
                    val altura = readLine()?.toDoubleOrNull() ?: 0.0
                    val area = (base * altura) / 2
                    println("El área del triángulo es: $area")
                }
                5 -> println("Saliendo")
                else -> println("Opción no valida.")
            }
        } while (seleccion != 5)

}