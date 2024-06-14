package lannstark.lec14

import lannstark.lec14.Country.*

fun handleCountry(country: Country) {
    return when (country) {
        KOREA -> TODO()
        AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US"),
}