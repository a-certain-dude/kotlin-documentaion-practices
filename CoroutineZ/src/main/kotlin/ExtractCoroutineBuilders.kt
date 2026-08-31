package org.example

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

fun CoroutineScope.launchAll() {
    // launch is an extension function to CoroutineScope responsible
    // for pulling the concurrency
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
    coroutineScope {
        this.launchAll()
        // launchAll() is called inside coroutineScope{} because launchAll() needs
        // to be called inside a suspending function and coroutineScope{} happens to
        // be a suspending function
    }

}