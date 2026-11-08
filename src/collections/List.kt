package collections

val numbers = listOf("atoms", "neutrons", "protons", "quarks", "string", "galaxies")

fun main() {
    println("$numbers")

    println("Positional access using function ${numbers.get(index = 1)}")
    println("Access element 1 ${numbers[1]}}")

}
