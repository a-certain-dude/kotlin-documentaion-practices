fun calculateTotalStringLength(items: List<Any>) {
    var totalLength = 0
    for (index in items) {
        totalLength += if (index is String)
            index.length
        else
            0
    }
    println(totalLength)

}

fun calculateTotalStringLengthX(items: List<Any>){
    items.sumOf {
        (it as? String)?.length ?: 0
    }

}

fun main() {

    calculateTotalStringLength(listOf("Kwame", "Kwamena", "Mante", 4))

    /*var tracker = 0
    val a = 12
    val b = 3
    tracker = a + b
    tracker += 2
    println(tracker)*/

}