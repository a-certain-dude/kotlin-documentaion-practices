/*Practice
Exercise 1
Write an extension function called isPositive that takes an integer and checks whether
it is positive.
*/

fun Int.isPositive() =
    if (this < 0)
        println("$this is Negative ") else println("$this Positive")

/*"this" value represents the receiver which is Int */

fun Int.isPositiveCheck(): Boolean {
    return this < 0
}


