package W5D3

class PhysicsSystem {

    fun add (first: Int, second:Int ): Int {
        return first*second
    }





    // fonsiyonu bu sekilde tanimladigimiz zaman, yeni bir obje olusturmadan asagidaki tum degerlere baska class'lardan kolayca ulasabiliyoruz
    companion object WorldConstants {  // companion = yardimci

        val gravity =9.8
        val unit = "metric"

        fun computerForce(mass: Double, accel:Double): Double {
            return mass*accel
        }
    }
}