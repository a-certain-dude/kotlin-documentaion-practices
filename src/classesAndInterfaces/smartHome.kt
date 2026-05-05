package classesAndInterfaces

/*
Exercise 1
Imagine you're working on a smart home system. A smart home typically has different types
of devices that all have some basic features but also unique behaviors.
In the code sample below, complete the abstract class called SmartDevice so that the child
class SmartLight can compile successfully.

Then, create another child class called SmartThermostat that inherits from the
SmartDevice class and implements turnOn() and turnOff() functions that return print
statements describing which thermostat is heating or turned off.
Finally, add another function called adjustTemperature() that accepts a temperature
measurement as an input and prints: $name thermostat set to $temperature°C.
Hint
In the SmartDevice class, add the turnOn() and turnOff() functions so that you can override their behavior later in the SmartThermostat class.
*/




abstract class SmartDevice(val name: String) {
    abstract fun turnOn()
    abstract fun turnOff()

}

class SmartLight(name: String) :
    SmartDevice(name = name) {

    override fun turnOn() {
        println("$name is now ON")
    }

    override fun turnOff() {
        println("$name is now OFF")
    }

    fun adjustBrightness(level: Int) {
        println("Brightness Level of $name is : $level%")
    }

}