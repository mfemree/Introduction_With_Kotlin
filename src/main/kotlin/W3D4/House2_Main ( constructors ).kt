package W3D4

fun main() {

    val myHouse = House2(100,5)  // ctrl+p = parametreleri goster
                                            // 100 m2 lik bir ev

    val myHouse2 = House2(room = 3)        // area yi belirtmedik cunku default bir deger var zaten


    println(myHouse.houseArea)
}



