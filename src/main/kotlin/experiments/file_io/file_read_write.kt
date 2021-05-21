package experiments.file_io

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.io.File

fun main(args: Array<String>) {
    println("File read/write experiments")
    println("---------------")

//    runBlocking { testProfile(10) }

    val fileName = "sample-120MB-data"
    // Create file object
    val file = File("$fileName.csv")
    // Create file
    val isExist = file.exists()
    if (isExist)
        println("File is exist")
    else
        println("File is not exist")

    if (isExist) {
        file.inputStream().use {
           file.copyTo(File("$fileName-${System.currentTimeMillis()}.csv"), true)
         }
    }

//    runBlocking { testProfile(5) }
}

suspend fun testProfile(x: Long) {
    println("Profiling the app.... $x")
    delay(x * 1000)
}
