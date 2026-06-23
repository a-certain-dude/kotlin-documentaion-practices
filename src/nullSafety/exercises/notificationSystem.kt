package nullSafety.exercises

/*
Exercise 1
You are developing a notification system for an app where users can enable or disable
different types of notifications. Complete the getNotificationPreferences()
function so that:

1. The validUser variable uses the as? operator to check if user is an instance of the
User class. If it isn't, return an empty list.

2. The userName variable uses the Elvis ?: operator to ensure that the user's name
defaults to "Guest" if it is null .

3. The final return statement uses the .takeIf() function to include email and
SMS notification preferences only if they are enabled.

4. The main() function runs successfully and prints the expected output.

The takeIf() function returns the original value if the given condition is true, otherwise it returns
null . For example:*/

data class User(val name: String?)
data class Doer(val name: String?)

// How i solved it
fun getNotificationPreferencesX(user: Any, emailEnabled: Boolean, smsEnabled: Boolean): List<String> {
    val validUser = user as? User ?: return emptyList()
    val userName = validUser.name ?: "Guest"
    return listOfNotNull(userName.takeIf {
        emailEnabled
    })
}

// How i solved it
fun getNotificationPreferences(user: Any, emailEnabled: Boolean, smsEnabled: Boolean): List<String> {
    val validUser = user as? User ?: return emptyList()
    val userName = validUser.name ?: "Guest"
    return listOfNotNull(
        "Email notification enabled for $userName".takeIf { emailEnabled },
        "SMS notification enabled for $userName".takeIf { smsEnabled }
    )
}


fun main() {
    val mansahUser = User("Mansah")
    val userIsNull = User(null)
    val doer = Doer("Mansah")

    //Here you the user is not an instance of the User class so it prints empty list
    val notifier = getNotificationPreferences(user = doer, emailEnabled = true, smsEnabled = true)
    println(notifier)

    println(getNotificationPreferences(mansahUser, emailEnabled = true, smsEnabled = true))
    println(getNotificationPreferences(userIsNull, emailEnabled = true, smsEnabled = true))
}