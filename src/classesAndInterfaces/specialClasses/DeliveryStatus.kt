package classesAndInterfaces.specialClasses

/*
Exercise 1
You manage a delivery service and need a way to track the status of packages.
Create a sealed class called DeliveryStatus, containing data classes to represent the
following statuses: Pending, InTransit, Delivered, Canceled.
Complete the DeliveryStatus class declaration so that the code in the main()
function runs successfully:*/

sealed class DeliveryStatus {
    data class Pending(val sender: String)
    data class InTransit(val estimatedDeliveryDate: String)
    data class Delivered(val recipient: String, val deliveryDate: String)
    data class Canceled(val reason: String)
}




