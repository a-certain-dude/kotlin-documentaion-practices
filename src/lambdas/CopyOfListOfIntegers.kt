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


/*Correct answer from the Documentation*/
fun List<Int>.incrementX(): List<Int> {
    val originalList = this // this(which is the receiver) is List<Int>
    return buildList {
        for (n in originalList) {
            add(n + 1)
        }
    }
}

fun main() {
    /*This function contains
     the various solution of the extended
     incremented/incrementX function*/


    val originalList = listOf(1, 2, 3)
    originalList.incremented()
    /*val newList = originalList.incremented()
    newList  is not needed as original.incremented naturally prints the values
    println(newList)
    prints [] which is not needed
    */
    println("****************************")

    val anotherOriginalList = listOf(4, 5, 6)
    val newListMadeOutOfAnotherOriginalList = anotherOriginalList.incrementX()
    println(newListMadeOutOfAnotherOriginalList)


}