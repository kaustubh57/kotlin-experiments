package experiments.classkt

fun main(args: Array<String>) {
    println("Class basics")
    println("---------------")

    // First dog
    var dog1 = Dog()
    dog1.breed = "German Shepherd"
    dog1.size = 40
    dog1.color = "Black"

    println("My name is ${dog1.breed}, my size is ${dog1.size} and my color is ${dog1.color}")

    dog1.run()
    dog1.bark()
}

class Dog {
    var breed: String = ""
    var size: Int = -1
    var color: String = ""

    fun bark() {
        println(" Wooh ! Wooh !")
    }

    fun run() {
        println("I am running !")
    }
}
