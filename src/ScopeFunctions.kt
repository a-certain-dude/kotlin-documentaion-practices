class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int) = println("$x,$y,$w,$h,")
    fun circ(x: Int, y: Int, r: Int) = println("$x,$y,$r,")
    fun text(x: Int, y: Int, str: String) = println("$x,$y,$str,")
}