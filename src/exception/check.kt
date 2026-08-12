package exception

fun main() {
    var someState: String? = null

    fun getSomeState():String {
        val checkState = checkNotNull(someState) {
            "state must be set beforehand"
        }
        check(checkState.isNotEmpty()) {
            "state must be non-empty"
        }
        return checkState
    }

    someState = ""
    someState = "state-not empty"

    println(getSomeState())

}

fun checkString(string: String?){
    check(string!=null)
    println(string.length)
}