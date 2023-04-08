package br.com.plantier.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // BigDecimal, tem uma fórmula para garantir que os valores decimais são exatamente o que eles são
    // não é um tipo primitivo

    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    bigDecimalArrayOf("1890.89", "2100.00", "4100.00", "7650.98", "14000.00")

    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    // a função map, serve para mapear os valores de um valor para o outro
    val salariosComAumento: Array<BigDecimal> =
            salarios
                .map{ salario ->
                    if (salario < "5000".toBigDecimal()) {
                        salario + "500".toBigDecimal()
                    } else {
                        (salario * aumento).setScale(2, RoundingMode.UP)
                    }
                }
                .toTypedArray()
    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}