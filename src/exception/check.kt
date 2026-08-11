package exception

fun main() {
    var someState: String? = null

    fun getSomeState() {
        val checkState = checkNotNull(someState) {
            "state must be set beforehand"
        }
        check(checkState.isNotEmpty()) {
            "state must be non-empty"
        }
    }

    someState = ""

    getSomeState()

}