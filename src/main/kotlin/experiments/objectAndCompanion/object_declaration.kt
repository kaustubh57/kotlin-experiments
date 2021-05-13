package experiments.objectAndCompanion

fun main(args: Array<String>) {
    println("Object declaration example")
    println("---------------")

    println(Maths.pi)

    val radius = 4
    println(Maths.pi * radius * radius)

    println(Maths.findArea(6, 2))

    println(Maths.findPerimeter(6, 2))
}

open class Trigonometry {

    open fun findPerimeter(l: Int, b: Int): Int {
        return 2 * (l + b)
    }
}

object Maths: Trigonometry() {
    val pi = 3.14 // like static variable in Java

    fun findArea (l: Int, b: Int): Int { // like static function in Java
        return l * b
    }

    override fun findPerimeter(l: Int, b: Int): Int {
        println("We are inside Maths object declaration")
        return 2 * (l + b)
    }
}
