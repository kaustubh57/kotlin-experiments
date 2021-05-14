package experiments.collections

fun main(args: Array<String>) {
    println("Immutable example")
    println("---------------")

    var namesList = mutableListOf<String>("Peter", "Jack", "Sam")

    namesList[1] = "Mak"
    namesList.add("Tom")
    namesList.add("Dave")
    namesList.add("Tom")

    for (name in namesList) {
        println(name)
    }

    println("====================")

    namesList.removeAt(0)
    namesList.remove("Tom")

    for (name in namesList) {
        println(name)
    }

}
