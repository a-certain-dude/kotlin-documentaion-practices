package lambdas

class Canvas {
    fun drawCircle() = println("�� Drawing a circle")
    fun drawSquare() = println("�� Drawing a square")
}

fun renderShapesOfCanvas(shapes: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    canvas.shapes()
    return canvas
}

fun main() {
    renderShapesOfCanvas {
        this.drawSquare()
        this.drawCircle()
    }
}