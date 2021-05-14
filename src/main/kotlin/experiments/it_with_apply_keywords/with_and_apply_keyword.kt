package experiments.it_with_apply_keywords

fun main(args: Array<String>) {
    println("with and apply keyword")
    println("---------------")

    var person = Person()
    person.name = "Peter"
    person.age = 27

    person.startRun()

    with(person) {
        name = "Jack"
        age = 44
    }
    person.startRun()

    person.apply {
        name = "Rob"
        age = 20
    }.startRun()
}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("I'm ($name) ready to run and age group $age")
    }
}
