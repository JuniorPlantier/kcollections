package br.com.plantier.collections

fun main() {
    // transformar coleções: dado um operação, devolver uma nova coleção baseando-se em outra.
    // utilizando associação

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 35.35),
        Pedido(3, 59.59),
        Pedido(4, 77.0)
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido.valor)
//        pedido.numero to pedido.valor
//    }
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido: Pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(7, 77.0)])
}

data class Pedido(val numero: Int, val valor: Double)