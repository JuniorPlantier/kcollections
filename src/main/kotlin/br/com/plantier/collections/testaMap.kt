package br.com.plantier.collections

fun testaMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 89.56),
        3 to 155.60
    )
    println(pedidos)

    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }

    for(p in pedidos) {
        println("Nro do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
        println()
    }

    pedidos[4] = 70.0
    pedidos.put(5, 89.90)
    pedidos[1] = 27.0
    pedidos.putIfAbsent(6, 155.50) // só add se o pedido nao existe
    pedidos.putIfAbsent(6, 175.75)

    println(pedidos)

    pedidos.remove(4)
    pedidos.remove(4, 69.0)
    println(pedidos)
}