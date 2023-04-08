package br.com.plantier.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    //val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    val salarios = bigDecimalArrayOf("1890.89", "2100.00", "4100.00", "7650.98", "14000.00")

    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    // a função map, serve para mapear os valores de um valor para o outro
    val salariosComAumento: Array<BigDecimal> =
            salarios
                .map{ salario -> salariosAumentoRelativo(salario, aumento) }
                .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    // o fold é parecido com a função reduce, a diferença é que o fold recebe um valor inicial
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    // calcula a média dos 3 salários mais altos
    val media = salariosComAumento
            .sorted()
            .takeLast(3)
            .toTypedArray()
            .media()
    println(media)
}

private fun salariosAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

