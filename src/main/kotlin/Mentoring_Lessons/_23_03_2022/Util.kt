package Mentoring_Lessons._23_03_2022

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

    Util.getCurrentTime("Pazartesi")

    Util2.getCurrentTime("Sali")

}