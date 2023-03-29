package mentoring_lessons._23_03_2022

data class Sport (var sportName: String, val sportImg: Int, val sportDesc: String )


class Sport2(val name:String ) { }




fun main() {

    val sport = mentoring_lessons._23_03_2022.Sport("Volleyball", 1, "Volleyball is a nice spor")
    println(sport.sportName)        // volleyball

    sport.sportName = "Basketball"
    println(sport.sportName)       // Basketball  // setter yapmis oluyoruz aslinda

/***********************************************************************************************************8*/

    val sport2= mentoring_lessons._23_03_2022.Sport2("Sport")
    println(sport2.name)


}