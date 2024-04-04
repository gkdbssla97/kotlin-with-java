package lannstark.lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney((2_000L))
    val money2 = JavaMoney((1_000L))

    /**
     * Java랑 다르게 객체를 비교할 때 비교 연산자를 사용하면
     * 자동으로 compareTo를 호출해준다.
     */
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }
    /** Java ::
     * 동등성: 값이 같은가? -> equals
     * 동일성: 값이 완전히 같은가? 주소 값이 같은가? -> ==
     *
     * Kotlin ::
     * 동등성: ==
     * 동일성: ===
     */

    val money3 = JavaMoney((1_000L))
    val replMoney: JavaMoney = money3

    val money4 = JavaMoney((1_000L))
    println(money3 === replMoney)
    println(money4 === replMoney)
    println(money4 == replMoney)

    if(fun1() || fun2()) {
        println("본문")
    }

    val _money1 = Money(1_000L)
    val _money2 = Money(2_000L)

    println(_money1 + _money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true;
}

fun fun2(): Boolean {
    println("fun 2")
    return false;
}