package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main() {

    val a1 = Account("1234-001", "Nicholas Diogo Teixeira de Jesus Silva")
    val a2 = Account("1234-002", "Raabe Bitencourt de Jesus Teixeira")

    a1.deposit(100.00)
    a2.deposit(1000000.00)

    a1.print()
    a2.print()
}
