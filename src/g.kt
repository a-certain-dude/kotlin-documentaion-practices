fun ranges() {

    // out of range
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    // in range

    for (x in 1..5) {
        println(x)
    }

    val x = 10
    val y = 9

    if (x in 1..y + 1) {
        println("x is in range ${y + 1}")
    }

    println("*********")

    for (x in 1..10 step 3) {
        println(x)
    }

    println("*********")
    for (x in 10 downTo 1 step 3) {
        println(x)
    }
}

fun forLoop(): Unit {
    val fruits = listOf("apple", "banana", "pineapple")
    for (items in fruits) {
        println(items)
    }

    println(fruits[1])

    for (index in fruits.indices) {
        println("$index at ${fruits[index]}")
    }

}

fun whileLoop(): Unit {
    val fruits = listOf("apple", "banana", "pineapple")
    var index = 0

    while (index < fruits.size) {
        println("$index is at ${fruits[index]}")
        println(index++)
        println("\n")
    }

}


fun whenExpression(obj: Any): Unit {
    when (obj) {
        1 -> println("one")
        is Long -> println("Is long type")
        "hell" -> println("Greeting")
        is String -> println("Is string")
    }

}


fun main() {

    //ranges()
    //forLoop()
    //whileLoop()
    whenExpression("Hello")
    whenExpression(1000L)
    whenExpression(1)

}