package exception

data class User(val name: String, var role: String)

fun getRoleAndName(user: User) {

    when (user.role) {
        "Admin" -> println("${user.name} is the ${user.role} at Quanbis Computing App ")
        "CEO" -> println("${user.name} is the ${user.role} at Quanbis Computing App ")
        "CTO" -> println("${user.name} is the ${user.role} at Quanbis Computing App ")
        else -> error("${user.name} as the ${user.role} is not found at Quanbis Computing App ")
    }
}

fun main() {
    val customer = User("Joseph", "Admin")
    val customer1 = User("Mensah", "CEO")
    val customer2 = User("Kwame", "CTO")
    val customer3 = User("Agyei", "Programmer")
    getRoleAndName(customer)
    getRoleAndName(customer1)
    getRoleAndName(customer2)
    getRoleAndName(customer3)

}