
import java.io.File

fun findFile(fileName: String) {

    println("Введіть послідовність для пошуку (використовуйте * для позначення будь-якої букви):")
    val sequence = readLine()?.trim()

    println("Введіть довжину слова:")
    val length = readLine()?.toIntOrNull()

    println("Введіть номер букви, з якої починається слово:")
    val startingLetterIndex = readLine()?.toIntOrNull()

    if (sequence.isNullOrEmpty() || length == null || startingLetterIndex == null) {
        println("Невірні вхідні дані. Будь ласка, перевірте введені значення.")
        return
    }

    val file = File(fileName)
    if (!file.exists()) {
        println("Файл не знайдено.")
        return
    }

    val matchingWords = mutableListOf<String>()

    file.forEachLine { line ->
        val words = line.split(" ")
        for (word in words) {
            if (word.length >= length && word[startingLetterIndex - 1] == sequence[startingLetterIndex - 1] &&
                word.substring(startingLetterIndex - 1).matches(sequence.replace("*", ".").toRegex())
            ) {
                matchingWords.add(word)
            }
        }
    }

    if (matchingWords.isEmpty()) {
        println("Не знайдено жодного відповідного слова.")
    } else {
        println("Знайдені відповідні слова:")
        matchingWords.forEach { println(it) }
    }
}



fun main() {
    val file = "src/main/kotlin/smth.txt"
	findFile(file)
}
