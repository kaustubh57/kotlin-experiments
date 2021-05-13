package experiments.objectAndCompanion

fun main(args: Array<String>) {
    println("Companion object example")
    println("---------------")

    println(School.pi)
}

class School {
    companion object MathsCompanion {

        val pi = 3.141 // like static variable in Java

        fun findArea(l: Int, b: Int): Int { // like static function in Java
            return l * b
        }
    }
}


