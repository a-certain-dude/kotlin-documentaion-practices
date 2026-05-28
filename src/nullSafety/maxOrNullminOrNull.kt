package nullSafety

val temperature: List<Int> = listOf(4, 56, 34, 23)
val maxTemperature = temperature.maxOrNull()
val minTemperature = temperature.minOrNull()

fun main() {
    println("Maximum temperature is ${maxTemperature ?: "No data"} ")
    println("Minimum temperature is ${minTemperature ?: "No data"} ")
}