package infixNotation

class MyStringCollection {

    private var items = mutableListOf<String>()

    infix fun add(s: String) {
        println("Adding $s")
        //items += s
        items.plusAssign(s)
    }

    fun build() {
        add("first ") // Correct: ordinary function call
        this add "second" // Correct: infix call with an explicit receiver
        this add "third"
    }

    fun printAll() = println(items)


}

fun main() {

    MyStringCollection().apply {
        this.build()
        this.printAll()
    }

}