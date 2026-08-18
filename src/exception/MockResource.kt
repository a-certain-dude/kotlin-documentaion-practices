package exception

import classesAndInterfaces.Messaging


class MockResource {
    fun use() {
        println("Resource being used")
        val result = 100 / 0
        println("Result: $result")
    }

    fun close() {
        println("Result closed")
    }


}

//custom exception, inhering Existing exception class
class NegativeNumberException : Exception("Parameter is less than zero.")
class NonNegativeNumberException : Exception("Parameter is above zero.")

fun validateNumber(number: Int) {
    if (number < 0) throw NegativeNumberException()
    else if (number >= 0) throw NonNegativeNumberException()
}

fun main() {
    validateNumber(1)

    val mockRes = MockResource()
    try {
        //Attempt to use resources
        mockRes.use()
    } finally {
        //Ensures resource is always closed even if exception occurs
        mockRes.close()
    }

    try {
        MockResource().apply {
            use()
        }
    } finally {
        MockResource().apply {
            close()
        }
    }
    // this line is not printed when exception is thrown
    println("End of program")
}