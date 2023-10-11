package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.Functions

fun main(){
    //sayHello("Syd", 15)
    //sayHello("Raabe", 28)
    val r = calculate(20, 10)
    println(r)
}

fun sayHello(name: String, temp: Int){
    println("Salve $name!! A temperatura é $temp°!!")
}

private fun calculate(a: Int, b: Int): Int {
    return a + b
}