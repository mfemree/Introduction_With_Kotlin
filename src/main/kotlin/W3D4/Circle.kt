package W3D4

class Circle(val radius: Double) {


    constructor (diameter: Int) : this(diameter / 2.0) {      //  capini vererek bir Circle olusturmak istiyorsan, bu constructoru kullan ve capi 2 ye bol
        println("you are in diameter constructor")                  // this = radius
    }

    init {
        println("Area : ${Math.PI * radius * radius}")    // bu da constructor gibi
    }

    constructor(name:String): this(1.0) {          // kullanici string bir deger girerse, yaricapi otomatik olarak 1.0 al ve ona gore islem yap
        println("you are in string constructor")
    }

}