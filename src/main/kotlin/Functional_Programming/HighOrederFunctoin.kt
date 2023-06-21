package Functional_Programming

import Basics.*

fun main() {
    times(3) { it * 3 }.println()
    times(3, multiplyByThree).println()

    filter()
    map()
    flatMap()
    zip()
}


//input or output could be an another function
fun times(num: Int, timesLambda: (Int) -> Int): Int {
    "Example an High Order Function".printColored(31)
    return timesLambda(num)
}


val list = (0..100).toList()
fun filter() {
    "Filter".printColored(31)
    (list.filter() { it > 50 }).println()
    list.myFilter { it > 90 }.println() // using MyFilter in Extension Function

}

fun map() {
    "Map".printColored(31)
    list.map { it * 0.5 }.println()
}

fun flatMap() {
    //Working with nested Loops
    "FlatMap".printColored(31)
    val nestedList = listOf(
        (0..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    "Using Map".printColored(33)
    nestedList.map { it.sortedDescending() }.println()

    "Using FlatMap".printColored(33)
    nestedList.flatMap { it.sortedDescending() }.println() //Sorted each list then converting thm to one list
    nestedList.flatMap { it }.sortedDescending().println() //Converting the nestedList to one List (Flatten)  then sort

}

fun zip() {
    "Zip".printColored(31)
    val stringList = listOf("Welcome", "Ahmed", "Hamza")
    val containCharA = listOf(false, true, true)
    stringList.zip(containCharA).joinToString().println()



    stringList.zip(stringList.map { it.contains('a', true) })
        .println() //same output as above (instead creating another list)
}