package nullSafety

/*
To use a lambda expression to process each collection item sequentially and create
an accumulated value (or return a null value if the collection is empty)
use the reduceOrNull() function

https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reduce-or-null.html
*/

fun main() {
    val pricesOfItems = listOf<Int>(1, 7, 1, 0)
    val totalPrices = pricesOfItems.reduceOrNull { acc, i -> acc + i }
    println("Calculated items: ${totalPrices ?: "There are no items"} ")

    println("********************************")

    val emptyPricesOfItems = listOf<Int>()
    val emptyTotalPrices = emptyPricesOfItems.reduceOrNull { acc, i -> acc + i }
    println("Calculated items: ${emptyTotalPrices ?: "There are no items"} ")

}

