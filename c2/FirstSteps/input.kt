package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.FirstSteps

import androidx.core.graphics.scaleMatrix
import java.util.Scanner

fun main() {
     print("Digite seu nome: ")
     val name = readln()
     println("olá $name, Seu nome invertido é ${name.reversed()}!!")
     print("Qual a sua idade: ")
     val idade = readln()
     println("Sua idade é $idade!")
     println("Seu nome é $name e sua idade é $idade!!")

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()
    print("> ")
    val n2 = scanner.nextInt()

    println("Soma = ${n1+n2}")
}