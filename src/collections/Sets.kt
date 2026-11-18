package collections

fun main() {
    val setOfNumbers = setOf(1, 2, 3, 4, 5, 6)
    println(setOfNumbers.size)
    // check if an element is part of something
    if (setOfNumbers.contains(4))
        println("setOfNumbers contains: 4")

    val numberBackWards = setOfNumbers.reversed()
    println(numberBackWards)

}