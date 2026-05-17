package classesAndInterfaces.properties
/*

Exercise 2
You have a travel app that needs to display distances in both kilometers and miles.
Create an extension property for the Double type called asMiles to convert a distance
in kilometers to miles:

The formula to convert kilometers to miles is miles = kilometers * 0.621371 .
Hint
Remember that extension properties need a custom get() function.*/

val Double.asMiles
    get() = this * 0.621371 //this[Double] is the receiver
                            //when called a Double value is appended against asMiles
fun main() {
    val kilometers = 5.0
    val miles = kilometers.asMiles
    println("Distance of $kilometers is equal to $miles miles")
    println("***************************************")
    println("Distance of 5.0 kilometers is ${5.0.asMiles} miles")
}