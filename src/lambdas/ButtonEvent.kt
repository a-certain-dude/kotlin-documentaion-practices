package lambdas

/*
Exercise 2
You have a Button class and ButtonEvent and Position data classes.
Write some code that triggers the onEvent() member function of the Button
class to trigger a double-click event. Your code should print "Double click!".*/

class Button {
    fun onEvent(action: ButtonEvent.() -> Unit) {
        val event = ButtonEvent(false, amount = 2, position = Position(100, 200))
        event.action() // trigger the callBack
    }
}

data class ButtonEvent(val isRight: Boolean, val amount: Int, val position: Position)

data class Position(val x: Int, val y: Int)

fun main() {
    Button().apply {
        this.onEvent {
            if (!isRight && amount == 2)
                println("double-click")
        }
    }

}