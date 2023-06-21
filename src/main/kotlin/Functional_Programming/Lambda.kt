package Functional_Programming

import Basics.println

fun main() {
    multiplyByTwo(5).println()
    multiplyByThree(5).println()
}


// var FunName : (Input Type) -> Output Type {inputName -> OutputOperation }
var multiplyByTwo: (Int) -> Int = { num ->
    num * 2
}

// var FunName = {inputName:Type -> OutputOperation }

var multiplyByThree = { num: Int ->
    num * 3
}