package mentoring_lessons._Araba

fun main() {

    var car1 = mentoring_lessons._Araba.Volvo()

    car1.renk = "siyah"
    car1.sene = 2014

    println(car1.renk)   // siyah
    println(car1.renkk)  // mavi
    println(car1.sene)   // 2014

    car1.calistir("BMW")

}