package experiments.collections

fun main(args: Array<String>) {
    println("Array example")
    println("---------------")

    var numbers = Array<Int>(5) { 0 }

    println(numbers)

    for (num in numbers) {
        println(num)
    }

    println("===================")

    for (num in numbers.indices) {
        println(numbers[num])
    }
}
