// add experimental

import java.io.File

fun findFile(fileName: String) {
    println("Введіть послідовність для пошуку (використовуйте * для позначення будь-якої букви):")
    var sequence = readln().trim()

    println("Введіть доовжину слова:")
    val length = readln().toIntOrNull() ?: 0

    println("Введіть номер букви, з якої починається слово:")
    val startingLetterIndex = readln().toIntOrNull() ?: 0

    sequence = "*".repeat(startingLetterIndex) + sequence


//    if (startingLetterIndex != null && sequence.length != length) {
//        sequence += "*".repeat(startingLetterIndex - sequence.length)
//    }
    println(sequence)

    if (sequence.isEmpty() || length == 0 || startingLetterIndex == 0) {
        println("Невірні вхідні дані. Будь ласка, перевірте введені значення.")
        return
    }

    val file = File(fileName)
    if (!file.exists()) {
        println("Файл не знайдено.")
        return
    }

    // val matchingWords = mutableListOf<String>()

    /*
    file.forEachLine { line ->
        val words = line.split(" ")
        for (word in words) {
            for (i in startingLetterIndex - 1..length) {
                if (word[i] == sequence[i])
            }
        }
    }
    */
//
//    if (matchingWords.isEmpty()) {
//        println("Не знайдено жодного відповідного слова.")
//    } else {
//        println("Знайдені відповідні слова:")
//        matchingWords.forEach { println(it) }
//    }
}



fun main() {
    val file = "src/main/kotlin/smth.txt"
	findFile(file)
}
