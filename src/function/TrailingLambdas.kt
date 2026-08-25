package function

fun greeting(userId: Int = 1, message: () -> Unit) {
    println(userId)
    message()
}

fun main() {
    greeting {
        println("GoodMorning")
    }
}