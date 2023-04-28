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

fun testaComportamentosMap() {

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

    println(pedidos - 6)
    println(pedidos - listOf(2, 3))

    // comportamentos de escritas
//    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 10.0, 8 to 115.15, 8 to 115.15)) // poderia ser um listOf, pois é uma Collection
    pedidos += setOf<Pair<Int, Double>>(7 to 10.0, 8 to 115.15, 8 to 115.15, 9 to 115.15)
    pedidos.keys.remove(1)
    pedidos.values.remove(115.15) // remove apenas o primeiro valor encontrado
    pedidos -= 6 // remove a cahve 6
    println(pedidos)
}

fun associacaoEAgrupamento() {
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

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Lina", "Maria", "Mario", "Valdo", "FePires", "Horacio", "Lari", "LeBron")
    val agenda: Map<Char, List<String>> = nomes.groupBy {
        it.first()
    }
    println(agenda)
    println(agenda['L'])
}

data class Pedido(val numero: Int, val valor: Double)