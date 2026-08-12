package exception

fun main() {

    val num = try {
        count()
    } catch (_: ArithmeticException) {
        -1
    }
    println(num)


}
fun count(): Int {
    val a = 0
    return 10 / a
}