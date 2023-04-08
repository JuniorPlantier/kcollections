package br.com.plantier.listas

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
            //.filter { it != null }
            .filterNotNull()
            .joinToString("\n") {
                " - ${it.titulo} de ${it.autor}"
            }
    println(" ##### Lista de Livros ##### \n$textoFormatado")
}

