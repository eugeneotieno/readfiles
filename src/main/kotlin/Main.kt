import java.io.File

fun main() {
    val separator = File.separator
    val fileName = "src${separator}reading.txt"
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

        println()

        //for large files
        File(fileName).forEachLine { println(it) }

    } else {
        println("File does not exist!")
    }
}