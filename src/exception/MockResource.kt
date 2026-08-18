package exception


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

fun main() {

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