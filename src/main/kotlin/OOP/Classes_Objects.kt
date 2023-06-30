import Basics.println

class City() {
    var population: Int = 0
    var name: String? = null

}

fun main() {
    val city = City()
    city.population = 5000
    city.name = "MU"

    ("${city.population}\n${city.name}").println()

}