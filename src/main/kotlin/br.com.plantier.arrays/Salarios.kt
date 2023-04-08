package br.com.plantier.arrays

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.89, 5897.54, 6000.0, 9654.65, 7500.0)

    val aumento = 1.1
    for (indice in salarios.indices) {
        salarios[indice] =  salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())

/* O Double não é o tipo ideal para trabalhar com valores de moeda, pois ele trabalha realizando aproximações
   para salvar os números, e isso pode interferir no resultado esperado de uma operação.
*/
}