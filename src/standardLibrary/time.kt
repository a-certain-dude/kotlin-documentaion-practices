package standardLibrary

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {
    val thirtyMinutes: Duration = 30.minutes
    val halfAnHour: Duration = 0.5.hours
    println(thirtyMinutes==halfAnHour)
}