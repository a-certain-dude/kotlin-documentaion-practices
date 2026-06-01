package nullSafety

import lambdas.ID

/*
*Early returns and the Elvis operator
In the beginner tour, you learned how to use early returns to stop your function from
being processed further than
a certain point. You can use the Elvis operator ?: with an early return
to check preconditions in a function. This approach is a great way to keep your
code concise because you don't need to use nested checks. The reduced complexity of
your code also makes it easier to maintain. For example:
* */
data class Users(
    val id: Int,
    val name: String,
    val friends: List<Int>,
)

fun getNumberOfFriends(users: Map<Int, Users>, userId: Int): Int {
    // retrieves the user or return -1 if not found
    val user = users[userId] ?: return -1
    return user.friends.size
}

fun main() {
    val user1 =
        Users(id = 1, name = "Osei", friends = listOf(1, 4))
    val user2 =
        Users(id = 2, name = "Mensah", friends = listOf(4))

    val getNumber =
        getNumberOfFriends(
            users = mapOf(1 to user1, 2 to user2),
            userId = 3
        )
    println(getNumber)

}