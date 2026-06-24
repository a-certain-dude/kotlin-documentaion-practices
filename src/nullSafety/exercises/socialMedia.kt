package nullSafety.exercises

import javax.print.attribute.standard.JobOriginatingUserName

/*
Exercise 3
You are working on a social media platform where users have usernames and account statuses.
You want to see the list of currently active usernames.
Complete the getActiveUsernames() function so that the mapNotNull() function has
a predicate that returns the username if it is active or a null value if it isn't:
*/


data class Users(val userName: String, val isActive: Boolean)

fun getActiveUsernames(userNames: List<Users>) =
    userNames.mapNotNull { user -> if (user.isActive) user.userName else null }

fun main() {
    val someUser =
        listOf(
            Users(userName = "Osei", isActive = true),
            Users(userName = "Boakye", isActive = true),
            Users(userName = "Isaac", isActive = false)
        )

    println(getActiveUsernames(userNames = someUser))
    // [Osei, Boakye]
}