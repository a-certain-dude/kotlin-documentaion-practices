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

fun main(): Unit = runBlocking {

    // a channel
    val channel: Channel<String> = Channel(BUFFERED)

    // start a coroutine
    launch {
        channel.send("A1")
        channel.send("A2")
        println("A done")
    }

    // start a coroutine
    launch {
        channel.send("B1")
        println("B done")
    }

    // start a coroutine
    launch {
        val x = channel.receive()
        println("received: $x")
    }


}