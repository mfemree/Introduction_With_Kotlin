package mentoring_lessons._28_03_2022

data class DataClass (val roll: Int, val name: String, val height: Int= 80)

fun main() {

    val man1 = DataClass (1,"man" )
    println(man1.toString())                        // butun degerleri yazdirmak icin

}