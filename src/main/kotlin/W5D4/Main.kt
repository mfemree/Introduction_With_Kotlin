package W5D4

import java.util.regex.Pattern

fun main() {

    val oyun = Oyun()

    val savasci = OyunKarakterleri.Savasci(20,35)
    oyun.karakterOlustur(savasci)

    val buyucu = OyunKarakterleri.Buyucu(37,47)
    oyun.karakterOlustur(buyucu)

    val hirsiz = OyunKarakterleri.Hirsiz(47,36)
    oyun.karakterOlustur(hirsiz)

    /******************************************************************************************************************/

    val str1 = "50"
    println(str1.addPercent())
    println("50".addPercent())

    /******************************************************************************************************************/

    val int1 =20
    println(int1.ucleCarp())

    /******************************************************************************************************************/

    val email = "test@mail.com"
    println(email.isEmailValid())    // true

    /******************************************************************************************************************/

    val list = mutableListOf(1,2,3,4,5,6,7)    // indexleri verilen rakamlarin yerini degistiriyor
    list.swap(0,6)
    println(list)

}