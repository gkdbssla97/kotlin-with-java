package lannstark.lec03

import com.lannstark.lec03.Person

fun main() {
    var number1: Int? = 3
    var number2: Long = number1?.toLong() ?: 0L
    val person = Person("하윤", 10)
    println("이름은 ${person.name} 나이는 ${person.age} 입니다")
}

/**
 * public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
        Person person = (Person) obj;
        System.out.println(person.getAge());
    }
}
 */
fun printAgeIfPerson(obj: Any?) {
    val person : Person? = obj as? Person
    println(person?.age)
}