@file:Suppress("UNUSED_PARAMETER", "ConvertCallChainIntoSequence")

package lesson6.task1

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

// Урок 6: разбор строк, исключения
// Максимальное количество баллов = 13
// Рекомендуемое количество баллов = 11
// Вместе с предыдущими уроками (пять лучших, 2-6) = 40/54

/**
 * Пример
 *
 * Время представлено строкой вида "11:34:45", содержащей часы, минуты и секунды, разделённые двоеточием.
 * Разобрать эту строку и рассчитать количество секунд, прошедшее с начала дня.
 */
fun timeStrToSeconds(str: String): Int {
    val parts = str.split(":")
    var result = 0
    for (part in parts) {
        val number = part.toInt()
        result = result * 60 + number
    }
    return result
}

/**
 * Пример
 *
 * Дано число n от 0 до 99.
 * Вернуть его же в виде двухсимвольной строки, от "00" до "99"
 */
fun twoDigitStr(n: Int) = if (n in 0..9) "0$n" else "$n"

/**
 * Пример
 *
 * Дано seconds -- время в секундах, прошедшее с начала дня.
 * Вернуть текущее время в виде строки в формате "ЧЧ:ММ:СС".
 */
fun timeSecondsToStr(seconds: Int): String {
    val hour = seconds / 3600
    val minute = (seconds % 3600) / 60
    val second = seconds % 60
    return String.format("%02d:%02d:%02d", hour, minute, second)
}

/**
 * Пример: консольный ввод
 */
fun main() {
    println("Введите время в формате ЧЧ:ММ:СС")
    val line = readLine()
    if (line != null) {
        val seconds = timeStrToSeconds(line)
        if (seconds == -1) {
            println("Введённая строка $line не соответствует формату ЧЧ:ММ:СС")
        } else {
            println("Прошло секунд с начала суток: $seconds")
        }
    } else {
        println("Достигнут <конец файла> в процессе чтения строки. Программа прервана")
    }
}


/**
 * Средняя (4 балла)
 *
 * Дата представлена строкой вида "15 июля 2016".
 * Перевести её в цифровой формат "15.07.2016".
 * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
 * При неверном формате входной строки вернуть пустую строку.
 *
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
 * входными данными.
 */
fun dateStrToDigit(str: String): String = TODO()

/**
 * Средняя (4 балла)
 *
 * Дата представлена строкой вида "15.07.2016".
 * Перевести её в строковый формат вида "15 июля 2016".
 * При неверном формате входной строки вернуть пустую строку
 *
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30 февраля 2009) считается неверными
 * входными данными.
 */
fun dateDigitToStr(digital: String): String = TODO()

/**
 * Средняя (4 балла)
 *
 * Номер телефона задан строкой вида "+7 (921) 123-45-67".
 * Префикс (+7) может отсутствовать, код города (в скобках) также может отсутствовать.
 * Может присутствовать неограниченное количество пробелов и чёрточек,
 * например, номер 12 --  34- 5 -- 67 -89 тоже следует считать легальным.
 * Перевести номер в формат без скобок, пробелов и чёрточек (но с +), например,
 * "+79211234567" или "123456789" для приведённых примеров.
 * Все символы в номере, кроме цифр, пробелов и +-(), считать недопустимыми.
 * При неверном формате вернуть пустую строку.
 *
 * PS: Дополнительные примеры работы функции можно посмотреть в соответствующих тестах.
 */
fun flattenPhoneNumber(phone: String): String = TODO()

/**
 * Средняя (5 баллов)
 *
 * Результаты спортсмена на соревнованиях в прыжках в длину представлены строкой вида
 * "706 - % 717 % 703".
 * В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
 * число соответствует удачному прыжку, - пропущенной попытке, % заступу.
 * Прочитать строку и вернуть максимальное присутствующее в ней число (717 в примере).
 * При нарушении формата входной строки или при отсутствии в ней чисел, вернуть -1.
 */
fun bestLongJump(jumps: String): Int = TODO()

/**
 * Сложная (6 баллов)
 *
 * Результаты спортсмена на соревнованиях в прыжках в высоту представлены строкой вида
 * "220 + 224 %+ 228 %- 230 + 232 %%- 234 %".
 * Здесь + соответствует удачной попытке, % неудачной, - пропущенной.
 * Высота и соответствующие ей попытки разделяются пробелом.
 * Прочитать строку и вернуть максимальную взятую высоту (230 в примере).
 * При нарушении формата входной строки, а также в случае отсутствия удачных попыток,
 * вернуть -1.
 */
fun bestHighJump(jumps: String): Int = TODO()

/**
 * Сложная (6 баллов)
 *
 * В строке представлено выражение вида "2 + 31 - 40 + 13",
 * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
 * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
 * Вернуть значение выражения (6 для примера).
 * Про нарушении формата входной строки бросить исключение IllegalArgumentException
 */
fun plusMinus(expression: String): Int = TODO()

/**
 * Сложная (6 баллов)
 *
 * Строка состоит из набора слов, отделённых друг от друга одним пробелом.
 * Определить, имеются ли в строке повторяющиеся слова, идущие друг за другом.
 * Слова, отличающиеся только регистром, считать совпадающими.
 * Вернуть индекс начала первого повторяющегося слова, или -1, если повторов нет.
 * Пример: "Он пошёл в в школу" => результат 9 (индекс первого 'в')
 */
fun firstDuplicateIndex(str: String): Int {
    var countIndexes = 0
    val listWords = str.split(" ")
    for (i in 0..listWords.size - 2) {
        countIndexes += listWords[i].length
        if (listWords[i].equals(listWords[i + 1], ignoreCase = true)) {
            return countIndexes + i - listWords[i].length
        }
    }
    return -1
}

/**
 * Сложная (6 баллов)
 *
 * Строка содержит названия товаров и цены на них в формате вида
 * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
 * То есть, название товара отделено от цены пробелом,
 * а цена отделена от названия следующего товара точкой с запятой и пробелом.
 * Вернуть название самого дорогого товара в списке (в примере это Курица),
 * или пустую строку при нарушении формата строки.
 * Все цены должны быть больше нуля либо равны нулю.
 */

fun mostExpensive(description: String): String {
    if (description.isEmpty()) return ""
    var maxPrice = 0.0
    val products = mutableMapOf<Double, String>()
    val items = description.split(";").toMutableList()
    for (i in items.indices) {
        if (items[i][0].toString() == " ") items[i] = items[i].substring(1)
        val listPriceItem = items[i].split(" ")
        if (listPriceItem.size != 2) return ""
        if (listPriceItem[1].toDouble() < 0) return ""
        products[listPriceItem[1].toDouble()] = listPriceItem[0]
        if (listPriceItem[1].toDouble() > maxPrice) maxPrice = listPriceItem[1].toDouble()
    }
    return products[maxPrice].toString()
}

/**
 * Сложная (6 баллов)
 *
 * Перевести число roman, заданное в римской системе счисления,
 * в десятичную систему и вернуть как результат.
 * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
 * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
 * Например: XXIII = 23, XLIV = 44, C = 100
 *
 * Вернуть -1, если roman не является корректным римским числом
 */
var numbersRoman = mapOf(
    "M" to 1000, "CM" to 900, "D" to 500, "CD" to 400, "C" to 100, "XC" to 90,
    "L" to 50, "XL" to 40, "X" to 10, "IX" to 9, "V" to 5, "IV" to 4, "I" to 1
)

fun fromRoman(roman: String): Int {
    var result = 0
    var maxNumber = 5000
    if (roman.isEmpty()) return -1
    var i = 0
    while (i < roman.length) {
        if (roman[i] !in "MCDXLIV") return -1

        var substring = roman[i].toString()
        if (roman.length - i > 1) substring = substring.plus(roman[i + 1])
        maxNumber = if (numbersRoman.containsKey(substring)) {
            if (numbersRoman.getValue(substring) <= maxNumber) {
                numbersRoman.getValue(substring)
            } else return -1
        } else if (numbersRoman.getValue(roman[i].toString()) <= maxNumber) {
            numbersRoman.getValue(roman[i].toString())
        } else return -1

        if (i == roman.length - 1) {
            result += numbersRoman.getValue(roman[i].toString())
            i++
        } else {
            val substring = roman[i].plus(roman[i + 1].toString())
            if (numbersRoman.containsKey(substring)) {
                result += numbersRoman.getValue(substring)
                i += 2
            } else {
                result += numbersRoman.getValue(roman[i].toString())
                i++
            }
        }
    }
    return result
}

/**
 * Очень сложная (7 баллов)
 *
 * Имеется специальное устройство, представляющее собой
 * конвейер из cells ячеек (нумеруются от 0 до cells - 1 слева направо) и датчик, двигающийся над этим конвейером.
 * Строка commands содержит последовательность команд, выполняемых данным устройством, например +>+>+>+>+
 * Каждая команда кодируется одним специальным символом:
 *	> - сдвиг датчика вправо на 1 ячейку;
 *  < - сдвиг датчика влево на 1 ячейку;
 *	+ - увеличение значения в ячейке под датчиком на 1 ед.;
 *	- - уменьшение значения в ячейке под датчиком на 1 ед.;
 *	[ - если значение под датчиком равно 0, в качестве следующей команды следует воспринимать
 *  	не следующую по порядку, а идущую за соответствующей следующей командой ']' (с учётом вложенности);
 *	] - если значение под датчиком не равно 0, в качестве следующей команды следует воспринимать
 *  	не следующую по порядку, а идущую за соответствующей предыдущей командой '[' (с учётом вложенности);
 *      (комбинация [] имитирует цикл)
 *  пробел - пустая команда
 *
 * Изначально все ячейки заполнены значением 0 и датчик стоит на ячейке с номером N/2 (округлять вниз)
 *
 * После выполнения limit команд или всех команд из commands следует прекратить выполнение последовательности команд.
 * Учитываются все команды, в том числе несостоявшиеся переходы ("[" при значении под датчиком не равном 0 и "]" при
 * значении под датчиком равном 0) и пробелы.
 *
 * Вернуть список размера cells, содержащий элементы ячеек устройства после завершения выполнения последовательности.
 * Например, для 10 ячеек и командной строки +>+>+>+>+ результат должен быть 0,0,0,0,0,1,1,1,1,1
 *
 * Все прочие символы следует считать ошибочными и формировать исключение IllegalArgumentException.
 * То же исключение формируется, если у символов [ ] не оказывается пары.
 * Выход за границу конвейера также следует считать ошибкой и формировать исключение IllegalStateException.
 * Считать, что ошибочные символы и непарные скобки являются более приоритетной ошибкой чем выход за границу ленты,
 * то есть если в программе присутствует некорректный символ или непарная скобка, то должно быть выброшено
 * IllegalArgumentException.
 * IllegalArgumentException должен бросаться даже если ошибочная команда не была достигнута в ходе выполнения.
 *
 */
fun computeDeviceCells(cells: Int, commands: String, limit: Int): List<Int> {
    fun checkIllegalArgumentException(countCells: Int, str: String) {
        var firstBracket = ""
        var lastBracket = ""
        var countLeftBrackets = 0
        var countRightBrackets = 0
        var countBordersSteps = countCells / 2
        for (element in str) {
            if (element in "[]" && firstBracket == "") firstBracket = element.toString()
            val sign = element.toString()
            when (sign) {
                !in "+-><[] " -> throw IllegalArgumentException()
                "[" -> {
                    countLeftBrackets++
                    lastBracket = "["
                }
                "]" -> {
                    countRightBrackets++
                    lastBracket = "]"
                }
                ">" -> countBordersSteps++
                "<" -> countBordersSteps--
            }
        }
        if (firstBracket == "]" || lastBracket == "[" || (countLeftBrackets != countRightBrackets)) throw IllegalArgumentException()
    }

    fun checkIllegalStateException(totalCells: Int, currentsCell: Int, typeArrow: String) {
        if (typeArrow == "left" && currentsCell - 1 < 0) throw IllegalStateException()
        if (typeArrow == "right" && currentsCell + 1 >= totalCells) throw IllegalStateException()
    }

    fun editLeftBracket(index: Int, commands: String): Int {
        var nesting = 0
        var returnedIndex = 0
        for (i in index + 1 until commands.length) {
            if (commands[i].toString() == "[") nesting--
            if (commands[i].toString() == "]" && nesting == 0) {
                returnedIndex = i
                break
            }
            if (commands[i].toString() == "]") nesting++
        }
        return returnedIndex
    }

    fun editRightBracket(index: Int, commands: String): Int {
        var currentIndex = index
        var nesting = 0
        var returnedIndex = 0
        while (true) {
            currentIndex--
            if (commands[currentIndex].toString() == "]") nesting--
            else if (commands[currentIndex].toString() == "[" && nesting == 0) {
                returnedIndex = currentIndex
                break
            } else if (commands[currentIndex].toString() == "[") nesting++
        }
        return returnedIndex
    }

    checkIllegalArgumentException(cells, commands)
    val cellArray = IntArray(cells) { 0 }
    var currentCell = cells / 2
    var step = 0
    var countSteps = 0
    while (step < commands.length && countSteps < limit) {
        val command = commands[step].toString()
        if (command == ">") {
            checkIllegalStateException(cells, currentCell, "right")
            currentCell++
        } else if (command == "<") {
            checkIllegalStateException(cells, currentCell, "left")
            currentCell--
        } else if (command == "+") cellArray[currentCell]++
        else if (command == "-") cellArray[currentCell]--
        else if (command == "[" && cellArray[currentCell] == 0) step = editLeftBracket(step, commands)
        else if (command == "]" && cellArray[currentCell] != 0) step = editRightBracket(step, commands)
        step++
        countSteps++
    }
    return cellArray.toList()
}
