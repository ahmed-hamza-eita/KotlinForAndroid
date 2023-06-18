fun main() {
    lists()
    array()
    set()
    map()

}


fun lists() {
    "Lists ".printColored(31)
    //ReadOnly list
    val readOnly: List<Int> = mutableListOf()
    //Read and write list
    val read_and_write: MutableList<Int> = mutableListOf()


    val l1 = mutableListOf(1, 2, 3, 4, 5, 5, 6)
    l1.add(5, 6) //add element 6 at index 5
    l1[5] = 6 //add element 6 at index 5
    l1.println() // will print values of list in square brackets
    l1.joinToString().println() // will print values of list
}

fun array() {
    "Array ".printColored(31)
    val array = arrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8)
    array.println() // will print address
    array.joinToString().println() // will print values of array
}

fun set() {
    //Set remove Deduplicate values
    "Set".printColored(31)
    val s1: MutableSet<Int> = mutableSetOf(1, 2, 2, 2, 3, 4, 5, 5, 8) //Read and write
    val s2: Set<Int> = mutableSetOf(1, 2, 2, 2, 3, 4, 5, 5, 8) //Read Only
    s1.println()  // will print values of set in square brackets
    s1.joinToString().println() // will print values of list
}

fun map() {
    val map1: MutableMap<Int, String> = mutableMapOf(
        Pair(1, "Kotlin"),
        Pair(2, "Java"),
        Pair(3, "Android")
    )
    map1[4] = "BACK"
    val map2: MutableMap<Int, String> = mutableMapOf(
        1 to "Kotlin", 2 to "Java", 3 to "Android"
    )
    map2[4] = "BACK"
    //will print such {1=Kotlin, 2=Java, 3=Android}
    map1.println()
    map2.println()

}