//    import java.io.File
//    import java.nio.charset.Charset
//class Find(file: String) {
//
//        private val sequence: String
//        private val length: Int
//
//        init {
//            println("Введіть послідовність для пошуку (використовуйте * для позначення будь-якої букви):")
//            sequence = readLine()?.trim() ?: ""
//
//            println("Введіть довжину слова:")
//            length = readLine()?.toIntOrNull() ?: 0
//
//            if (sequence.isEmpty() || length == 0 ) {
//                println("Невірні вхідні дані. Будь ласка, перевірте введені значення.")
//            }
//
//
//            val matchingWords = mutableListOf<String>()
//
//            file.forEachLine(Charset.defaultCharset()) { line ->
//                val words = line.split(" ")
//                for (word in words) {
//                    if (word.length >= length &&
//                        word.matches(sequence.replace("*", ".").toRegex())
//                    ) {
//                        matchingWords.add(word)
//                    }
//                }
//            }
//
//            if (matchingWords.isEmpty()) {
//                println("Не знайдено жодного відповідного слова.")
//            } else {
//                println("Знайдені відповідні слова:")
//                matchingWords.forEach { println(it) }
//            }
//        }
//    }