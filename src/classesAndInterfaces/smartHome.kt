package classesAndInterfaces


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