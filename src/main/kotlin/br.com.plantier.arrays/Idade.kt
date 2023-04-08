package br.com.plantier.arrays

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 22, 33, 40, 42)

    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")
    
    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val mediaIdade: Double = idades.average();

    val todosMaioresDeIdade = idades.all { it >= 18 }
    println("Todos maiores? $todosMaioresDeIdade")

    val existeMaiorDeIdade = idades.any { it >= 18}
    println("Algum aluno é maior de idade? $existeMaiorDeIdade")

    // a função filter só deixa passar quem satisfazer uma condição
    val maioresDeIdade = idades.filter { it >= 18 }
    println("Maiores de Idade: $maioresDeIdade")

    // retorna um valor específico, o primeiro valor encontrado.
    val busca = idades.find{ it == 18}

}