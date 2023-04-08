package br.com.plantier.listas

fun main() {
    val prateleira: Prateleira = Prateleira("literatura", listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAno()

    porAutor.imprimeComMarcadores()
    porAno.imprimeComMarcadores()
    /* agora estamos apontando para objetos novos, pois a List é imutavel */
}