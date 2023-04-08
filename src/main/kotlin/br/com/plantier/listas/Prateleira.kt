package br.com.plantier.listas

class Prateleira(
        val genero: String,
        val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor } // retorna uma lista nova
    }

    fun organizarPorAno(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

}