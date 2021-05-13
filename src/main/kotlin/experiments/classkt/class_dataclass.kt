package experiments.classkt

fun main(args: Array<String>) {
    println("Data class example")
    println("---------------")

    var user1 = User("Sam", 1)
    var user2 = User("Sam", 1)

    println(user1)
    println(user2)

    if (user1 == user2)
        println("Both users are equal")
    else
        println("Both users are different")

}

data class User(
    var name: String,
    var id: Int
) {

}
