package classesAndInterfaces

/*
Exercise 2
Create an interface called Media that you can use to implement specific media
classes like Audio, Video, or Podcast. Your interface must include:
A property called title to represent the title of the media.
A function called play() to play the media.

Then, create a class called Audio that implements the Media interface.
The Audio class must use the title property in its constructor as well as have an
additional property called composer that has String type.
In the class, implement the play() function to print the following:
"Playing audio: $title, composed by $composer".
Hint
You can use the override keyword in class headers to implement a property from an interface in the constructor.*/
interface Media {
    val title: String
    fun play()
}

class Audio(override var title: String = "Billionz") : Media {
    private var composer = "Gavin Shisha"
    override fun play() {
        println("Playing audio: $title, composed by $composer")
    }
}

fun main() {
    Audio().apply {
        play()
    }
}