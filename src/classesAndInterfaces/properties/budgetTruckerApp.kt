package classesAndInterfaces.properties

import kotlin.properties.Delegates
import kotlin.properties.Delegates.observable

/*
Exercise 4
You're building a simple budget tracker app.
The app needs to observe changes to the user's remaining budget and notify them
whenever it goes below a certain threshold.
You have a Budget class that is initialized with a totalBudget property that contains
the initial budget amount. Within the class, create an observable property called
remainingBudget that prints:
• A warning when the value is lower than 20% of the initial budget.
• An encouraging message when the budget is increased from the previous value.*/
class BudgetX(val totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { _, oldValue, newValue ->
        if (newValue < totalBudget * 0.2) {
            println("Warning: Your remaining budget ($newValue) is below 20% of your total budget.")
        } else if (newValue > oldValue) {
            println("Good news: Your remaining budget increased to $newValue.")
        }
    }
}
//
class Budget(private var totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { _, initVal, new ->
        if (new > 20)
            println("$$initVal Budget has been increased to -> $$new")
        else
            println("Budget of $$initVal decreased to $$new")
    }
}


fun main() {
    Budget(100).apply {
        this.remainingBudget = 80
        this.remainingBudget = 690

    }

}

