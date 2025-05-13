package org.utl.introkotlin_901.TemasKotlin

fun saludo(){
    return println("Hola mundo")
}
/*return oara que regrese indica que tipo de datos regresa */
fun sum(x:Int, y: Int): Int{
    return x+y

}
/*funciones de linea omites return solo funciona cuando solo tiene una ejcucion de una linea */
fun sum2(x: Int, y: Int)= x+y


fun main(){
    saludo()
    println("----------------------------------------------------------------------------"+
            "")
    println(sum(2,3))
    println(sum2(2,3))
}