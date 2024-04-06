package lannstark.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else if(score >= 70) {
        "C";
    } else {
        "D";
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when(score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithRange(score: Int): String {
    return when(score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun getEarlyReturnWithSwitch(score: Int) {
    when {
        score == 90 -> println("Good")
        score % 2 == 0 -> println("SoSo")
        else -> println("Fine")
    }
}