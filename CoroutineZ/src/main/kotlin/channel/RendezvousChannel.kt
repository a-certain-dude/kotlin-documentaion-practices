package org.example.channel

/*
Rendezvous channel
The "Rendezvous" channel is a channel without a buffer,
the same as a buffered channel with zero size. One of the
functions ( send() or receive() ) is always suspended until the other is called.
*/
