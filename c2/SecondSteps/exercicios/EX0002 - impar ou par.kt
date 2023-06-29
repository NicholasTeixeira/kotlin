package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.SecondSteps.exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("> ")
    val n1 = scanner.nextInt()

    if (n1 % 2 == 0) {
        println("O número é par!")
    }
    else {
        println("O número é impar!!")
    }
    println("Fim do Programa")
}