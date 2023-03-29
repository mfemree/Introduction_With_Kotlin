package Mentoring_Lessons_28_03_2022

object obj {

    // birden fazla nesne uretmek yerine, tek bir nesne uretiyir
    // farkli referanslar tanimlasak bile hepsi ayni referansa gidecekler
    // bu bir class degil obje.

    var sayi:Int =0

    fun yazdir() {
        println(sayi)   // 0
    }
}

fun main () {

    var obj1 : obj = obj
    obj1.sayi = 5
    obj1.yazdir()        // 5

    var obj2: obj = obj
    obj2.sayi = 8
    obj2.yazdir()       // 8

    obj1.yazdir()        // 8
                         //

    // iki obje de ayni
    // ayni nesneyi temsil ediyor, sadece referanslari farkli

}