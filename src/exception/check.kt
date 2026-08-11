package exception

fun main() {
    var someState: String? = null

    fun getSomeState() {
//        checkNotNull(someState)
        check(checkNotNull(someState) { "State must be set beforehand" }.isNotEmpty()) {
            "state must be non-empty"
        }
    }


    getSomeState()

}