package objectDeclaration

/*
Exercise 1
You run a coffee shop and have a system for tracking customer orders.
Consider the code below and complete the declaration of the second data object so that the
following code in the main() function runs successfully:*/

interface Order {
    val orderId: String
    val customerName: String
    val orderTotal: Double
}