package nullSafety

/*You can use the singleOrNull() function with a lambda expression to find
a single item that matches a condition.
If one doesn't exist or there are multiple items that match, the function returns a
null value:*/

//https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/single-or-null.html

fun main() {
    val ages = listOf(2, 12, 2, 34, 7)
    val singleAges = ages.singleOrNull {
        it == 2
    }
    println(singleAges)
}