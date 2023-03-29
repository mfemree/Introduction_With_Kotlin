package mentoring_lessons._27_03_2022

object obj {

    // birden fazla nesne uretmek yerine, tek bir nesne uretiyir
    // farkli referanslar tanimlasak bile hepsi ayni referansa gidecekler
    // bu bir class degil obje.

    var sayi:Int =0

    fun yazdir() {
        println(mentoring_lessons._27_03_2022.obj.sayi)   // 0
    }
}

fun main () {

    var obj1 : mentoring_lessons._27_03_2022.obj = mentoring_lessons._27_03_2022.obj
    mentoring_lessons._27_03_2022.obj.sayi = 5
    mentoring_lessons._27_03_2022.obj.yazdir()        // 5

    var obj2: mentoring_lessons._27_03_2022.obj = mentoring_lessons._27_03_2022.obj
    mentoring_lessons._27_03_2022.obj.sayi = 8
    mentoring_lessons._27_03_2022.obj.yazdir()       // 8

    mentoring_lessons._27_03_2022.obj.yazdir()        // 8
    //

    // iki obje de ayni
    // ayni nesneyi temsil ediyor, sadece referanslari farkli

}