package curso.kotlin.devsyd.estudoskotlin.kotlin.c2.Functions

fun main() {
    println(spaceString("Oi tudo em paz?", true))
}

fun spaceString(str: String, isUppercase: Boolean = false): String {
    var r = ""
    for (c in str) {
        r += "$c "
    }
    r = r.trim()

    if (isUppercase){
        r = r.uppercase()
    }
    return r
}