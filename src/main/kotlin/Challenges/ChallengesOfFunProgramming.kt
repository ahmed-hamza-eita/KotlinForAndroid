package challenges

import Basics.println

fun main() {
    challenge1()
}

fun challenge1() {
    /*
■Challenge:Apply functional programming for simple data analysis
We decided to gather data on the age of our users.
In this challenge, you'll be presented with this partly faulty data of user
ages which is based on four input files:

val data = mapof(
"usersl.csv” to listOf (32, 45, 17, -1, 34),
“users2.csv” to listOf (19, −1, 67, 22),
"users3.csv” to listOf (),
"users4.csv" to listof (56, 32, 18, 44)
)
Apply the functions you learned about (as well as other functions from
Kotlin's standard library) to solve the following data analysis tasks:
1. Find the average age of users (use only valid ages for the calculation!).
2. Extract the names of input files that contain faulty data.
3. Count the total number of faulty entries across all input files.
Hints:
map() and flatlMap() are often very useful functions for such tasks.
Use Intellij's autocompletion to explore which other functions, that were not
presented in the lectures, are available (they will greatly simplify the tasks).    */

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    data.flatMap { it.value }.filter { it > 0 }.average().println()
    data.filter { it.value.any { it < 0 } }.keys.println()
    data.flatMap { it.value }.count { it < 0 }.println()


}

