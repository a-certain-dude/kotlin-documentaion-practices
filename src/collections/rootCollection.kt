package collections

fun printAllUsingHOF(alphabet: Collection<String>) {
    alphabet.forEach { items -> println(items) }
}

fun printAll(alphabet: Collection<String>) {
    for (items in alphabet) {
        println(items)
    }
}

fun main() {

    val stringAlphabet = listOf("A", "B", "C", "D", "E", "F\n")
    val setAlphabet = setOf("0", "1", "2", "3", "4", "4")

    printAllUsingHOF(stringAlphabet)
    printAll(setAlphabet)
}