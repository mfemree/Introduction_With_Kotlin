package W6D1_Lambda

import kotlin.reflect.KFunction1

fun main() {

    val degisken = "str"

    val degisken1 = sayHello()                  // bu sekilde yazdigimda tipi Unit oldu. Yani bir fonksiyon atamasi yapmis olmadik.
                                                     // burda bir degiskene fonksiyon atamis olmadik. burda fonksiyonu cagirmis olduk.

    val degisken2 = ::sayHello      // fonksiyon atamasi yapabilmek icin :: isareti koymamiz lazim
    val degisken3 = ::greeting

    // yazdirmanin uzun yolu
    degisken2.invoke()             // Hello
    degisken3.invoke("ali")  // Hello greeting ali

    // yazdirmanin kisa yolu
    degisken2()                    // sayHello()            bir nevi boyle oldu             yani  ->  Hello
    degisken3("ali")         // greeting("ali")       bir nevi bunu yapmis olduk      yani  ->  Hello greeting ali


    val deneme = ::greeting
    val deneme2 = ::greeting2


    // aslinda fonksiyon icine fonksiyon yolluyoruz

    takesParam(deneme)           // Hello greeting campus
    takesParam(::greeting)      // Hello greeting campus

    takesParam(deneme2)         // Hello greeting2 campus
    takesParam(::greeting2)     // Hello greeting2 campus

    val denemeWithType: (String) -> Unit = ::greeting
    // bu sekilde de tanimlayabilriiz
    //  ve "(String) -> Unit" bu kismi yazmak zorunda degiliz. kotlin zaten ne yazmak istedigimizi anliyor.

    // ben buraya direkt ::greeting yazmak yerine fonsiyonu direkt burda tanimlasam nasil olur?
    val denemeWithType2: (String) -> Unit = { name ->
        println("Hello greeting $name")
    }

    denemeWithType2("Emre")  // Hello greeting Emre


}


fun sayHello(): Unit {          // buraya Unit yazsak da yazmasak da bu fonksiyon Unit donduruyor. Yani bunu yazmaya gerek yok buraya
    println("Hello")
}

fun greeting(name:String): Unit {
    println("Hello greeting $name")
}

fun greeting2(name:String): Unit {
    println("Hello greeting2 $name")
}

fun takesParam(param: KFunction1<String, Unit>) {  // param: (String) = buraya paslayacagimiz fonsiyonun aldigi parametre,
  //  param.invoke("campus")                       // -> String =   dondurecegi tip
    param("campus")                                // yani buraya gelecek olan fonskiyonu hic bir zaman bilemeyecegiz
                                                   // takeSparam da buraya hangi fonksiyonun gelecegini bilmez
                                                   // o yuzden String parametre alan ve unit donduren her fonskiyonu icine alir.
}