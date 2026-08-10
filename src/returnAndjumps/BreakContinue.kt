package returnAndjumps
/*

Any expression in Kotlin may be marked with a label.
Labels have the form of an identifier followed by the @ sign,
such as abc@ or fooBar@ . To label an expression, just add a label in front of it.
        */

fun main() {
    loop@ for (i in 1..20) {
        for (j in 1..20) {
            if (j == i) break@loop
        }
    }
    atom()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach(

        fun(value: Int) {
            if (value == 3) return // local return to the caller of the anonymous
                                    // function - the forEach loop
            print(value)
        }

    )

    print(" done with anonymous function")
}

fun atom() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller - the foreach lambda
        println(it)
    }
    println("done wit explicit label")
}

fun atomX() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach// local return to the caller - the foreach lambda
        println(it)
    }
    println("done wit implicit label")
}