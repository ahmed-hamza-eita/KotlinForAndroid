fun Any?.println() {
    println(this)
}

fun Any?.print() {
    print(this)
}

fun String.printColored(color: Int) {
    println("\u001B[${color}m$this\u001B[0m")  //31 red color
}