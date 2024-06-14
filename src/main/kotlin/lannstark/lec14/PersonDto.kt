package lannstark.lec14

fun main() {
    val personDto = PersonDto("하윤", 100)
    val personDto1 = PersonDto("하윤", 100)
    println(personDto == personDto1)
    println(personDto)
}

data class PersonDto(
    val name: String,
    val age: Int
)