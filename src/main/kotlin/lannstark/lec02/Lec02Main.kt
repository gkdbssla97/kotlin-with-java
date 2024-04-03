package lannstark.lec02

fun main() {

    val str: String? = "ABC"
    println(str?.length ?: 0)
}

fun startsWithA1(str : String?) : Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?) : Boolean? {
    return str?.startsWith("A")
}

/**
 * 만약 str이 null이 아니라면 safe-call이 불려서 startsWith() 호출해서
 * true or false를 반환한다.
 * str이 null이라면 false를 반환한다.
 */
fun startsWithA3(str : String?) : Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str : String) : Boolean {
    return str.startsWith("A")
}

fun startsWithA5(str : String?) : Boolean {
    return str!!.startsWith("A")
}