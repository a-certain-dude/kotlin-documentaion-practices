package scopefunctions

/*
Exercise 2
You have an updateEmail() function that updates the email address of a user.
Use the apply scope function to update the email address and then the also scope
function to print a log message: Updating email for user with ID: ${it.id}.*/

data class User(val id: Int, var email: String)

fun updateEmail(user: User, newEmail: String, oldEmail: String) =
    user.apply { this.email = newEmail }
        .also { id -> println("Updating email for user with ID:${id.id} ") }
        .apply { this.email = oldEmail }
        .also { email -> println("Updating ${email.email} to  $newEmail") }


fun main() {
    val user = User(2, "ofakyei@asato.com")
    val update = updateEmail(user = user, "me-nim-no-din@asato.com", oldEmail = user.email)

}