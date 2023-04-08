package br.com.plantier.arrays

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie) {
        print("$s ")
    }
    println("======")

    val nrosPares = 2.until(100) step 2
    for(nro in nrosPares) {
        print("$nro ")
    }
    println("======")

    val nroParesReverso = 100 downTo 0 step 2
    nroParesReverso.forEach{ print("$it ") }
    println("======")

    val intervalo = 1500.0..15000.0
    val salario = 4500.0
    if(salario in intervalo) {
        println("esta dentro do intervalo")
    } else {
        println("não esta dentro do intervalo")
    }
    println("======")

    val alfabeto = 'a'..'z'
    val letra = 'k'
    print(letra in alfabeto)
}