package org.example

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

// Extracting coroutine builders

fun CoroutineScope.withConLaunch() {
    // "this" keyword is not may not be important
    // because most of the time
    // the compiler would write it for you
    this.launch {
        delay(2.seconds)
        println("First launch")
    }

    launch {
        delay(3.seconds)
        println("Second launch")
    }
}

// Entry point of execution
suspend fun main() {
    withContext(Dispatchers.Default) {
        // calling it with "this" keyword
        this.withConLaunch()
    }

    withContext(Dispatchers.Default) {
        // called without the this keyword because the
        // the compiler would write it there for me

        // now lets run to see the output
     withConLaunch()
    }
    // THANK YOU FOR WATCHING , LOL I CAN'T EVEN SPELL WATHCING HAAHAHAAAA
}