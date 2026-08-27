package infixNotation

infix fun Int.addIt(x: Int): Int {
    return this * x
}

//infix fun Int.isPositive(): Boolean = this > 0

fun main() {

    // without infix usage
    val add = 4.addIt(4)
    println(add)

    // with infix usage
    // infix annotation removes . and () during function call
    // must have only one parameter
    val add2 = 4 addIt 4 + 1 + 2  // the 1 represent 4 because the first number is 4, 2 represent 8
    println(add2)

    // val pos = 5 isPositive this would not work because it has no parameter

}