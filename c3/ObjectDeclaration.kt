package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main() {

    println(Math2.sum(2,3))
    println(Math2.sub(2,1))
    println(Math2.pi)
}

object Math2 {

    val pi = 3.1416
    fun sub(a: Int, b: Int) = a - b
    fun sum(a: Int, b: Int) = a + b

    }