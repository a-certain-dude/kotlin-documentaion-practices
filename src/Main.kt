fun main() {
    /*Conditionals.ifCondition()
    Conditionals.whenCondition()
    println()
    Loops.whileLoop()
    println()
    Loops.doWhileLoop()
    println()
    Loops.forLoopFizzBuzz()*/
    /*   println()
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
       Classes.main()*/
    /*val rand = RandomEmployeeGenerator(10,30)
    println(rand.generateEmployee())
    println(rand.minSalary)
    println(rand.maxSalary)*/
    println()
    val salary = salaryById(8)
    println(salary)
    println((1..5).sumOf { id -> salaryById(id) })
    println()
    println(2.isPositive())
    println((-7).isPositiveCheck())


}