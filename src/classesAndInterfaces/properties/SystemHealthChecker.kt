package classesAndInterfaces.properties

/*Exercise 3
You have a system health checker that can determine the state of a cloud system.
However, the two functions it can run to perform a health check are performance intensive.
Use lazy properties to initialize the checks so that the expensive functions
are only run when needed:*/

fun checkAppServer(): Boolean {
    println("Performing application server health check...\n")
    return false
}

fun checkDatabase(): Boolean {
    println("Performing database health check...")
    return true
}

fun main() {
    val isAppServerHealthy: Boolean by lazy {checkAppServer()}
    val isDatabaseHealthy: Boolean by lazy {checkDatabase()}

    when {
        isAppServerHealthy -> println("Application server is online and healthy")
        isDatabaseHealthy -> println("Database is healthy")
        else -> println("System is offline")
    }
}
