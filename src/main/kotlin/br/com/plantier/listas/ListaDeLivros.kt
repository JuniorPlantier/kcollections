package br.com.plantier.listas

fun main() {
    val livro1 = Livro(
        titulo = "Código da Vinci",
        autor = "Dan Brow",
        anoPublicacao = 2005
    )

    val livro2 = Livro(
        titulo = "O Pequeno Principe",
        autor = "Antony",
        anoPublicacao = 1990,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Com Amor Simon",
        autor = "Machado de Assis",
        anoPublicacao = 1890
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    //                               é uma lista mutavel de...
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Harry Potter e a Pedra Filosofal",
            autor = "J.k.Rowling",
            anoPublicacao = 2001
        )
    )

    livros.remove(livro1)
    livros.imprimeComMarcadores()
}

fun MutableList<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString("\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ##### Lista de Livros ##### \n$textoFormatado")
}