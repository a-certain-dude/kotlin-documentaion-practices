package destructuring

// There are times when you want to de-structure an object into a number of variables
// It allows you to create multiple variables at once.

data class User(val name: String, val mail: String)

fun main() {
// You can use the variables independently

    val user = User("Kwame", "kwame@kmail.com")

    //using destructuring
    val (name, mail) = user

    println(name)
    println(mail)


    //the normal way
    val normalName = user.name
    val normalMail = user.mail

    println(normalName)
    println(normalMail)


}
