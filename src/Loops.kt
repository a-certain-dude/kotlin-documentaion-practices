object Loops {
    /* Exercise 1
       You have a program that
       counts pizza slices until
       there's a whole pizza with 8 slices.
       Refactor this program in two ways:

       Use a while loop.
       Use a do-while loop.*/
    fun whileLoop() {
        var pizzaSlice = 1
        while (pizzaSlice < 9) {
            if (pizzaSlice == 1)
                println("There is only $pizzaSlice slice of pizza :(")
            else
                println("There are only $pizzaSlice slices of pizza :(")
            pizzaSlice++
        }
    }

    fun doWhileLoop() {
        var pizzaSlices = 1
        do {
            if (pizzaSlices == 1)
                println("There is only $pizzaSlices slice of pizza :(")
            else
                println("There are only $pizzaSlices slices of pizza :(")
            pizzaSlices++
        } while (pizzaSlices < 8)
    }

    /*
     Exercise 2
     Write a program that simulates the Fizz buzz game.
      Your task is to print numbers from 1 to 100 incrementally,
      replacing any number divisible by three with the word
     "fizz", and any number divisible by five with the word "buzz".
      Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".

     Hint 1
     Use a for loop to count numbers and a when expression
     to decide what to print at each step.
     Hint 2
     Use the modulo operator (%) to return the
     remainder of a number being divided.
     Use the equality operator (==) to check if the remainder equals zero.*/

    fun forLoopFizzBuzz() {
        for (count in 1..100) {
            println(
                when {
                    count % 3 == 0 -> "Fizz$count"
                    count % 5 == 0 -> "Buzz$count"
                    else -> "$count"
                }
            )
            println()
            if (count % 3 == 0 && count % 5 == 0) {
                println("fizzBuzz$count")
            }
        }
    }

    /*Exercise 3
     You have a list of words.
     Use for and if to print only the words that start with the letter l.*/

    fun findLetterL(){
        val words = listOf("dinosaur","magazine","language","limousine","Laziness")
        for (word in words){
            if (word.startsWith("l")){
                println(word)
            }
        }
    }

}