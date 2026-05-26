package nullSafety

val emails: List<String?> =
    mutableListOf(
        "kwame@gmail.com", "Abena@gmail.com", null,
        "Abena@gmail.com", null
    )

val validEmail = emails.filterNotNull()
fun main() {
    println(validEmail)
}
