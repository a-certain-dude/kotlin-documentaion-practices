import kotlin.random.Random

object Conditionals {
    /* Create a simple game where
     you win if throwing two dice
     results in the same number.
     Use if to print You win :) if the dice match, or You lose :( otherwise.*/

    fun ifCondition() {
        val firstResult = Random.nextInt(until = 6)
        val secondResult = Random.nextInt(until = 6)

        if (firstResult == secondResult)
            println("You win :)")
        else
            println("You loose :(")
    }

}