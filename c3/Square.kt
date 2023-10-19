package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main(){

    val s1 = Square(10)
    val s2 = Square(20)
    val s3 = Square(30)
}

class Square (val size: Int){
    init {
        println("Init 1")
        require(size > 0)
    }
}
