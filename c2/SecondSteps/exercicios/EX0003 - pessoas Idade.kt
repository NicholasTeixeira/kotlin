package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.SecondSteps.exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Qual o seu nome? ")
    val name = readln()

    print("Qual a sua idade? ")
    val y = scanner.nextInt()
    println()
    /*
    CRIAÇA: 0 - 12
    ADOLESCENTE: 13 - 17
    ADULTO: 18 - 65
    SÊNIOR: 66 OU MAIOR
     */
    val p: String

    if (y >= 0 && y <= 12){
        p = "Criança"
    }
    else if (y >= 13 && y <= 17){
        p = "Adolescente"
    }
    else if (y >= 18 && y <= 65){
        p = "Adulto"
    }
    else if (y >= 66 && y <=130){
        p = "Sênior"
    }
    else {
        p = "Invalido"
    }

    println("$name você é $p!")
    println()
    println("Fim do Programa!")

}