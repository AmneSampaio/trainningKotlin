fun main() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3.000, 4.000)

    val aumento = 1.1
    var indice = 0

    println(salarios.contentToString())

    // loop com for
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice ++
    }

    println(salarios.contentToString())

    // com forEachIndexed

    salarios.forEachIndexed { i, salario -> salarios[i] = salario * aumento}

    println(salarios.contentToString())
}