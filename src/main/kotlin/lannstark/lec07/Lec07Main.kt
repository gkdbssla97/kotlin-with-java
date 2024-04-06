package lannstark.lec07

fun main() {
    val filePrinter = FilePrinter()
    filePrinter.readFile()
}

fun parseIntOrThrow(str: String): Int {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 안닙니다.")
    }
}

