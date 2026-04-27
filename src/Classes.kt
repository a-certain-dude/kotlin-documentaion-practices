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


    }

}