package varag

// variable number of arguments
fun mergeSting(vararg alphabet: String) {
    for (x in alphabet)
        println(x)
}

fun <T> asList(vararg items: T): List<T> {
    val result = ArrayList<T>()
    for (entities in items)
        result.add(entities)
    return result
}

fun schoolsLoc(vararg desc: String) {
    for (alphabet in desc)
        println(alphabet)
}

fun main() {

    // the spread operator is used to extract items from an array and pass them individually
    val nameS = listOf("Police", "Depo")
    schoolsLoc("RC", "EP", "LA", *nameS.toTypedArray())

    val names = arrayOf("WhanBaNie", "Abba")
    val number = intArrayOf(24, 45, 59)
    // the spread operator is used to extract items from an array and pass them individually
    val asL =
        asList(3, 5, 6, 0, "jose", *names, *number.toTypedArray())

    println(asL)
    mergeSting(alphabet = arrayOf("x", "y", "z"))
}