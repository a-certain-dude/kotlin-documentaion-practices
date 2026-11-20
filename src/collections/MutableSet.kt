package collections

fun main() {

    val numbers = setOf(1, 2, 3, 4, 5, 6)
    val numberBackWards = setOf(6, 5, 4, 3, 2, 1)

    println(numbers.first() == numberBackWards.last())
    println(numbers.first() == numberBackWards.first())

}