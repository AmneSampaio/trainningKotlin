import kotlin.IntArray

fun main() {
    val idades = intArrayOf(25, 30, 21, 17)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
}