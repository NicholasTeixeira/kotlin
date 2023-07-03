package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.SecondSteps.exercicios

fun main() {
    print("> ")
    val n = readln().toInt()

    var i = 1
    val m = 10
    while (i <= m) {
        println("$n X $i = ${n * i}")
        i++
    }

    println()

    for (x in 1..m)
        println("$n X $x = ${n * x}")
}