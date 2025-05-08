package org.utl.introkotlin_901.TemasKotlin

import kotlin.math.sqrt

fun main(){

    var A: Int
    var B: Int
    var C: Int

    println("ingreso los datos para calcular la formula general: ")
    print("ingreso el dato A :")
    A = readLine()?.toIntOrNull() ?: 0
    print("ingreso el dato b :")
    B = readLine()?.toIntOrNull() ?: 0
    print("ingreso el dato c :")
    C = readLine()?.toIntOrNull() ?: 0

    val discriminante = B * B - 4 * A * C

    if (A == 0) {
        println("El valor no puede llegar a 0")
    } else if (discriminante < 0) {
        println("La ecuación no tiene soluciones reales.")
    } else {
        val raiz = sqrt(discriminante.toDouble())
        val x1 = (-B + raiz) / (2 * A)
        val x2 = (-B - raiz) / (2 * A)

        println("Las soluciones de la ecuación son:")
        println("x1 = $x1")
        println("x2 = $x2")
    }






}