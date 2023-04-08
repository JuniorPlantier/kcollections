package br.com.plantier.listas

// a data classe é um tip especial de classes em Kotlin que forne além das caracteriscas normais de uma classe ela fornece algumas funções e métodos automáticamente para gente
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    // é um tipo de string nulavel, ou seja, qdo não tiver o dado eu quero q o objeto seja nulo
    val editora: String? = null
)

