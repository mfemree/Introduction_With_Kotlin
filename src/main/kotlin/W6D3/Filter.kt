package W6D3

import W6D2.add

fun main() {

    val ages = listOf(25,26,27,28,30,32,35)


    println( ages.filter { it >30 })

/*    ages.filter { it >30 }
    println(ages)*/            // bu sekilde kabul etmiyor


    val myList = listOf("ahmet", "mehmet", "ayse", "betul")

    println(myList.filter { it[1] == 'e' })  // 1. indexi e olanlari yazdir


    val numbersSet = setOf( 10,20,20,40 )

    println(numbersSet.map { it * 10 })      // [100, 200, 400]
                                             // ayni olan degerlerin sadece bir tanesini carpip gosterir

    val numberPlusFive = (numbersSet.map { it + 10 })
    println(numberPlusFive)                  // [20, 30, 50]


     numbersSet.forEach{
        it*10
    }

    val numberListTwo = listOf(listOf(1,2,3), listOf(4,5), listOf(6,7,8))

    // listeleri birlestirme syntax'i
    println(numberListTwo.flatten())         // [1, 2, 3, 4, 5, 6, 7, 8]


    val list1 = listOf(1,2,3)
    val list2 = listOf(4,5,6)

    val list3 = list1.plus(list2)
    println(list3)                          //  [1, 2, 3, 4, 5, 6]


}