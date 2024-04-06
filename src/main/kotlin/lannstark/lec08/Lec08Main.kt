package lannstark.lec08

fun main() {
//    repeat("hi", userNewLine = false)
//    printNameAndGender(name = "하윤", gender = "MALE")
    printAll("hi", "my", "name", "is", "hayoon")
    val array = arrayOf("hi", "my", "name", "is", "hayoon")
    printAll(*array)
}


fun max(a: Int, b: Int) = if (a > b) a else b
fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    print(gender)
}

/**
 * 가변인자
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}