package classesAndInterfaces.specialClasses

/*
Exercise 1
You manage a delivery service and need a way to track the status of packages.
Create a sealed class called DeliveryStatus, containing data classes to represent the
following statuses: Pending, InTransit, Delivered, Canceled.
Complete the DeliveryStatus class declaration so that the code in the main()
function runs successfully:*/

sealed class DeliveryStatus {
    data class Pending(val sender: String) : DeliveryStatus()
    data class InTransit(val estimatedDeliveryDate: String) : DeliveryStatus()
    data class Delivered(val recipient: String, val deliveryDate: String) : DeliveryStatus()
    data class Canceled(val reason: String) : DeliveryStatus()
}

fun trackDeliveryStatus(status: DeliveryStatus) {
    when (status) {
        is DeliveryStatus.Pending -> {
            println("The package is pending pickup from: ${status.sender}")
        }

        is DeliveryStatus.InTransit -> {
            println("The package is in transit, estimated time to arrive: ${status.estimatedDeliveryDate}")
        }

        is DeliveryStatus.Delivered -> {
            println("The package has been received by : ${status.recipient}, date delivered: ${status.deliveryDate}")
        }

        is DeliveryStatus.Canceled -> {
            println("Why did you cancel it: ${status.reason}")
        }

    }

}


fun main() {
    trackDeliveryStatus(DeliveryStatus.Pending("Mama Adwoa Miensah"))
    trackDeliveryStatus(DeliveryStatus.InTransit("1-05-2036"))
    trackDeliveryStatus(DeliveryStatus.Delivered("Otonfuour Yaw", "2-08-2027"))
    trackDeliveryStatus(DeliveryStatus.Canceled("Hmmmm i just didn't like it!"))
}