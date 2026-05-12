package objectDeclaration

/*
Exercise 2
Create an object declaration that inherits from the Vehicle interface to create a unique
vehicle type: FlyingSkateboard. Implement the name property and the move()
function in your object so that the following code in the main() function runs
successfully:*/

interface Vehicle {
    val name: String
    fun move(): String
}

object FlyingSkateBoard : Vehicle {
    override val name: String = "FlyingSkate"
    override fun move(): String {
        return "A Flying Skate Board is moving"
    }

    fun flyingSound() = println("Woohoooooo hahaaa ")
}

fun main() {
    println("Name of vehicle:  ${FlyingSkateBoard.name}")
    println("Movement of vehicle:  ${FlyingSkateBoard.move()}")
    FlyingSkateBoard.flyingSound()
}
