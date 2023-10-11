package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main() {

    val a1 = Account()
    val a2 = Account()

    a1.balance = 100.0
    a2.balance = 1_000_000.000
    
    println(a1.balance)
    println(a2.balance)


}