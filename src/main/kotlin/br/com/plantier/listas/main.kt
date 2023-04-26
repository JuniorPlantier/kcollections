package br.com.plantier.listas

fun main() {
    // Iterable > Collection > List
    val nomes: Collection<String> = listOf("Lina", "Lari", "Carlao", "Valdir", "Fatima", "Vera Lucia")

    for(nome in nomes) {
        println(nome)
    }
    println("Tem o nome Lina? ${nomes.contains("Lina")}")
    println("Tamanho da coleção: ${nomes.size()}")
}