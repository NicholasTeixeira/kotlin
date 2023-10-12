package curso.kotlin.devsyd.estudoskotlin.kotlin.c3.ex001

class Person(
    val initialDistanceToWater: Int = 5000
)
{
    var distance = 0
    var distanceToWater = initialDistanceToWater
    fun walk() {
        if (distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }
    fun drinkWater() {
        distanceToWater = 5000
    }
    fun end(): Int {
        return distance
    }
}