package Basics
fun main() {
    val x = 5
    (x.isEven()).println()
    (x.isOdd()).println()

    (5 addAndCheckEven 1).println()
    (5 addAndCheckOdd 10).println()
}

fun Any?.println() {
    println(this)
}

fun Any?.print() {
    print(this)
}

fun String.printColored(color: Int) {
    println("\u001B[${color}m$this\u001B[0m")  //31 red color
}

fun Int.isEven() = this % 2 == 0
fun Int.isOdd() = this % 2 != 0




//InFix method (only have one parameter)
infix fun Int.addAndCheckEven(num: Int) =
    (this + num).isEven()
// calling such 5 addAndCheckEven 1 (add 1 on 5 then check)

infix fun Int.addAndCheckOdd(num: Int) =
    (this + num).isOdd()