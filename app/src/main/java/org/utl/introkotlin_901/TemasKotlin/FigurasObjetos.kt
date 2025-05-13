package org.utl.introkotlin_901.TemasKotlin

import kotlin.math.pow
import kotlin.math.tan

// Clase base Figura
class Figura(val tipo: String) {
    fun mostrarTipo() {
        println("Figura seleccionada: $tipo")
    }
}

// Clase Círculo
class Circulo(val radio: Double) {
    fun calcularArea(): Double {
        return 3.1416 * radio.pow(2)
    }
}

// Clase Cuadrado
class Cuadrado(val lado: Double) {
    fun calcularArea(): Double {
        return lado.pow(2)
    }
}

// Clase Pentágono
class Pentagono(val lado: Double) {
    fun calcularArea(): Double {
        return (5 * lado.pow(2)) / (4 * tan(3.1416 / 5))
    }
}

// Clase Triángulo
class Triangulo(val base: Double, val altura: Double) {
    fun calcularArea(): Double {
        return (base * altura) / 2
    }
}

// menú
class Menu {
    fun mostrarMenu() {
        var seleccion: Int

        do {
            println("\nEscoja su opción de figura para calcular su área:")
            println("1. Círculo")
            println("2. Cuadrado")
            println("3. Pentágono")
            println("4. Triángulo")
            println("5. Salir")
            print("Seleccione su tipo de figura: ")
            seleccion = readLine()?.toIntOrNull() ?: 0

            when (seleccion) {
                1 -> {
                    print("Ingrese el radio del círculo: ")
                    val radio = readLine()?.toDoubleOrNull() ?: 0.0
                    val figura = Figura("Círculo")
                    figura.mostrarTipo()
                    val circulo = Circulo(radio)
                    println("El área del círculo es: ${circulo.calcularArea()}")
                }
                2 -> {
                    print("Ingrese el lado del cuadrado: ")
                    val lado = readLine()?.toDoubleOrNull() ?: 0.0
                    val figura = Figura("Cuadrado")
                    figura.mostrarTipo()
                    val cuadrado = Cuadrado(lado)
                    println("El área del cuadrado es: ${cuadrado.calcularArea()}")
                }
                3 -> {
                    print("Ingrese el lado del pentágono: ")
                    val lado = readLine()?.toDoubleOrNull() ?: 0.0
                    val figura = Figura("Pentágono")
                    figura.mostrarTipo()
                    val pentagono = Pentagono(lado)
                    println("El área del pentágono es: ${pentagono.calcularArea()}")
                }
                4 -> {
                    print("Ingrese la base del triángulo: ")
                    val base = readLine()?.toDoubleOrNull() ?: 0.0
                    print("Ingrese la altura del triángulo: ")
                    val altura = readLine()?.toDoubleOrNull() ?: 0.0
                    val figura = Figura("Triángulo")
                    figura.mostrarTipo()
                    val triangulo = Triangulo(base, altura)
                    println("El área del triángulo es: ${triangulo.calcularArea()}")
                }
                5 -> println("Se salio del programa")
                else -> println("opcion incorrecta")
            }
        } while (seleccion != 5)
    }
}

// Función principal
fun main() {
    val calculoFinal = Menu()
    calculoFinal.mostrarMenu()
}