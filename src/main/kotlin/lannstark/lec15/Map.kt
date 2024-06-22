package lannstark.lec15

fun main() {
    val oldMap = mutableMapOf<Int, String>() // 가변

    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(1 to "MONDAY", 2 to "THURSDAY", 3 to "FRIDAY") // 불변
    println(mapOf)

    for(key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((k, v) in oldMap.entries) {
        println("$k -> $v")
    }
}