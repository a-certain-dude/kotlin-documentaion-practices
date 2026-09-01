package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

/*The runBlocking() coroutine builder function
*creates a coroutine
*scope and blocks the current thread until the
*coroutines launched in that scope finish.*/

// a third party library that you can't change
interface Repository {
    fun readTime(): Int
}

object MyRepository : Repository {
    override fun readTime(): Int {
        return runBlocking {
            myReadTime()
        }
    }
}

suspend fun myReadTime(): Int {
    delay(500.milliseconds)
    return 1
}
// Entry point of code Execution
fun main() {
val read = MyRepository.readTime()
    println(read)
    // now lets run to see the output
    // what do you think it would output?
}