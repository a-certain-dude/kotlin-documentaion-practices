package function

fun greeting(userId: Int = 1, message: () -> Unit) {
    println(userId)
    message()
}

//default argument
//In general, you can assign any expression as the default value of a parameter.
fun read(b: Int, print: Unit? = println("No argument passed for print.")) {
    println(b)
}

// Non-constant expression as default values
fun readX(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size, // makes reference a parameter within the same function header
) {

}

fun main() {
    read(5)
    read(5, null)

    greeting {
        println("GoodMorning")
    }
}