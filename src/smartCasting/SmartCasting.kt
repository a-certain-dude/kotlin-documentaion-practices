package smartCasting

fun printObjectType(obj: Any) {
    when (obj) {
        is Int -> println("It's an Integer type with a value of $obj")
        !is Double -> println("It's not a Double type, has a value of $obj")
        else -> println("Unknown type")
    }
}

fun main() {
    printObjectType(obj = 5)
    printObjectType(obj = mutableListOf(2, 5, 8))
    printObjectType(obj = "Foo")

    val a: String? = null
    val b = a as? String
// Triggers an error at runtime
    print(b)


}