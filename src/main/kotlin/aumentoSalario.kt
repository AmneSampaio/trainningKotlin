fun main() {
    var salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3.000, 4.000)

    var aumento: Double = 1.1
    var indice: Int = 0

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