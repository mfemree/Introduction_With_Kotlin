fun main() {


    //  y = 1 -> sabit fonksiyon
    //  f(x) = 2x + 1 -> deger donduren


    printHello()

    drive()                                 // driving fast
    drive("slow")                     // driving slow
    drive( speed = "fast and slow" )        // driving fast and slow
    drive(2.toString())                     // driving 2
}

fun printHello(): Unit {    // burda Unit yazsan da yazmasan da ayni = fark yok

    println("Hi there!")

}

fun drive(speed: String = "fast") {  // eger burda fast yazip bu fonksiyona deger atamasaydik, fonksiyona bir parametre vermeden cagiramazzdik mainden fonskiyonu

    println("driving $speed")


}







