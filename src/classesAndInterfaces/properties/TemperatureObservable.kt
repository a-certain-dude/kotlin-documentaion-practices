package classesAndInterfaces.properties

import kotlin.properties.Delegates.observable

class Thermostat {

    var temperature: Double by observable(20.4)
    { _, old, new ->
        if (new > 25)
            println("Warning: Temperature is too high! ($old`c -> $new`c)")
        else
            println("Temperature changed: $old`c-> $new`c")
    }


}

fun main() {
    Thermostat().apply {
        temperature = 26.0 //temperature with initial value of 20.4 is now here as 26.0
                           // this triggers a reaction by executing given command
        temperature = 24.4  // same
        temperature = 2.4   // same
    }
}