package Basics

fun main() {
    testNullSafety()
}

fun testNullSafety() {
    "Null safety".printColored(31)
    ////Null Safety
    var n1: Int? = 5
    /*
    if x = anyValue then print this value
    if x = null then print null
    */
    println(n1?.dec())


////Not Null Assertion (not recommended)
    var n2: Int? = 5
    /*
    I'm sure -> n2 not equal null
    */
    println(n2!!.dec())


    //Example
    var i: Int? = 5
    //var f: Float? = i?.toFloat()
    val f: Float = i?.toFloat() ?: 1f   //  (?: if) Called Elvis operator
    /*
    if x = null then print 1f else convert to float
    */
    println(f)
}