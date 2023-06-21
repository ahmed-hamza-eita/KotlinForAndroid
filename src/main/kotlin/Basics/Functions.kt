package Basics

fun main() {
    // permitAccess(19).println()
    //permitAccess(19, 18, 20, 22, 16).println()

    val list = listOf("Java", "Android", "Kotlin")
    concatList(list, " ! ").println()
    concatList(list).println() //Default argument (separator -> :)
    concatList(separator = " ! ", list = list).println() //Named Argument
}

fun permitAccess(age: Int) = age >= 18


//Function with parameter which takes collection of values using (vararg)
fun permitAccess(vararg ages: Int): Boolean {
    for (i in ages) {
        if (i < 18)
            return false
    }
    return true
}

//Named argument and Default argument
fun concatList(list: List<String>, separator: String = ":") =
    list.joinToString(separator)


