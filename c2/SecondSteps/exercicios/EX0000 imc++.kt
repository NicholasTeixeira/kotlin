package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.SecondSteps.exercicios

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Seja bem vindo ao calculo de IMC desenvolvido por CodeSmithSyd")
    print("Poderia me informar seu nome? -> ")
    val name = readln()

    print("Ok $name, agora pode me dizer sua idade? -> ")
    val idade = scanner.nextInt()

    print("Qual o seu Peso? -> ")
    val peso = scanner.nextFloat()

    print("Qual a sua Altura? -> ")
    val altura = scanner.nextFloat()

    val altxalt = altura * altura
    val imc = peso / altxalt
    //val imcr = imc.toInt()

    println("""Bem $name!
        |Sua idade é $idade!  
        |Seu IMC = $imc!""".trimMargin())

    val s = when (imc) {
        in 0.0..16.9 -> "Muiro abaixo do peso!"
        in 17.0..18.4 -> "Abaixo do peso"
        in 18.5..24.9 -> "Peso normal"
        in 25.0..29.9 -> "Acima do peso"
        in 30.0..34.9 -> "Obesidade I"
        in 35.0..40.0 -> "Obesidade II"
        in 40.0..100.0 -> "Obesidade III"
        else -> "Invalido"
    }
    println(s)
    println()
    println("Fim do Programa!")

}