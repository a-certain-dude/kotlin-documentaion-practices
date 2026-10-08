package collections

fun List<String>.shortWords() {

    val shortWord = mutableListOf<String>()
    val maxLength = 3

    this.filterTo(shortWord) { str ->
        str.length <= maxLength
    }

    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWord -= articles
    println(shortWord)
}


fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ")
    words.shortWords()

}
