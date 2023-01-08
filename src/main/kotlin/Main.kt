import java.io.File

fun main() {
    val fileName = "src/reading.txt"
    val file = File(fileName)
    if (file.exists()) {
        //read whole text
        val text = file.readText()
        println(text)

        println()

        //read line by line
        val lines = file.readLines()
        for (line in lines) {
            println(line)
        }

    } else {
        println("File does not exist!")
    }
}