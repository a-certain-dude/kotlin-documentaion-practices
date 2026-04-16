import kotlin.math.PI
import kotlin.math.pow

object Functions {
    /*Exercise 1
    Write a function called circleArea that takes the radius
    of a circle in integer format as a parameter and outputs the area of that circle.*/

    fun circleArea(radius: Int): Double {
       return PI * radius * radius
    }

}