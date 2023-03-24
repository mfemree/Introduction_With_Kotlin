package W5D1

import java.lang.IllegalArgumentException

fun main(){

    val myClass = ClassRoom()
    myClass.tableCount
    // myClass.setTableCount(10)
    myClass.tableCount = 10

}


class Deneme constructor(deger:Int ) {

    init {
        // deger:Int den devam eder yazmaya
    }

}

class  ClassRoom {

    var tableCount: Int = 30
        set (value){

            if (value >= 50) {
                field= 1
            } else {
                field=0                      // field =tableCount
            }
        }

    fun setTableCount2(sayi: Int) {

        if(sayi > 12) {
            tableCount = sayi
        }else {
            throw IllegalArgumentException()

        }
    }

}