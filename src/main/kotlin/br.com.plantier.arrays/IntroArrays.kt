package br.com.plantier.arrays

fun main() {
    val idades: IntArray = intArrayOf(18, 34, 22, 32, 38, 41)

    var maiorIdade = Int.MIN_VALUE
    for(idade in idades) {
        if(idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if(menorIdade > idade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}