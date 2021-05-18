package experiments.functions

// https://blog.mindorks.com/understanding-inline-noinline-and-crossinline-in-kotlin

fun main(args: Array<String>) {
    println("crossinline function")
    println("---------------")

    doSomethingWithoutCrossinline()

    println("==================")

    doSomethingWithCrossinline()
}

fun doSomethingWithoutCrossinline() {
    println("doSomething 1 start")
    doSomethingElseWithoutCrossinline {
        println("doSomethingElse 1")
        return // notice this return
    }
    println("doSomething 1 end") // missing or never invoked
}

inline fun doSomethingElseWithoutCrossinline(abc: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
}

fun doSomethingWithCrossinline() {
    println("doSomething 2 start")
    doSomethingElseWithCrossinline {
        println("doSomethingElse 2")
        //return // gives compile time error "return not allowed here"
    }
    println("doSomething 2 end") // missing or never invoked
}

inline fun doSomethingElseWithCrossinline(crossinline abc: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
}
