package nullSafety.exercises

/*
Exercise 2
You are working on a subscription-based streaming service where users can have multiple
subscriptions, but only one can be active at a time.
Complete the getActiveSubscription() function so that it uses the singleOrNull()
function with a predicate to return a null value if there is more than
one active subscription:
*/

data class Subscription(val name: String, val isActive: Boolean)

fun getActiveSubscription(subscription: List<Subscription>): Subscription? {
    val getSub: Subscription? = subscription.singleOrNull { it.isActive }
    return getSub
}

fun main() {

    val subscriptionList = listOf(
        Subscription(name = "Entertainment", false),
        Subscription(name = "Worship", false),
        Subscription(name = "Reading", false),
        Subscription(name = "News", false),
        Subscription(name = "DoItYourself", true)
    )
    println(getActiveSubscription(subscription = subscriptionList))
}