import kotlin.math.PI
import kotlin.math.pow

object Functions {
    /*Exercise 1
    Write a function called circleArea that takes the radius
    of a circle in integer format as a parameter and outputs the area of that circle.*/

    fun circleArea(radius: Int): Double {
        return PI * radius * radius
    }

    fun circleAreaSingleExpression(radius: Int): Double = PI * radius * radius
    Exercise 3
    You have a function that translates a time interval given in hours, minutes, and seconds into seconds. In most cases, you need to pass only one or two function
    parameters while the rest are equal to 0. Improve the function and the code that calls it by using default parameter values and named arguments so that the code is
    easier to read

}