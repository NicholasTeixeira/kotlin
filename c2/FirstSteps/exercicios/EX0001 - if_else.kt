package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.FirstSteps.exercicios

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    print("Bom dia, digite aqui seu nome: ")
    val name = readln()

    println("Ok $name, vamos praticar ir e else então")

    print("Digite um numero: ")
    var n1 = scanner.nextInt()


    if (n1 > 10){
        n1 = 10
        println("O valor informado não era igual ou menor q 10, alterei ele e agora é: $n1!!")
    }
    val n1xn1 = n1 * n1
    println("Resultado $n1xn1")
    println("Obrigado")
}