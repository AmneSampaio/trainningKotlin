fun main() {

    val serie = 1.rangeTo(10)
    for (i in serie) { // o in no for tem mostra cada item da lista
        print("$i ")
    }

    println()

    val valorEscolhido = 4

    if (valorEscolhido in serie) {  // no if o in procura na serie
        println("Valor encontrado!")
    }


    serie.forEach {
        print("$it ")
    }
    println()
    val serieReversa = 100.downTo(0) step 2
    serieReversa.forEach {
        print("$it ")
    }


}