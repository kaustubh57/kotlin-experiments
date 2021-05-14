package experiments.collections

fun main(args: Array<String>) {
    println("Map collection")
    println("---------------")

    var myMutableMap = mutableMapOf<Int, String>(1 to "India")
    myMutableMap[2] = "USA"
    myMutableMap[3] = "Nepal"
    myMutableMap[4] = "China"

    for (key in myMutableMap.keys) {
        println("$key  ${myMutableMap[key]}")
    }

    println("=================")
    myMutableMap.put(4, "Japan")
    myMutableMap.remove(10)
    myMutableMap.remove(3)
    for (key in myMutableMap.keys) {
        println("$key  ${myMutableMap[key]}")
    }

}
