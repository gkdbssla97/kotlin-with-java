package lannstark.lec01;

import com.lannstark.lec01.Person

fun main() {
    var number1 : Int = 10
    val number2 : Long = 10L

    /**
     * 타입을 지정해주지 않은 상태로 초기화되지 않으면 에러 발생
     * 컴파일러가 변수의 데이터 타입을 추론하지 못 함
     */
    var number3 : Boolean
    val number4 : Int

    number4 = 10
    println(number4)
    println("hi")

    // 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다

    var number5 : Long? = 1_000L
    number5 = null

    // 인스턴스 생성
    var person = Person("hi");
}
