package collections

val solarElements = listOf("atoms", "neutrons", "protons", "quarks", "string", "galaxies")

fun main() {
    println("Printing elements in numbers list: $solarElements")

    println("Size of the entire list: ${solarElements.size}")
    println("Last position in the indices: ${solarElements.size - 1}")
    println("Access element 1: ${solarElements[1]}")
    println("Positional access using function: \"${solarElements.get(index = 1)}\" ")

    val person = Person(name = "mensah", age = 34)

    val groupOfPersons = listOf(Person("mensah",34),"Bob",24)
    val groupOfPersonsB = listOf(person,"Bob",24)

    val obj = listOf(1,"john",'a')

    println(groupOfPersons==groupOfPersonsB)
}

data class Person(val name: String, val age: Int)