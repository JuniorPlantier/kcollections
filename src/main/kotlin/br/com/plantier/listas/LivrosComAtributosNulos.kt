package br.com.plantier.listas

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida" } // return: Map<K, List<T>; Elvis Operator, usado para aribuir um valor para o null
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo } }")
        }
}