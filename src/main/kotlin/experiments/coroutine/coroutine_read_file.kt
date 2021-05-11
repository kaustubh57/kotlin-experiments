package experiments.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

fun main() {
    reader()
}

fun reader() = runBlocking{
    val d1 = async { readFile("the_whale.txt")}
    d1.await().forEach { println(it)}

    val d2 = async { readFirstLine("single_line_file.txt")}
    println(d2.await())
}

fun readFile(fileName: String): List<String> {
    val file = File("./resources/$fileName")
    return file.readLines()
}

fun readFirstLine(fileName: String): String {
    val file = File("./resources/$fileName")
    return file.useLines { it.firstOrNull() } ?: error("File is empty")
}
