package W3D4

fun main() {

    val myHouse = House(100,3+1)   // house class'indan bir nesne olusturduk.

    println(myHouse.color)
    println(myHouse.isForSale)
    println(myHouse.numberOfWindows)

    myHouse.updateColor("Red")
    println(myHouse.color)             //  burda kullanciidan deger alarak rengi degistirdik

    myHouse.updateSaleStatus(true)
    println(myHouse.isForSale)         //  burda da kullanicidan deger alarak evin satilik durumunu degistirdik

}
