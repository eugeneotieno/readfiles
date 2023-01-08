import java.io.File

fun main() {
    val fileName = "src/reading.txt"
    val lines = File(fileName).readText()
    println(lines)
}