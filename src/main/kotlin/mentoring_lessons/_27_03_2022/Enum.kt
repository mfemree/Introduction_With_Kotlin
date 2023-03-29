package mentoring_lessons._27_03_2022

enum class DAYS {

    // enum classlarin isimleri her zaman buyuk harfle yazilir.

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {

    for ( day in mentoring_lessons._27_03_2022.DAYS.values()) {

        println("${day.ordinal} = ${day.name}")
    }
    println("${mentoring_lessons._27_03_2022.DAYS.valueOf("SUNDAY")}")
}