package standardLibrary
data class NamesToRevers(val region: String, val capitalCity: String)

fun main() {
    val names = listOf(
        NamesToRevers("Oti region", "Dambai"),
        NamesToRevers("Greater Accra region", "Accra"),
        NamesToRevers("Volta region", "Ho"),
        NamesToRevers("Central region", "koforidua"),
        NamesToRevers("Ashanti region", "kumase"),
    )

    names.forEach {
        println("${it.region.reversed()} ${it.capitalCity.reversed()}")
    }
}