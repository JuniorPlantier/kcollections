package br.com.plantier.listas

fun main() {
    val banco = BancoDeDados()
//    banco.nomes.add("Lina")
    banco.salvar("Lina")

    println(banco.nomes)
}

class BancoDeDados {
    // a gente não pode fazer com que qualquer um consiga manipular nossa coleção
    private val dados = mutableListOf<String>()

    val nomes: Collection<String> get() = dados

    fun salvar(nome: String) {
        dados.add(nome)
    }
}

fun testaColecao() {
    // Iterable > Collection > List
    val nomes: List<String> = listOf("Lina", "Lari", "Carlao", "Valdir", "Fatima", "Vera Lucia")

    for(nome in nomes) {
        println(nome)
    }
    println("Tem o nome Lina? ${nomes.contains("Lina")}")
    println("Tamanho da coleção: ${nomes.size}")
}