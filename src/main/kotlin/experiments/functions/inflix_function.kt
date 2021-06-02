package experiments.functions

fun main(args: Array<String>) {
    println("infix function")
    println("---------------")

    val a = true
    val b = false

    val result = a or b // or is infix function
    println("Result is $result")
    println("==========================")

    val x = 10.add(20)
    println("Value of x is $x")

    val y = 40 add 50
    println("Value of y is $y")

}

/*
    Rules for infix function:
    - is a member function (or an extension function)
    - has only one single parameter
    - is marked with infix keyword
 */

infix fun Int.add(b: Int): Int = this + b
