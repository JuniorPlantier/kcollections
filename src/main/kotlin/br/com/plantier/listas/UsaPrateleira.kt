package br.com.plantier.listas

fun main() {
    val prateleira: Prateleira = Prateleira("literatura", listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAno()

    porAutor.imprimeComMarcadores()
    porAno.imprimeComMarcadores()
    /* Ambas varáveis apontam para a mesma lista, por isso a impressão segue a mesma ordem */

    
}