package lannstark.lec15

fun main() {
    val immutableNumbers = listOf(100, 200) // 불변 리스트
    val emptyList = emptyList<Int>(); // 비어있는 리스트<>

    printNumbers(emptyList())

    println(immutableNumbers[0])

    for(number in immutableNumbers) {
        println(number)
    }

    for((idx, value) in immutableNumbers.withIndex()) {
        println("$idx $value")
    }

    val mutableNumbers = mutableListOf(100, 200) // 가변 리스트
    mutableNumbers.add(300)
    val plus = mutableNumbers.plus(400)
    println(mutableNumbers)
    println(plus)
}

private fun printNumbers(numbers : List<Int>) {

}