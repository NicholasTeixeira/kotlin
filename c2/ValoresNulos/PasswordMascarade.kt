package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.ValoresNulos

fun main () {
    val password: String? = "5156nick"
    val defaultPassword = "1234"
    val mask = "".padEnd((password ?: defaultPassword).length,'*')

    println(password)
    println(mask)
}