package collections

data class Planets(val name: String, val position: Int)

fun main() {
    val planets = mutableListOf(Planets("Mercury", 1))
    //   Adding items
    planets.add(Planets("Venu", 2))
    planets.add(Planets("Earth", 3))
    planets.add(Planets("Mars", 4))
    planets.add(Planets("Jupiter", 5))
    planets.add(Planets("Saturn", 6))
    planets.add(Planets("Uranus", 7))
    planets.add(Planets("Neptune", 8))
    planets.add(Planets("Pluto", 9))
    planets.forEach {
        println(it.name + " " + it.position)
    }
    // default testing
    // Removing an Item
    println("Removing........" + planets[8])

    planets.removeAt(planets.size - 1)
    planets.shuffle()
    planets[7] = Planets("New Planet", 8)
    planets.forEach {
        println(it.name + " " + it.position)
    }
    println("Total elements after removing index 8: ${planets.size}")
}

