package coroutines

// Suspending function is the most basic building block coroutine
// Suspending function allows a running operation to pause and resume
// later without affecting the structure of your code

suspend fun greet() {
    println("Hello from a suspending function")
}

suspend fun showInfo() {
    println("Show info")
    greet()
    println("User: John Mensah")

}


suspend fun main() {
    showInfo()

}
