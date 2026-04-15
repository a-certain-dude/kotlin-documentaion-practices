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
}