package br.com.plantier.collections

fun main() {

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 89.56),
        3 to 155.60,
        4 to 100.0,
        5 to 15.0,
        6 to 115.65
    )

    val pedido01 = pedidos.get(1)
//    val pedido02 = pedidos.getValue(5) // se o valor não existir ele retorna uma exception


    println(pedidos.getOrElse(1, {
        "Não tem o pedido"
    }))

    pedidos.getOrDefault(0, -1)

//    println(pedidos.keys)
    println(pedidos.values)

    for (nroPedido in pedidos.keys) {
        println("Pedido $nroPedido")
    }

    for (valor in pedidos.values) {
        println("Pedido $valor")
    }

    val pedidosFiltradors = pedidos.filter { (nro, valor) ->
        nro % 2 == 0 && valor > 100.0
    }
    println(pedidosFiltradors)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    val pedidosPares = pedidos.filterKeys { nro ->
        nro % 2 == 0
    }
}