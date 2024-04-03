package lannstark.lec02

import com.lannstark.lec01.Person

fun main() {
    val person = Person("공부하는개발자")
    println(person.name)

    /**
     * Java Person Class에 @Nullable이 붙으면
     * Kotlin에서 에러 발생
     */
    startsWithA(person.name)
}

fun startsWithA(str : String?) : Boolean {
    return str?.startsWith("A") ?: false;
}