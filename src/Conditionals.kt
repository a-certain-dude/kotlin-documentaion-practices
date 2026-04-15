import kotlin.random.Random

object Conditionals {
    /*
     Exercise1
     Create a simple game where
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

    /*
      Exercise 2
      Using a when expression,
      update the following program
      so that it prints the corresponding
      actions when you input the names of game console buttons.*/
    fun whenCondition() {
        val button = "Y"
        val console = when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There's no such button"
        }

        println(console)

    }

}