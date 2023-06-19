import java.util.*

fun main() {
    // challengeLab1()
    challengeLab2()
}


fun challengeLab1() {
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