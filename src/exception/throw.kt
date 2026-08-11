package exception

val cause = IllegalStateException("Original cause:Illegal state.")

fun main() {
    var userInput: Int = 0

    if (userInput < 0) {
        // Throws an IllegalArgumentException if userInput is negative
        //Additionally, it shows the original cause, represented by the cause IllegalStateException
        throw IllegalArgumentException("Input must non-negative",cause)
    }
}
