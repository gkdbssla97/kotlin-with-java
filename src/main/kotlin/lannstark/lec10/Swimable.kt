package lannstark.lec10

interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸어푸")
    }
}