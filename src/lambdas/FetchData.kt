package lambdas

/*
*Exercise 1
You have a fetchData() function that accepts a lambda expression with receiver.
*Update the lambda expression to use the append() function so that the output of
*your code is: Data received - Processed.
*/

fun fetchData(callback: StringBuilder.() -> Unit) {
    val builder = StringBuilder("Data Received")
    builder.callback()
}

fun main() {
    fetchData {
        append(" - Processed")
        println(this.toString())
    }
}