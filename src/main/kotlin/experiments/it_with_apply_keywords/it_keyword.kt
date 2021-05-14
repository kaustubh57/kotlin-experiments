package experiments.it_with_apply_keywords

fun main(args: Array<String>) {
    println("it keyword")
    println("---------------")

    // reverse lambda for string e.g. hello will return olleh
    val reverseLambda: (String) -> String = { str: String -> str.reversed()}

    // { it.reversed()} is same as { str: String -> str.reversed()}
    // below 3 functions are same
    reverseAndDisplay("hello", reverseLambda)
    reverseAndDisplay("hello", { it.reversed() })
    reverseAndDisplay("hello") { it.reversed() }
}

fun reverseAndDisplay(str: String, myFunc: (String) -> String) {
    val result = myFunc(str)
    println(result)
}
