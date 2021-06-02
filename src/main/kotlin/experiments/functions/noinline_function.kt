package experiments.functions

// https://blog.mindorks.com/understanding-inline-noinline-and-crossinline-in-kotlin

fun main(args: Array<String>) {
    println("noinline function")
    println("---------------")

    println("doSomething start")
    doSomethingElse(
        { println("doSomethingElse 1") },
        { println("doSomethingElse 2") }
    )
    println("doSomething end")


}

// want to inline abc, but not the xyz, use the noinline before the xyz
// use the noinline to avoid the inlining
inline fun doSomethingElse(abc: () -> Unit, noinline xyz: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
    xyz()
}
