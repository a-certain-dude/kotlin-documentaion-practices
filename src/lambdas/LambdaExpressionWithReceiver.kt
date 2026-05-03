package lambdas

class Canvas {
    fun drawCircle() = println("�� Drawing a circle")
    fun drawSquare() = println("�� Drawing a square")
}

/*lambda expression with receiver*/
fun renderShapesOfCanvas(shapes: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    // use lambda expression with receiver
    canvas.shapes()
    return canvas
}

fun main() {
    renderShapesOfCanvas {
        this.drawSquare()
        this.drawCircle()
    }
}