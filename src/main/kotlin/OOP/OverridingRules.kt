package OOP

import Basics.println

open class Base(open val x: Int = 5) {
    open fun test() {
        "Inside Base Class".println()
    }
}

interface Interface {
     fun test() {
        "Inside Interface".println()
    }
}


class ChildINH(override var x: Int) : Base(x),Interface {
    override fun test() {
         super<Interface>.test()
         super<Base>.test()
    }

}

fun main() {
    val cl=ChildINH(5)
    cl.test()
}