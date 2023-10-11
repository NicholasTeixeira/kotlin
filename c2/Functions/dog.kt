package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.Functions

fun main() {

    val age = readln().toDouble()
    val realAge =  dogAge(age)
    println(realAge)
}

private fun dogAge(age: Double): Double {
    return age * 7
}