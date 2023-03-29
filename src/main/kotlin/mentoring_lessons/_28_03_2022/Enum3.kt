package mentoring_lessons._28_03_2022

enum class DAYS3 {

    // enum class inin altindaki degerleri "values()" ile yazduruyoruz

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,

}

fun main() {

    when( DAYS3.SUNDAY) {
        DAYS3.SUNDAY -> println("Today is Sunday")
        DAYS3.MONDAY -> println("Today is Monday")
        DAYS3.TUESDAY -> println("Today is Tuesday")
        DAYS3.WEDNESDAY -> println("Today is Wednesday")
        DAYS3.THURSDAY -> println("Today is Thursday")
        DAYS3.FRIDAY -> println("Today is Friday")
        DAYS3.SATURDAY -> println("Today is Saturday")
        //  adding an else clause will generate a warning
        // else eklemek bir uyari olusturur
    }

}