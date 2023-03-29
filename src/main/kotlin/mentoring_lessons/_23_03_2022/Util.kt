package mentoring_lessons._23_03_2022

object Util {

    fun getCurrentTime(date: String) = println(date)

}

class Util2 {

    // Utily'den olusan butun instance'larin/objelerin icindeki ozelliklere sahip olmasini saglar
    // javadaki static gibi davranir
    companion object {
        fun getCurrentTime(date: String) = println(date)
    }

}




fun main(){

    mentoring_lessons._23_03_2022.Util.getCurrentTime("Pazartesi")

    mentoring_lessons._23_03_2022.Util2.Companion.getCurrentTime("Sali")

}