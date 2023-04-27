package br.com.plantier.collections

fun main() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Lina", "Fran", "Valdo", "Carlos")
    val assistiramCursoKotlin = mutableSetOf("Lina", "Lari", "Joao")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)
}