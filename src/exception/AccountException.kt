package exception

// Custom exception Base class hierarchy as sealed for account-related error
sealed class AccountException(message: String, cause: Throwable? = null) :
    Exception(message, cause)

// creates a subclass of AccountException
class InvalidAccountCredentialException : AccountException("Invalid Account Exception")

// creates a subclass of AccountException, adds its own custom messages and causes
class APIkeyExpiredException(message: String = "API key expired", cause: Throwable? = null) :
    AccountException(message, cause)


fun areCredentialsValid(): Boolean = true
fun isApiKeyExpired(): Boolean = true

// validateAccountCredentials and appKey
fun validateApiCredentials() {
    if (!areCredentialsValid())
        throw InvalidAccountCredentialException()
    println("**")
    if (isApiKeyExpired()) {
        val cause = RuntimeException("API key validation failed due to network error")
        throw APIkeyExpiredException(cause = cause)
    }
}

fun main() {
    try {
        validateApiCredentials()
    } catch (e: AccountException) {
        println("Error has occurred: ${e.message}")
        // it is going to print the value of cause since is not null
        e.cause?.let { println("caused by: ${it.message}") }
    }
}