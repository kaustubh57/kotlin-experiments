package experiments.classkt

fun main(args: Array<String>) {
    println("Class inheritance example!")
    println("-------------------------")

    val myDog = Dog()
    myDog.breed = "Pug"
    myDog.color = "Brown"
    myDog.bark()
    myDog.run()

    val myCat = Cat()
    myCat.age = 10
    myCat.color = "White"
    myCat.meow()
    myCat.run()

    val animal = Animal()
    animal.color = "Red"
    animal.run()

}

open class Animal { // Parent or Super class
    var color: String = ""

   fun run() {
        println("I am running !")
    }
}

class Dog: Animal() { // Child or Sub class
    var breed: String = ""

    fun bark() {
        println(" Wooh ! Wooh !")
    }
}

class Cat: Animal() { // Child or Sub class
    var age: Int = 0

    fun meow() {
        println(" Mew ! Mew !")
    }
}
