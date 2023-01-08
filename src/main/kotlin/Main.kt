import java.io.File

fun main() {
    val fileName = "src/reading.txt"
    val file = File(fileName)
    if (file.exists()) {
        val lines = file.readText()
        println(lines)
    } else {
        println("File does not exist!")
    }
}