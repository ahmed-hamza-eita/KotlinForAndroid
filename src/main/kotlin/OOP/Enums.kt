package OOP

import Basics.println

enum class Directions(val degrees:Int) {
    NORTH(0), EAST(90), SOUTH(180), WEST(270)
}

fun main() {
    Directions.EAST.println()
    Directions.EAST.degrees.println()
}