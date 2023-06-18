fun main() {
    challengeLab1()
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
}