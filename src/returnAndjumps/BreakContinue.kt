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
}