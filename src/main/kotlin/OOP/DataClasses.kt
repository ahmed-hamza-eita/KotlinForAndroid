package OOP

import Basics.printColored
import Basics.println

data class Address(val name: String, val city: String, val number: Int) {

    // Instead of overriding these methods using DataClass
    /*
    override fun toString(): String {
        return "Address name  :$name , city :$city , number :$number "
    }

// to check of equality of two objects
    override fun equals(other: Any?): Boolean {
        val temp: Address = other as Address
        return (temp.name == name && temp.city == city && temp.number==number)
    }

     */
}

fun main() {
    val address1 = Address("address", "city", 0)
    val address2 = Address("address", "city", 0)

    address1.printColored(31)
    (address1 == address2).println()
    (address1 === address2).println()

    val address3 = address1.copy()
    address3.println()

    //Destructor
    /*
    val name = address1.name
    val city = address1.city
    val number = address1.number
     */
    //instead of using above code  using the following code

    val (name, city, number) = address1
    "Name = $name , City = $city , Number = $number".println()

    val (n, _, num) = address2
    "Name = $n ,  Number = $num" .println()


}