package classesAndInterfaces
/*
Exercise 4
You have a simple messaging app that has some basic functionality,
but you want to add some functionality for smart messages without
significantly duplicating your code.

In the code below, define a class called SmartMessenger that inherits from the
Messenger interface but delegates the implementation to an instance of the
BasicMessenger class.

In the SmartMessenger class, override the sendMessage() function to send smart messages.
The function must accept a message as an input and return a printed
statement: "Sending a smart message: $message".

In addition, call the sendMessage() function from the BasicMessenger class and prefix
the message with [smart].
You don't need to rewrite the receiveMessage() function in the SmartMessenger class.*/


interface Messaging {
    fun sendMessage(message: String)
    fun receiveMessage(): String
}

class BasicClassMessenger() : Messaging {
    override fun sendMessage(message: String) {
        println("Sending a basic message: $message ")
    }

    override fun receiveMessage(): String {
        return "Message received"
    }

    fun timeSent() {
        println("12:00 Anopa N'nsia ")
    }
}

class SmartMessenger(val basicMessage: BasicClassMessenger) : Messaging by basicMessage {
    override fun sendMessage(message: String) {
        println("Sending a smart message: $message ")
    }
}

fun main() {
    SmartMessenger(BasicClassMessenger()).apply {
        sendMessage("Kita mu oo, Ama Nketia, wo ho te s3n ?")
        println(receiveMessage())
        BasicClassMessenger().timeSent()
    }
}