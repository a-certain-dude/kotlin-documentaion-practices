package standardLibrary

import java.time.Clock
import java.time.ZoneId
import java.util.*
import kotlin.math.exp
import kotlin.math.pow
import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

//import kotlinx.datetime.*

fun main() {
    val thirtyMinutes: Duration = 30.minutes
    val halfAnHour: Duration = 0.5.hours
    println(thirtyMinutes == halfAnHour)

    /*   val now = Clock.System.now() // Get current instant
       println("Current instant: $now")
       val zone = TimeZone.of("America/New_York")
       val localDateTime = now.toLocalDateTime(zone)
       println("Local date-time in NY: $localDateTime")*/


}

