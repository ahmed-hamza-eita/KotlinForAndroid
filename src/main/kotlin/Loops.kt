fun main() {
    forStatement()
    whileStatement()
}


fun forStatement() {
    "For Statement".printColored(31)
    for (i in 1..10 step 2) {
        " $i ".print()
    }
    println()

    //Iterate over Character
    val s1 = "KOTLIN"
    for (i in s1) {
        " $i ".print()
    }
    println()


    val s2 = "Ahmed Hamza".lowercase()
    var count = 0
    for (i in s2) {
        if (i == 'a') {
            count++
        }
    }
    " $count ".println()


    for (i in 10 downTo 0 step 2) {
        " $i".print()
    }
    println()


    val list = listOf("Kotlin", 5, 6, "Java")
    for (i in list) {
        " $i ".print()
    }
    println()

}

fun whileStatement() {
    "While Statement".printColored(31)

    //while
    var i = 0
    while (i <= 10) {
        " $i ".print()
        i++
    }
    println()

    //do While
    var i2 = 12
    do {
        " $i2 ".print()
        i2++
    } while (i2 <= 10)

    println()
}
