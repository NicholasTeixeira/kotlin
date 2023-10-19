package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main() {

    println(Math.sum(20, 8)) //Dentro do Companion object pode acessar direto na classe.
    println(Math().sub(20, 8)) //Dora do CO é preciso instaciar a classe primeiro.

}

class Math {

    fun sub(a: Int, b: Int) = a - b
    companion object{
    //dentro do CO não pode acessar nada que tenha haver com instancias da classe, como por exemplo os parametros de classe.
        fun sum(a: Int, b: Int) = a + b

    }

}