package experiments.collections

fun main(args: Array<String>) {
    println("Immutable example")
    println("---------------")

    var namesList = listOf<String>("Peter", "Jack", "Sam")

    for (name in namesList) {
        println(name)
    }

}
