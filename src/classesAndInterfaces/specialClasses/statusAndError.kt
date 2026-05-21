package classesAndInterfaces.specialClasses

/*
Exercise 2
In your program, you want to be able to handle different statuses and types of errors.
You have a sealed class to capture the different statuses which are declared in
data classes or objects.
Complete the code below by creating an enum class called Problem that represents
the different problem types: NETWORK, TIMEOUT, and UNKNOWN.*/

sealed class Status {
    data object Loading : Status()
    data class Error(val problem: Problem) : Status() {
        enum class Problem {
            NETWORK, TIMEOUT, UNKNOWN
        }
    }

    data class OK(val data: List<String>) : Status()
}

fun handleStatus(status: Status) {
    when (status) {
        is Status.Loading -> println("Loading......")
        is Status.OK -> println("Data received  ${status.data}")
        is Status.Error -> when (status.problem) {
            Status.Error.Problem.NETWORK -> println("Network issues")
            Status.Error.Problem.TIMEOUT -> println("Timeout")
            Status.Error.Problem.UNKNOWN -> println("Unknown issue")
        }

    }

}

fun main() {
    handleStatus(status = Status.Loading)
    handleStatus(status = Status.OK(listOf("docx", "pptx", "excl")))
    handleStatus(status = Status.Error(Status.Error.Problem.NETWORK))

}