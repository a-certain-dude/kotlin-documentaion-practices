package org.example

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.time.Duration.Companion.milliseconds

suspend fun main() =
    withContext(Dispatchers.Default) {

        // coroutine starts downloading the first page
        val firsPage = this.async {
            delay(50.milliseconds)
            "First Page"
        }

        // coroutine starts downloading the second page in parallel
        val secondPage = this.async {
            delay(50.milliseconds)
            "Second Page"
        }

        // awaits both results and compare them
        val pagesEqual = firsPage.await() == secondPage.await()
        println("Pages are equal: $pagesEqual")

        println(firsPage.await())   // awaits to return the result
        println(secondPage.await()) // awaits to return the result

    }