fun Any?.println() {
    println(this)
}
<<<<<<< HEAD
fun Any?.print() {
    print(this)
}
=======
>>>>>>> origin/master

fun String.printColored(color: Int) {
    println("\u001B[${color}m$this\u001B[0m")  //31 red color
}