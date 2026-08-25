package function

fun greeting(userId: Int = 1, message: () -> Unit) {
    println(userId)
    message()
}

//default argument
fun read(b: Int, print: Unit? = println("No argument passed for print.")) {
    println(b)
}

fun main() {
    read(5)
    read(5, null)

    greeting {
        println("GoodMorning")
    }
}