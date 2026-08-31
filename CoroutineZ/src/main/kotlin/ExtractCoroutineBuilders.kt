package org.example

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

fun CoroutineScope.launchAll() {

    // launch is an extension function to CoroutineScope responsible
    // for pulling the concurrency
    // also called coroutine builder function
    this.launch {
        delay(3.seconds)
        println("1")
    }
    this.launch {
        delay(3.seconds)
        println("2")
    }

}

suspend fun main() {
    // coroutineScope{} is a suspending function that takes an argument of
    // CoroutineScope as a receiver
    // to a function literal.
    // launch{} is an extension function to CoroutineScope which can be passed as an
    // argument to the block:CoroutineScope.()->R parameter so "this" represent
    // the receiver(CoroutineScope)
    // so  coroutineScope becomes a trailing lambda and a DSL-like function call
    withContext(Dispatchers.Default) {
        println("withContext Thread: ${Thread.currentThread().name}")
        this.launchAll()
    }

    coroutineScope {
        println("coroutineScope Thread: ${Thread.currentThread().name}")
        this.launchAll()
        // launchAll() is called inside coroutineScope{} because launchAll() needs
        // to be called inside a suspending function and coroutineScope{} happens to
        // be a suspending function
    }
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    withContext(Dispatchers.Default) {
        println("WithContext Thread: ${Thread.currentThread().name}")
        coroutineScope {
            println("coroutineScope inside withContext Thread: ${Thread.currentThread().name}")
            this.launchAll()
            // launchAll() is called inside coroutineScope{} because launchAll() needs
            // to be called inside a suspending function and coroutineScope{} happens to
            // be a suspending function
        }
        // coroutineScope would use the thread of WithContext which is main
    }

    // the difference between the two is that the withContext lets you define which
    // thread to use
    // whiles coroutineScope uses the inherited thread or default if nothing to inherit

}