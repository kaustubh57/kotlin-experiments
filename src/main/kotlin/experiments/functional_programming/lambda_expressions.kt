package experiments.functional_programming

fun main(args: Array<String>) {
    println("Higher order function")
    println("---------------")

    val myLambdaFunc: (Int, Int) -> Int = { x, y -> x + y }
}
