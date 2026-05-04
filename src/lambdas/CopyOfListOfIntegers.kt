package lambdas

/*
Exercise 3
Write a function that creates a copy of a list of integers where every element is
incremented by 1. Use the provided function skeleton that extends List<Int> with an
incremented function.*/

fun List<Int>.incremented(): List<Int> {
    val originalList = this
    return buildList {
        originalList.forEach {
            println(it + 1)
        }
    }
}

fun main() {
    val originalList = listOf(4, 6, 7)
    val newList = originalList.incremented()
    println(newList)

}