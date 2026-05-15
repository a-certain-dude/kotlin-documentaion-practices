package classesAndInterfaces.properties

import kotlin.properties.Delegates.observable

class Temperature {

    var temperature: Double by observable(20.4)
    { _, old, new ->
        if (new > 25)
            println("Warning: Temperature is too high! ($old`c -> $new`c)")
        else
            println("Temperature changed: $old`c-> $new`c")
    }


}

fun main() {
    Temperature().apply {
        temperature = 26.0
        // Warning: Temperature is too high! (20.4`c -> 26.0`c)
        temperature = 24.4
        //Temperature changed: 20.4 -> 24.4
        temperature = 2.4
    }
}