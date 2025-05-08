package org.utl.introkotlin_901.TemasKotlin

fun main() {

    /*
    *list, MutableList
    * set, MutableSet
    * map, MutableMap
    * */

    var readonlyList: List<String> =
        listOf("lunes ", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
    println(readonlyList)
    println("el primer dia es ${readonlyList[0]}")
    println("el primer dia es ${readonlyList.first()}")
    println("el primer dia es ${readonlyList.count()}")
    println("el primer dia es ${readonlyList.size}")
    println("martes " in readonlyList)

    var figuras: MutableList<String> = mutableListOf("circulo", "cuadrado", "triangulo")
    println(figuras)
    figuras.add("pentagono")
    println(figuras)
    figuras.removeAt(0)
    println(figuras)
    figuras.remove("cuadrado")
    /*************************************************************/

    val readOnlyFrutas = mapOf("manzana" to 1500, "platano" to 2000, "sandia" to 2500)
    println(readOnlyFrutas)
    println(readOnlyFrutas["manzana"])
    println(readOnlyFrutas.keys)
    println(readOnlyFrutas.values)

}
