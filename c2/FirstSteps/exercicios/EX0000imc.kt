package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.FirstSteps.exercicios

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

}