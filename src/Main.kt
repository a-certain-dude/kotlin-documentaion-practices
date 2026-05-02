import scopefunctions.Product
import scopefunctions.getPriceInEurosS

fun main() {
    /*Conditionals.ifCondition()
    Conditionals.whenCondition()
    println()
    Loops.whileLoop()
    println()
    Loops.doWhileLoop()
    println()
    Loops.forLoopFizzBuzz()
       println()
       Loops.findLetterL()
       println()
       println(Functions.circleArea(2))
       println()
       println(Functions.circleAreaSingleExpression(5))
       println()
       Functions.main()
       println()
       println(Lambdas.urls)
       println()
       Lambdas.invokeCustomRepeat()
       println()
       val employee = Classes.Employee("Osei", 35)
       employee.salary += 10
       println(employee.name + " " + employee.salary)
       println()
       Classes.main()
    val rand = RandomEmployeeGenerator(10,30)
    println(rand.generateEmployee())
    println(rand.minSalary)
    println(rand.maxSalary)
    println()
    val salary = salaryById(8)
    println(salary)
    println((1..5).sumOf { id -> salaryById(id) })
    println()
    println(2.isPositive())
    println((-7).isPositiveCheck())
    println()
    println("JOSEPH".toLowerCaseString())

    println()
    println("apply")
    val canvas: Canvas = Canvas().apply {
        rect(x = 10, y = 10, w = 5, h = 8)
        circ(x = 10, y = 10, r = 5)
        text(x = 10, y = 10, str = "Kwame")
    }

    println()

    println("mainMonitor")
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

    println()
    println("secondary")
    val secondaryBufferBackedCanvas *//*receiver object*//*  = Canvas()
    with(secondaryBufferBackedCanvas){
        rect(x = 10, y = 10, w = 5, h = 8)
        circ(x = 10, y = 10, r = 5)
        text(x = 10, y = 10, str = "Kwame")
        rect(10,4,7,8)
        println("receiver : $this")
    }*/

    val product = Product()
    val priceInEuros = product.getPriceInEurosS()

    /* if (priceInEuros != null)
         println("Price in Euros: $priceInEuros")
     else
         println("Price info not available")
 */

    val check = priceInEuros?.let {
        println("Price in Euros: $it")
    }

}