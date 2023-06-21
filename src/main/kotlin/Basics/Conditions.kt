package Basics

fun main() {
    ifStatement()
    whenStatement()

}

fun ifStatement() {
    "\t If statement \t".printColored(31)
    val x = 10
    val msg: String = if (x > 5) {
        "value is big"
    } else {
        "value is small"
    }
    msg.println()

    val y: String? = null
    if (y != null) {
        y.length
        y.take(4)
    }
}

fun whenStatement() {
    "\t  when statement \t".printColored(31)
    val price = 15

    " TEST 1 ".printColored(33)
    when (price) {
        0 -> println("For free")
        in 1..19 -> println("For sale")
        in 20..29 -> println("No sale")
        else -> println("Overloaded")
    }

    " TEST 2 ".printColored(33)
    val msg: String = when (price) {
        0 -> "For free"
        in 1..19 -> "For sale"
        in 20..29 -> "No sale"
        else -> "Overloaded"
    }
    msg.println()


    " TEST 3 ".printColored(33)
    val msg2: String = when {
        price == 0 -> "For free"
        price in 1..19 -> "For sale"
        price in 20..29 -> "No sale"
        else -> "Overloaded"
    }
    msg2.println()

    // In when if two conditions are true then print the only first condition and break
}