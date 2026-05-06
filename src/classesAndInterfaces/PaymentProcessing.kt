package classesAndInterfaces

Exercise 3
You're building a payment processing system for an e-commerce application. Each payment method needs to be able to authorize a payment and process a
transaction. Some payments also need to be able to process refunds.
1. In the Refundable interface, add a function called refund() to process refunds.
2. In the PaymentMethod abstract class:
    Add a function called authorize() that takes an amount and prints a message containing the amount.
Add an abstract function called processPayment() that also takes an amount.
3. Create a class called CreditCard that implements the Refundable interface and PaymentMethod abstract class. In this class, add implementations for the refund()
and processPayment() functions so that they print the following statements:
"Refunding $amount to the credit card."
"Processing credit card payment of $amount."