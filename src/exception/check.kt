package exception

fun main() {
    var someState: String? = null


//        checkNotNull(someState)
        check(checkNotNull(someState).isNotEmpty()) {
            "state must be non-empty"
        }
    }


    someState = ""

    someState = "some"
    getSomeState()
}