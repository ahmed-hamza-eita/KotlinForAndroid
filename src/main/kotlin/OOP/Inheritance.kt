package OOP

import Basics.println

//open -> to make class to be inherited

open class Parent() {

    // open -> with variable and methods to override them in child class
    open var x: Int = 5
    open fun printing() {
        x.println()
    }
}

class Child : Parent() {
    override var x: Int = 5
    override fun printing() {
        x.println()
    }
}

fun main() {
    val child = Child()


}