package Functional_Programming

fun main() {

}

fun test1(lambda: () -> Unit) {
    var a = lambda
    lambda to ""
    test2(lambda)

}

inline fun test2(lambda: () -> Unit) {

}

inline fun test3(noinline lambda: () -> Unit, lambda2: () -> Unit) {
    var a = lambda
    lambda to ""
    test2(lambda)

}