/*
Exercise
You have the employeeById function that gives you access to a database of employees of
a company. Unfortunately, this function returns a value of the Employee?
type, so the result can be null. Your goal is to write a function that returns the
salary of an employee when their id is provided, or 0 if the employee is missing from the
database.*/

data class Employee(val name: String, val salary: Int)

fun employeeById(id: Int): Employee? {
    return when (id) {
        1 -> Employee(name = "Mansong", salary = 49)
        2 -> Employee(name = "Mante", salary = 49)
        3 -> null
        4 -> Employee(name = "Yawa", salary = 49)
        5 -> Employee(name = "Akyeampong", salary = 49)
        else -> null
    }
}

fun salaryById(id: Int): Int {
    return employeeById(id)?.salary ?: 0
}

