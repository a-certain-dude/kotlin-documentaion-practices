package nothingType

import classesAndInterfaces.Messaging

class Person(val name: String?)

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

//
fun notImplemented(): Int {
    TODO("Not implemented")
}

fun main() {
    val person = Person(null)
    val p = person.name ?: fail("Name required")
    // if name of Person is null it prints "name required"
    println(p)

    println(notImplemented())
}