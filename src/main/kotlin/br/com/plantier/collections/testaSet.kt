package br.com.plantier.collections

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Lina", "Fran", "Valdo", "Carlos")
    val assistiramCursoKotlin = mutableSetOf("Lina", "Lari", "Joao")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Lina")
    println(assistiramList)
    println(assistiramList.toSet())
}