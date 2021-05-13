package experiments.conditions

fun main(args: Array<String>) {
    // 1. Conditional when statement
    // 2. Ranges in Kotlin
    // 3. When Expressions

    val x = 1

    when (x) {
        in 1..10 -> println("x is between 1 and 10")
        11 -> println("x is 11")
        else -> {
            println("x is unknown")
            println("None of the criteria met")
        }
    }

    // when expression
    val message = when (x) {
        in 1..10 -> "x is between 1 and 10"
        11 -> "x is 11"
        else -> "x is unknown"
    }
    println("with expression $message")
}
