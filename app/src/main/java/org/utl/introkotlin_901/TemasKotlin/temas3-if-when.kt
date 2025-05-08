package org.utl.introkotlin_901.TemasKotlin

fun main(){
    val d:Int
    val e=true
    if (e){
        d=1

    }else{
        d=2
    }
    println(d)
    val numero= if (e)1 else 2
    println(numero)

    ///--------------------------
    println("ingrese el sueldo del empleado: ")
    val sueldo= readln().toDouble()
    if(sueldo>3000){
        println("debe pagar impuestos")
    }else{
        println("no debe pagar impuestos")
    }

    ///----------------------------------
    val objeto: Any="hola"
    when(objeto){
        "1"-> println("es un uno")
        "hola"-> println("es un saludo")
        is String-> println("es un string")
        else-> println("no se que es ")

    }

    //range
    1..4//1.2,3
    4 downTo 1
    1 .. 10 step 2









}