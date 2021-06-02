package experiments.csv_file

import com.opencsv.CSVReader
import com.opencsv.CSVReaderBuilder
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

fun main(args: Array<String>) {
    println("Open CSV reader")
    println("---------------")
    var fileReader: BufferedReader? = null
    var csvReader: CSVReader? = null

    try {
        println("--- Read line by line ---")

        fileReader = BufferedReader(FileReader("./resources/Insta_history.csv"))
        csvReader = CSVReader(fileReader)

//        var record: Array?
        csvReader.readNext() // skip Header

        var record = csvReader.readNext()
        while (record != null) {
            println(record[0] + " | " + record[1] + " | " + record[2] + " | " + record[3])
            record = csvReader.readNext()
        }

        csvReader.close()

        // -------------------------------------------
        println("\n--- Read all at once ---")

        fileReader = BufferedReader(FileReader("./resources/Insta_history.csv"))
        csvReader = CSVReaderBuilder(fileReader).withSkipLines(1).build()

        val records = csvReader.readAll()
        for (_record in records) {
            println(_record[0] + " | " + _record[1] + " | " + _record[2] + " | " + _record[3])
        }
    } catch (e: Exception) {
        println("Reading CSV Error!")
        e.printStackTrace()
    } finally {
        try {
            fileReader!!.close()
            csvReader!!.close()
        } catch (e: IOException) {
            println("Closing fileReader/csvParser Error!")
            e.printStackTrace()
        }
    }

}
