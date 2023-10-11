package curso.kotlin.devsyd.estudoskotlin.kotlin.c3.ex

fun main() {

    val g = CharGenerator(min = 'a', max = 'z')
    println(g.next())
    println(g.next())
    println(g.next())
}

class CharGenerator(

    val min: Char,
    val max: Char

) {
    fun next() = (min..max).random()
}