package Functional_Programming


import Basics.printColored
import Basics.println
import kotlin.system.measureTimeMillis

fun main() {
    take_drop()
    lazy()

}


fun take_drop() {

    val list = (1..1000).toList()
    "Take".printColored(31)
    list.take(10).println() //will print first 10 elements
    list.takeLast(10).println() //will print Last 10 elements
    "Drop".printColored(31)
    list.drop(100).println() //will print From element 101 (101 to 1000)
    list.dropLast(100).println() //will print all except last 100 elements (1 to 900)


    // generateSequence(0) { it + 10 }.joinToString ().println() ->  Memory Exception
    generateSequence(0) { it + 10 }.take(10).joinToString().println()


}

fun lazy() {
    val longList = (0..9999999L).toList()

    var sum = 0L
    val timeMS = measureTimeMillis {
        sum = longList.filter { it > 50 }.map { it * 2 }.take(1000).sum()
    }

    "$sum  in $timeMS Ms".println()

    var sumLazy = 0L
    val timeMSLazy = measureTimeMillis {
        sumLazy = longList.asSequence().filter { it > 50 }.map { it * 2 }.take(1000).sum()
    }
    "$sumLazy in $timeMSLazy Ms Lazy".println()

}