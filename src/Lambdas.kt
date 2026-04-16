object Lambdas {

    /*Return from a function
    Lambda expressions can be returned from a function.
    So that the compiler understands what type the lambda
    expression returned is, you must declare a function type.

    In the following example, the toSeconds() function has function type (Int) -> Int because it always returns a lambda expression that takes a parameter of type Int and
    returns an Int value.

    This example uses a when expression to determine which
    lambda expression is returned when toSeconds() is called:*/

    fun toSeconds(time: String): (Int) -> Int {

        return when (time) {
            "hour" -> { value -> value * 60 * 60 }
            "minute" -> { value -> value * 60 }
            "second" -> { value -> value }
            else -> { value -> value }
        }
    }

    fun main() {
        val timesInMinutes = listOf(2, 10, 15, 1)
        val min2sec = toSeconds("minute")
        val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
        println("Total time is $totalTimeInSeconds secs")
        // Total time is 1680 secs
    }


    /*Exercise 1
    You have a list of actions supported by a web service,
    a common prefix for all requests, and an ID of a particular resource.
    To request an action title over the  resource with ID: 5, you need to create
    the following URL: https://example.com/book-info/5/title.
    Use a lambda expression to create a list of URLs from the list of actions.*/

    val action = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val ID = 5
    val urls = action.map {
        "$prefix/$ID/$it\n\n"
    }

    /*Exercise 2
    Write a function that takes an
    Int value and an action (a function with type () -> Unit) which then repeats
    the action the given number of times. Then use this function
    to print “Hello” 5 times.*/

    fun customRepeat(value: Int, action: () -> Unit) {
        for (i in 1..value) {
            print("$i ")
            action()
        }
    }

    fun invokeCustomRepeat() {
        customRepeat(value = 5, action = { println("Hello") })
        println()
        customRepeat(value = 5) {
            println("Hello World")
        }
    }


}