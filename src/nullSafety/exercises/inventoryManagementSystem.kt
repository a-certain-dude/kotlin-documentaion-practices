package nullSafety.exercises

/*
Exercise 4
You are working on an inventory management system for an e-commerce platform. Before processing
a sale, you need to check if the requested quantity of a product is valid based on the available stock.
Complete the validateStock() function so that it uses early returns and the
Elvis operator (where applicable) to check if:
• The requested variable is null .
• The available variable is null .
• The requested variable is a negative value.
• The amount in the requested variable is higher than in the available variable.
In all of the above cases, the function must return early with the value of -1 .
*/

fun validateStock(requested: Int?, available: Int?): Int {
    val validateRequested = requested ?: -1
    val validateAvailable = available ?: -1

    if (validateRequested < 0) return -1
    if (validateRequested > validateAvailable) return -1

    return validateRequested

}

fun main() {
    println(validateStock(3, 7))
}
