package experiments.classkt

fun main(args: Array<String>) {
    println("Class basics")
    println("---------------")

    // Second dog
    var dog2 = Dog2("German Shepherd", 40, "Black")

    println("My name is ${dog2.breed}, my size is ${dog2.size} and my color is ${dog2.color}")

    dog2.run()
    dog2.bark()
}

class Dog2 constructor(
    breed: String,
    size: Int,
    color: String
) {
    var breed: String = ""
    var size: Int = -1
    var color: String = ""

    init {
        this.breed = breed
        this.size = size
        this.color = color
    }

    fun bark() {
        println(" Wooh ! Wooh !")
    }

    fun run() {
        println("I am running !")
    }
}
