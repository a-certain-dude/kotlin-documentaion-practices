package scopefunctions

class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int) = println("$x,$y,$w,$h,")
    fun circ(x: Int, y: Int, r: Int) = println("$x,$y,$r,")
    fun text(x: Int, y: Int, str: String) = println("$x,$y,$str,")
}

fun main() {
    // the usual way
    val mainMonitorPrimaryBufferBackedCanvas = Canvas()
    mainMonitorPrimaryBufferBackedCanvas.text(10, 10, "Foo")
    mainMonitorPrimaryBufferBackedCanvas.rect(20, 30, 100, 50)
    mainMonitorPrimaryBufferBackedCanvas.circ(40, 60, 25)
    mainMonitorPrimaryBufferBackedCanvas.text(15, 45, "Hello")
    mainMonitorPrimaryBufferBackedCanvas.rect(70, 80, 150, 100)
    mainMonitorPrimaryBufferBackedCanvas.circ(90, 110, 40)
    mainMonitorPrimaryBufferBackedCanvas.text(35, 55, "World")
    mainMonitorPrimaryBufferBackedCanvas.rect(120, 140, 200, 75)
    mainMonitorPrimaryBufferBackedCanvas.circ(160, 180, 55)
    mainMonitorPrimaryBufferBackedCanvas.text(50, 70, "Kotlin")


    //using with scope function
    val secondaryBufferBackedCanvas = Canvas() //receiver object
    // pass Canvas object directly to with , you can replace with secondary... variable
    with(Canvas()) {
        rect(x = 10, y = 10, w = 5, h = 8)
        circ(x = 10, y = 10, r = 5)
        text(x = 10, y = 10, str = "Kwame")
        rect(10, 4, 7, 8)
        println("receiver : $this")
    }


    //using apply scope function
    Canvas().apply {
        rect(x = 10, y = 10, w = 5, h = 8)
        circ(x = 10, y = 10, r = 5)
        text(x = 10, y = 10, str = "Kwame")
    }


}