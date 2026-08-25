package varag

// variable number of arguments
fun mergeSting(vararg alphabet: String) {
    for (x in alphabet)
        println(x)
}

fun main() {
    mergeSting(alphabet = arrayOf("x", "y", "z"))
}