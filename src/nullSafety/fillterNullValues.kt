package nullSafety

val emails: List<String?> =
    mutableListOf(
        "kwame@gmail.com", "Abena@gmail.com", null,
        "Abena@gmail.com", null
    )

val validEmail = emails.filterNotNull()

/*******listOfNotNull*******/
val serverConfig: Map<String, String?> = mutableMapOf(
    "appConfig.json" to "App Configuration",
    "dbConfig.json" to null
)
const val requestedFile = "appConfig.json"
val configFiles: List<String> = listOfNotNull(serverConfig[requestedFile])

val numbersToNumerals: Map<Int, String> = mapOf(
    1 to "One",
    2 to "Two",
    3 to "Three",
    4 to "Four",
    5 to "Five",
    6 to "Six",
    7 to "Seven",
    8 to "Eight",
    9 to "Nine",
    10 to "Ten",
)
//If you want to perform filtering of null
// values directly when creating a list,
// use the listOfNotNull() function:
val filterNumbers = listOfNotNull(numbersToNumerals[1])

fun printList(listOfNumbers: MutableList<Int>): MutableList<Int> {
    listOfNumbers.add(1)
    listOfNumbers.add(2)
    listOfNumbers.add(3)
    listOfNumbers.add(4)
    listOfNumbers.add(5)
    listOfNumbers.add(6)
    listOfNumbers.add(7)
    listOfNumbers.add(8)
    listOfNumbers.add(9)
    listOfNumbers.add(10)
    listOfNumbers.add(11)
    return listOfNumbers
}

const val requestedFile = "appConfig.json"
val configFiles: List<String> = listOfNotNull(serverConfig["dbConfig.json"])

fun main() {
    println(validEmail)
    println(configFiles)
    println(printList(mutableListOf()))
}

