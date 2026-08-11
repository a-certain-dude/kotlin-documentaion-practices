package exception

val cause = IllegalStateException("Original cause:Illegal state.")

fun main() {
    var userInput: Int = 0 // change to neg 1 to see exception

    if (userInput < 0) {
        // Throws an IllegalArgumentException if userInput is negative
        //Additionally, it shows the original cause, represented by the cause IllegalStateException
        throw IllegalArgumentException("Input must non-negative", cause)
    }
    //getIndices(-1)
    val index = getIndices(4)
    println(index)
}

fun getIndices(count: Int): List<Int> {
    require(count >= 0) { "Count must be non-negative. You set count to $count" } // throws an exception with a message
    return List(size = count) { it + 1 }
}
