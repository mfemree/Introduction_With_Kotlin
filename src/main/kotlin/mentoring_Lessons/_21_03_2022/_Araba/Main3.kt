package mentoring_Lessons._21_03_2022._Araba

fun main() {

    var araba1 = Araba3_getter_setter("sari", 2011)

    araba1.yeniRenk = "turuncu"

    val a = araba1.yeniRenk

    println(a)                      // turuncu
    println("${araba1.yeniRenk}")   // turuncu

}