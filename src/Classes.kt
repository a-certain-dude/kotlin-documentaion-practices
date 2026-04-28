import kotlin.random.Random

/*
Exercise 1
Define a data class Employee with two properties: one for a name,
and another for a salary.
Make sure that the property for salary is mutable, otherwise you won't get
a salary boost at the end of the year! The main function demonstrates how you
can use this data class.*/
object Classes {
    data class Employee(val name: String, var salary: Int)


    /*Exercise 2
    Declare the additional data classes that are needed for this code to compile.*/

    data class Name(var firstName: String, val lastName: String)
    data class Location(var city: String, var suburb: String)
    data class Address(var streetName: String, var city: Location)

    data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

    // Write your code here
    // data class Name(...)
    fun main() {
        val firstPerson = Person(
            Name("John", "Smith"),
            Address("123 Fake Street", Location("Asato", "kwasiamba")),
            ownsAPet = false
        )

        val secondPerson = Person(
            Name(firstName = "Nkwantabisa", lastName = "Osei"),
            Address(streetName = "Asato Community Center", city = Location(city = "Asato", suburb = "Wawaso"))
        )

        println(firstPerson.name.firstName + " " + firstPerson.name.lastName)
        println()
        println(secondPerson.name.firstName + " " + secondPerson.name.lastName)

    }

}

/*Exercise 3
To test your code, you need a generator that can create random employees.
Define a RandomEmployeeGenerator class with a fixed list of potential names (inside
the class body).
Configure the class with a minimum and maximum salary (inside the class header).
In the class body, define the generateEmployee() function. Once
again, the main function demonstrates how you can use this class.
In this exercise, you import a package so that you can use the Random.nextInt()
function. For more information about importing packages, see Package and imports.
Hint 1
Lists have an extension function called .random() that returns a random item within a list.
Hint 2
Random.nextInt(from = ..., until = ...) gives you a random Int number within specified limits.
*/
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {

    data class Employee(val name: String, val salary: Int)

    val names = listOf(
        "Mensah",
        "Mensah",
        "Yaw",
        "Kwame Bonsu",
        "Kwamena Kantanko",
        "Ogyeabour",
        "Boakye",
        "Apeagyei"
    )


    val emp = Employee(name = names.random(), salary = Random.nextInt(minSalary, maxSalary))

    /*printing Employee directly without instantiating prints class names and parameters*/
    /*printing from Unit function prints kotlin.Unit which irritates me a lot*/
    fun generateEmployee(): String {
        return (
                """
            name : ${emp.name}
            salary : ${emp.salary}
            """.trimIndent()
                )
    }

}