package experiments.collections

fun main(args: Array<String>) {
    println("Array example")
    println("---------------")

    var numbers = Array<Int>(5) { 0 }

    numbers[2] = 24

    println(numbers)

    for (num in numbers) {
        println(num)
    }

    println("===================")

    for (numIndex in numbers.indices) {
        println(numbers[numIndex])
    }
}
