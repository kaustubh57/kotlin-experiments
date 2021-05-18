package experiments.functions

fun main(args: Array<String>) {
    println("Inline function")
    println("---------------")

    inlineFunction { println("Calling inline function") }

    inlineFunction { println("Calling inline function") }

    inlineFunction { println("Calling inline function") }
}

// inline function
inline fun inlineFunction(fn: () -> Unit) {
    fn()
    println("Code inside inline function")
}
