package function

// single-line expression function
// the compiler can infer the return type of single-line expression function
fun double(x: Int) = x * 2

fun main() {
    val d = double(21)
    println(d)
}