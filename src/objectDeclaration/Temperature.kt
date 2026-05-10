package objectDeclaration

/*Exercise 3
You have an app where you want to record temperatures.
The class itself stores the information in Celsius, but you want to provide an easy way
to create an instance in Fahrenheit as well.
Complete the data class so that the following code in the main()
function runs successfully:
Hint
Use a companion object*/

data class Temperature(val celsius: Double) {
    val fahrenheit: Double = celsius * 9 / 5 + 32

    companion object Fahrenheit {
        fun fromFahrenheit(fahrenheit: Double): Temperature {
            return Temperature(celsius = (fahrenheit - 32) * 5 / 9)
        }

        fun fromFahrenheitX(fahrenheit: Double) {
            val celsius: Double = (fahrenheit - 32) * 5 / 9
            println(celsius)
        }

    }
}

fun main() {
    (Temperature.fromFahrenheit(3.5))
    println("^^^^^^^^^^^^")

    Temperature(5.5).apply {
        println(fahrenheit)
        Temperature.fromFahrenheit(7.2)
    }

    println("^^^^^^^^^^^^")

    val fahrenheit = 90.0
    val temp = Temperature.fromFahrenheit(fahrenheit)
    println(temp)
    println(Temperature.fromFahrenheitX(fahrenheit))

}
