import java.io.File

fun main() {
    val separator = File.separator

    val wordsSequence = "src${separator}words_sequence.txt"
    var lengthOfLongestWord = 0
    File(wordsSequence).forEachLine {
        if (it.length > lengthOfLongestWord) lengthOfLongestWord = it.length
    }

    println(lengthOfLongestWord)

    println()

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