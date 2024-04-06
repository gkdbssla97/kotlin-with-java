package lannstark.lec09

import com.lannstark.lec09.JavaPerson
import java.util.*

fun main() {
    val person = JavaPerson("하윤", 100)
    println(person.name)
    person.age = 10 // setter
    println(person.age)
}

class Person(
    private val name: String = "하윤",
    private var age: Int = 1
) {

    val uppercaseName:String
        get() = this.name.uppercase()


    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}살 일 수 없습니다.")
        }
    }

    val isAdult: Boolean
        get() = this.age >= 20

}
