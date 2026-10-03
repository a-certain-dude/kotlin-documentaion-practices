package org.example.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.Channel.Factory.BUFFERED
import kotlinx.coroutines.channels.Channel.Factory.CONFLATED
import kotlinx.coroutines.channels.Channel.Factory.UNLIMITED
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
Rendezvous channel
The "Rendezvous" channel is a channel without a buffer,
the same as a buffered channel with zero size. One of the
functions ( send() or receive() ) is always suspended until the other is called.
*/

//NB: By default a rendezvous channel is created.

val rendezvousChannel = Channel<String>()
val bufferedChannel = Channel<String>(capacity = 10)
val conflatedChannel = Channel<String>(capacity = CONFLATED)
val unlimitedChannel: Channel<String> = Channel(capacity = UNLIMITED)

fun log(message: Any?) {
    println("${Thread.currentThread().name} : $message")
}

fun main(): Unit = runBlocking {

    // a channel
    val channel: Channel<String> = Channel(BUFFERED)

    // start a coroutine
    launch {
        channel.send("A1")
        channel.send("A2")
        log("A done")
    }

    // start a coroutine
    launch {
        channel.send("B1")
        log("B done")
    }

    // start a coroutine
    launch {
        repeat(3) {
            val x = channel.receive()
            log("received repeated: $x")
        }

        launch {
            // works fine when there's no launch{}
            val y = channel.receive()
            log("received single: $y")

        }

//        TODO("The last one doesn't run,something is wrong with this code.")
    }


}