package mentoring_Lessons._21_03_2022._Araba

fun main() {

    var araba1 = Araba()
    var araba2 = Araba()

    println(araba1.renk)  // mavi
    println(araba2.sene)  // 0

    araba1.renk = "sari"
    println(araba1.renk)  // sari

    araba2.sene =1
    println(araba2.sene)  // 1

    araba1.calistir()    // araba calisti
    println(araba1.renk) // sari

    araba2.calistir()    // araba calisti
    println(araba2.sene) // 1

}
