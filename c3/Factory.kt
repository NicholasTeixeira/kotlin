package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

fun main() {

    var car1 = Factory.newCar()
    var car2 = Factory.newCar()
    var car3 = Factory.newCar()

    println("Foram Ciados: ${Factory.instanceCount} Carros!!")
}
object Factory{

    var instanceCount = 0
    fun newCar(): Car {
        instanceCount++
        println("+ 1 Carro Criado!!")
        return Car()
    }
}
class Car