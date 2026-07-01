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
        "hello" -> println("Greeting")
    }

}

fun collectionX(): Unit {
    val fruits = listOf("orange", "apple", "banana", "mangoes")
    /*when {
        "pineapple" in fruit    s -> println("pineapple found at index ${fruits.indexOf("pineapple")}")
        "mangoes" in fruits -> println("mangoes found at index ${fruits.indexOf("mangoes")}")
    }*/
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }


}

object TypeCheck {

    /*Using the is operator for Type-checking*/
    private fun getStringLength(obj: Any): Int? {

        if (obj is String) {
            // obj is automatically cast to string in this branch
            return obj.length
        }

        // obj is still of 'Any' outside the type-checked branch
        return null
    }

    fun getStringLengthX(obj: Any): Int? {
        if (obj !is String) return null
        return obj.length
    }

    fun printLength(obj: Any) {
        println("Printing the length of '$obj' ${getStringLength(obj = obj) ?: "Type is not string"} ")
        //println("Printing the length of '$obj' ${getStringLength(obj = obj)} ")
    }

}

fun main() {

    //ranges()
    //forLoop()
    //whileLoop()
    whenExpression("hello")
    whenExpression(1000L)
    whenExpression(1)
    collectionX()

    TypeCheck.apply {
        printLength("NkwantabisaJoseph")
        printLength(300)
    }

}