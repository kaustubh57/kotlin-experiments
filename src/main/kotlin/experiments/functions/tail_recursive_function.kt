package experiments.functions

import java.math.BigInteger

fun main(args: Array<String>) {
    // When to use tailrec function:
    // - used during recursion
    // - use the keyword "tailrec"
    // - saves stack memory and avoids stack overflow

    println(getFibonacciNumber(30000, BigInteger("1"), BigInteger("0")))

}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0)
        b
    else
        getFibonacciNumber(n - 1, a + b, a)
}
