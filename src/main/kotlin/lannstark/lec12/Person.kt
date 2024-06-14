package lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    companion object Factory : Log {
        /**
         * 그냥 val 이라고 쓰면 MIN_AGE가 런타임 시에 할당,
         * const를 붙이면 컴파일 시에 할당
         */
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 person 클래스의 동행객체 Factory다.")
        }
    }

}

object Singleton {
    var a: Int = 0
}
