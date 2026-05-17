package classesAndInterfaces.properties

/*
Exercise 1 You manage an inventory system at a bookstore.
The inventory is stored in a list where each item represents the quantity of a specific book.
For example, listOf(3, 0, 7, 12) means the store has 3 copies of the first book,
0 of the second, 7 of the third, and 12 of the fourth.

Write a function called findOutOfStockBooks() that returns a list of
indices for all the books that are out of stock.

Hint 1 Use the indices extension property from the standard library.
Hint 2 You can use the buildList() function to create and manage a list instead of
manually creating and returning a mutable list.

The buildList() function uses a lambda with a receiver, which you learned about
in earlier chapters.
*/

fun findOutOfStockBooks(): List<Int> {
    val booksInStock = listOf(1, 0, 4, 0, 7)

    return buildList {
        for (index in booksInStock.indices)
            if (booksInStock[index] == 0)
                add(index)
    }

    /*
    * first of all we already have existing INDICES of booksInStock
    * now the problem is to find out that if any INDEX of booksInStock is 0(out of stock)
    * so now we need SOMETHING to move through the INDICES of booksInStock to check and
    * ask if that current INDEX of booksInStock is equal to 0.
    *
    * When it finds out that the value of that index is equal to 0 then it would
    * print that index
    * */

}

fun findOutOfStockBooksX(): List<Int> {
    val booksInStock = listOf(1, 0, 4, 0, 7)

    return buildList {
        for (index in booksInStock.indices)
            if (booksInStock[index] == 0)
                println(index)
    }

    /*
    * first of all we already have existing INDICES of booksInStock
    * now the problem is to find out that if any INDEX of booksInStock is 0(out of stock)
    * so now we need SOMETHING to move through the INDICES of booksInStock to check and
    * ask if that current INDEX of booksInStock is equal to 0.
    *
    * When it finds out that the value of that index is equal to 0 then it would
    * print that index
    * */

}


fun main() {
    println(findOutOfStockBooks())
    findOutOfStockBooksX()
}