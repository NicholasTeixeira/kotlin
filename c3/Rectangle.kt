package curso.kotlin.devsyd.estudoskotlin.kotlin.c3

import java.lang.reflect.Array.set

fun main(){

    val r1 = Rectangle(10,3)
    r1.width = 10
    println(r1.width)
    println(r1.height)
    println(r1.surface)
}

class Rectangle(
    width: Int, height: Int
) {
    var width : Int = width
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var height : Int = height
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    val surface get() = width * height
}