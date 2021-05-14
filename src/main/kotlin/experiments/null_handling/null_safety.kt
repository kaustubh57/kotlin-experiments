package experiments.null_handling

fun main(args: Array<String>) {
    println("handling null examples")
    println("---------------")

    val name: String? = null

    // 1. Safe call ( ?. )
    println("The length of name is ${name?.length}")


    // 2. Safe call with let ( ?.let )
    name?.let {
        println("The length of name is ${name?.length}")
    }

    // 3. Non-null assertion operator ( !! )
    println("The length of name is ${name!!.length}")
}
