package mentoring_lessons._27_03_2022

enum class DAYS2( val isWeekend:Boolean = false) {

    // enum class inin altindaki degerleri "values()" ile yazduruyoruz

SUNDAY (true),
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
// default value overriden
SATURDAY(true);

    companion object{
        fun today(obj: mentoring_lessons._27_03_2022.DAYS2): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }

    fun main() {

        // A simple demonstration of properties and methods
        for ( day in mentoring_lessons._27_03_2022.DAYS2.values()) {
            println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
        }
    val today = mentoring_lessons._27_03_2022.DAYS2.MONDAY
        println("is today a weekend ${mentoring_lessons._27_03_2022.DAYS2.Companion.today(today)}")
    }
}
