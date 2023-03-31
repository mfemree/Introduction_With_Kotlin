// EX1
// 10 elemanlı bir diziyi random(10dahil) olarak doldurduktan sonra,
// kullanıcının  gireceği bir rakamı arattırınız.
// bu rakam var ise indexini yazıdırnız.
// Math.Random -> 0- 0,99   -> 10 *   0- 9,9999 -> 0-9

// EX2
// Kullanıcıdan alacağınız 6 elemanlı(sayı) bir dizinin
// sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
// yazdırınız.

// EX3
// 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
// doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
// diziye atınız.

// EX4
/*
5 tv kanalı ismini bir diziye doldurunuz.
Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
fakat bir buldunu tekrar bulmasın
ve tum kanallar bittiginde "secilecek kanal kalmadi" yazdirsin
*/

fun main() {
    // EX4
/*    val list = mutableListOf("A", "B", "C", "D", "E")

    for (i in 0..4) {
        val randomIdx = list.indices.random()
        println(list[randomIdx])
        list.removeAt(randomIdx)
        if(list.size == 0) println("secilecek kanal kalmadi")
    }*/

    // EX3
    /*val list = mutableListOf<Int>()

    for (i in 1..10) {
        list.add((0..20).random())
    }

    println(list)

    var set = mutableSetOf<Int>()

    set = list.toMutableSet()

    println(set)*/



    // EX2
   /* val list = mutableListOf(1,2,3,4,5,6)
    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers)*/


    // EX1
    val list = mutableListOf<Int>()
    val list2 = mutableListOf(1,2,3,5,6,5)

    for (i in 1..10) {          // ve 10 tane tut
        list.add((0..20).random())  // 20 ye kadar random sayi tut aklinda
    }

    println("list= $list")
    println(list.indexOf(5))  // aklinda tuttugun sayilarda 5 varsa, 5 in indexini ver.

    if (list.indexOf(5) == -1) println("Eleman bulunamadı.")
    else println("Index = ${list.indexOf(5)}")

    println("list2= $list2")

    println("\n${list2.indexOf(5)}")              // 5 in indexi
    println("\n${list2.lastIndexOf(5)}")  // sondan basla aramaya


}