package experiments.functional_programming

fun main(args: Array<String>) {
    println("Lambda Expression")
    println("---------------")

    // lambda expression
    val myLambdaFunc: (Int, Int) -> Int = { x, y -> x + y }

    addTwoNum(7, 8, myLambdaFunc)

}

// higher order function
fun addTwoNum(a: Int, b: Int, myFunc: (Int, Int) -> Int) {
    var result = myFunc(a, b)
    println(result)
}
