package exception

open class WithdrawalException(message: String) : Exception(message)
class InsufficientFundsException(message: String) : WithdrawalException(message)

fun processWithdrawal(amount: Double, availableBalance: Double) {

    //When withdrawing at the bank, the amount you enter must either be less or equal to amount left in you bank account
    if (amount > availableBalance) {
        throw InsufficientFundsException("Insufficient amount of money")
    }

    // the double pipe symbol stands for
    if (amount < 1 || amount % 1 != 0.0) {
        throw WithdrawalException("Invalid withdrawal amount.")
    }

    println("Withdrawal Processed.")
}

fun divideOrNull(a: Int): Int {

// The try block is always executed
// An exception here (division by zero) causes an immediate jump to the catch block
    try {
        val b = 44 / a
        println("try block: Executing division:$b")
        return b
    }
    // The catch block is executed due to the ArithmeticException (division by zero if a ==0)
    catch (e: ArithmeticException) {
        println("Catch block: Encountered arithmetic exception $e")
        return -1
    } finally {
        println("finally block: The finally is always executed")
    }


}


fun main() {
    val availableFunds = 500.0
    val withdrawalAmount = 500.5

    try {
        processWithdrawal(amount = withdrawalAmount, availableBalance = availableFunds)
    }
    //Using Multiple catch blocks
    // The order of the catch blocks are very important

    catch (e: InsufficientFundsException) {
        println("Caught an InsufficientFundsException: ${e.message}")
    } catch (e: WithdrawalException) {
        println("Caught a WithdrawalException: ${e.message}")
    }

    // Change this value to get a different result. An ArithmeticException will return: -1
    println(divideOrNull(4))

}

