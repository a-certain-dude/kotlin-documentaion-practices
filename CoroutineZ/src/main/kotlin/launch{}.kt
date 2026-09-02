package org.example

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun performBackground() = coroutineScope {
    // Starts a coroutine that runs without blocking the scope
    this.launch {
        delay(100.milliseconds) // simulate the background work
        println("Sending Notification in Background")
    }

    CoroutineScope(Dispatchers.Default).launch {
        // not used
    }

    // main coroutine continue while a previous suspend
    println("Scope continues")
}


suspend fun main() {
    withContext(Dispatchers.Default) {
        // scope with context
        performBackground()
    }

    println("main() function")

}
/*
After running this example, you can see that the main() function isn't blocked
by CoroutineScope.launch()
and keeps running other code while the coroutine works in the background*/
