package br.com.plantier.listas

class Prateleira(
        val genero: String,
        val livros: MutableList<Livro>
) {

    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAno(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }


}