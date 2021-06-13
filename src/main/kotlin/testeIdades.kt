import kotlin.IntArray

fun main() {
    val idades: IntArray = intArrayOf(25, 30, 21, 17)

    var maiorIdade = Int.MIN_VALUE // garante que qualquer valor inteiro vai ser maior que maiorIdade
    for (idade in idades) { // estrutura da linguagem, loop
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE // garante que qualquer valor inteiro vai ser menor que menorIdade
    idades.forEach { idade -> if (idade < menorIdade) { menorIdade = idade }} // forEach é uma função pronta,
                                                                        // recebe um parâmetro e executa um código

    println(menorIdade)
}