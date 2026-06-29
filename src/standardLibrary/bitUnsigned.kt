package standardLibrary

import kotlin.math.pow

infix fun Int.pow(exponent: Int): Int {
    return this.toDouble().pow(exponent).toInt()
}

fun main() {

    val bitWidth = 2.pow(8) - 1
    val wrongUsage = 2 pow 4 - 1
    println(bitWidth)
    unsignedX()

}

@OptIn(ExperimentalUnsignedTypes::class)
fun unsigned(): Unit {
    // Create an unsigned integer array
    val unsignedArray: UIntArray = uintArrayOf(1u, 2u, 3u, 4u, 5u)
// Modify an element
    unsignedArray[2] = 42u
    println("Updated array: ${unsignedArray.joinToString()}")
}


@OptIn(ExperimentalUnsignedTypes::class)
fun unsignedX() {
  val unsigned = uintArrayOf(1u,2u,3u,4u,5u,6u)
    unsigned[4] = 9u
    println(unsigned.joinToString())
}

