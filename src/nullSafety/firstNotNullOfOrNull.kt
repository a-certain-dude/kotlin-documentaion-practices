package nullSafety

// return the first value that isn't null
data class User(val name: String?, val age: Int?)
data class AbsentUser(val name: String, val age: Int)

val listOfUsers: List<User> = listOf(
    User(name = null, 26),
    User(name = "Osei", 20),
    User(name = "Owusuwaa", 84),
    User(name = "Mansah", 20),
    User(name = "Seiwaa", null),
)

val absentListOfUsers: List<AbsentUser> = listOf()

fun main() {
    val firstNonNullName = listOfUsers.firstNotNullOfOrNull { it.age }
    println(firstNonNullName)

    val firstNonNull = absentListOfUsers.firstOrNull()
    println(firstNonNull)

}