import java.util.*

fun main() {
    // challengeLab1()
    challengeLab2()
}


fun challengeLab1() {
    /*
    ■Challenge: Working with Nullables and If-Expression
Use the readline() function to read an input from the
command line.
Notice the return type of readline(), and use what you
learned to work with it.
The user should input their name.
If the user enters an empty string, store a default value.
Use an if expression to define a different greeting message
based on whether the user entered a name.



    */
    "Challenge 1".printColored(31)
    "Enter your Name :".print()
    val input = readln()
    val name = input.ifEmpty { "Guest" }  //  val name = if (input.isEmpty()) "Guest" else input

    val msg = when (name) {
        "Guest" -> "You are a Guest"
        else -> "Welcome $name"
    }
    msg.printColored(35)
}


fun challengeLab2() {
    /*

■Challenge2: Kotlin Collections and Loops
Create a collection of integers.
▲Use java.util.Random to fill the collection with 100
random numbers between 1 and 100.
Go through the collection from start to end and print
its elements up to the point where an element is less
than or equal to 10 (Do it without using "if" or "when").
■ Hints:
Make sure you import java.util.Random (same syntax as Java).
If you can't elements to your collection, think about the type of
collection you are using.
To avoid "if", you may need to use a different type of loop.

    */
    "Challenge 2".printColored(31)
    val r = Random()
    val array = IntArray(100)
    for (i in array.indices) {
        array[i] = r.nextInt(0, 100)

    }
    array.joinToString().print()
    println()

    var index = 0
    while (index < array.size && array[index] > 10) {
        " ${array[index]} ".print()
        index++
    }
}