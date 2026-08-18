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
        mockRes.use()
    } finally {
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

}