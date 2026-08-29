package org.example

import kotlinx.coroutines.*

/* To create a coroutine in Kotlin you need:
*  SUSPENDING FUNCTION: that suspend and resume long operation Function
*  COROUTINE SCOPE: the environment like withContext() in which it can run
*  COROUTINE BUILDERS: like CoroutineScope.launch{} to start it
*  A DISPATCHER: to control which thread it uses
* */

suspend fun greet(id: Int) {
    println("$id The greet() on the thread: ${Thread.currentThread().name}")
    delay(100L) // simulate the time it takes to fetch some network data
}
//Combine these pieces to run multiple coroutines at the same time on a shared pool of threads:
suspend fun main() {
    withContext(Dispatchers.Default) {
        // to define an entry point for multithreaded concurrent code that
        // runs on a shared thread pool:
        // coroutine scope in which it can run , dispatcher to decide which thread to use

        // coroutine builders like launch{} to start it inside withContext scope
        this.launch {
            greet(1)
        }
        println("The withContext() on the thread: ${Thread.currentThread().name}")

        // starts another coroutine
        this.launch {
            greet(2)
        }
    }

}