package function

// Unit type are not specified except functional type function (high order function, functions as parameter)
fun printHello(name: String?, action: () -> Unit) {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there")

    action()
}

// declaring the unit type and returning it is verbose
fun printHelloX(name: String?, action: () -> Unit): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there")

    action()

    return Unit
}


fun main() {
    printHello("Maame") {
        println("Program done") // trailing lambdas
    }
}