package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.SecondSteps.exercicios

import kotlin.random.Random

fun main() {

    val secret = Random.nextInt( 0, 101 )
    var playing = true
    var n = 0

    while (playing) {
        print("> ")
        n = readln().toInt()

        when {
            n > secret -> println("Numero sorteado é menor!")
            n < secret -> println("Numero sorteado é maior!")
            else -> playing = false
        }

    }
    println("Correto o numero era $n")
    println()
    println("Fim!")
}