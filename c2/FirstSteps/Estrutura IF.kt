package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.FirstSteps

import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    print("Qual a temperatura hoje?")
    val temp = scanner.nextInt()

    if (temp > 25){
        println("Está calor")
    }
    else {
        println("Está fresquinho")
    }
    println("Fim do Programa")
}