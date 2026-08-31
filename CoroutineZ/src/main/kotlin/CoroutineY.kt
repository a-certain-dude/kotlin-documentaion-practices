package org.example

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

suspend fun main() {
    coroutineScope {
        this.launch {
            this.launch {
                delay(2.seconds)
                println("2sec Child of the enclosing coroutine completed.")
            }

            this.launch {
                delay(8.seconds)
                println("8sec Child coroutine 1 completed.")
            }

            delay(6.seconds)
            println("6sec Child coroutine 1 completed.")
        }

        this.launch {
            delay(5.seconds)
            println("5sec Child coroutine 2 completed.")
        }
    }
}