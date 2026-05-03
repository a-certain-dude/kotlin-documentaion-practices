package lambdas


/*
Lambda expressions with receiver are helpful when you want to create a
domain-specific language (DSL).
Since you have access to the receiver's member functions
and properties without explicitly referencing the receiver, your code becomes leaner.
To demonstrate this, consider an example that configures items in a menu.
Let's begin with a MenuItem class and a Menu class that contains a function to add items
to the menu called item(), as well as a list of all menu items items:*/

data class ItemOnMenu(val name: String)
class Menu(val name: String) {
    val items = mutableListOf<ItemOnMenu>()
    fun addItems(name: String) {
        items.add(ItemOnMenu(name = name))
    }
}
/*Let's use a "lambda expression with receiver" passed as a function parameter
called init to the menu() function that builds a menu as a starting point:*/

fun menuBuilder(name: String, init: Menu.() -> Unit): Menu {
    val menu = Menu(name = name)
    menu.init()
    return menu
}

fun printMenu(menu: Menu) {
    println(" Menu : ${menu.name}")
    menu.items.forEach {
        println(it.name)
    }
}

fun main() {

    val builder = menuBuilder("main menu") {
        addItems("Benku")
        addItems("Fufu")
        addItems("Ampesie")
        addItems("Kontomire")
    }

    printMenu(builder)

}
