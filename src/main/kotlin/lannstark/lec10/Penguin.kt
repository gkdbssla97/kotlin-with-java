package lannstark.lec10

class Penguin(
    species: String,
    private val wingCount: Int = 2
) : Animal(species, 2), Swimable, Flyable{
    override fun move() {
        println("펭귄이 움직입니다~ 꽥꽥")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override val flyAbility: Int
        get() = TODO("Not yet implemented")

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = super.swimAbility
}