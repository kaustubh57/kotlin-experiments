package experiments.functional_programming

fun main(args: Array<String>) {
    println("Closure example")
    println("---------------")

    // result can be used in lambda expression
    var result = 0
    println(result)

    // change value of result in lambda expression
    val lambda: (Int, Int) -> Unit = { x, y -> result = x + y }

    add(7, 8, lambda)

    println(result)

}

fun add(a: Int, b: Int, myFunc: (Int, Int) -> Unit) {
    var sum = myFunc(a, b)
    println(sum)
}
