package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.ValoresNulos

fun main (){
    println(
        readln()
            .toIntOrNull()
            ?: 2
            .times(2)
            .times(2)
            .minus(10)
    )
}