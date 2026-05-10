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

data object OrderOne : Order {
    override val orderId: String = "001"
    override val customerName: String = "Joseph"
    override val orderTotal: Double = 34.1
}

data object OrderTwo : Order {
    override val orderId: String = "235"
    override val customerName: String = "Joan"
    override val orderTotal: Double = 23.4
}

data object CoffeeShop {
    val order = OrderOne.apply {
        println(orderId)
        println(customerName)
        println(orderTotal)
    }

    val anotherOrder = OrderTwo.apply {
        println(orderId)
        println(customerName)
        println(orderTotal)
    }
}

fun main() {
    println("Order name: $OrderOne")
    println("Order name: $OrderTwo")

    if (OrderOne.equals(OrderTwo)) {
        println("The orders are identical.")
    } else {
        println("The orders are unique.")
        // The orders are unique.
    }
    if (OrderOne.equals(OrderTwo)) {
        println("The orders are identical.")
    } else {
        println("The orders are unique.")
        // The orders are unique.
    }

    CoffeeShop.order
    CoffeeShop.anotherOrder

}
