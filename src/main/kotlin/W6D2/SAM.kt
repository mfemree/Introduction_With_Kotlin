package W6D2

fun sam() {

    // SAM = Single Abstract Method

    Runnable {
        // something inside run
    }

/*    OurInterface {   // iki methodu olan bir interfacede calismaz cunku hangisinden bahsedecegimizi bilemez
    }*/


    fun samDenemeleri() {

        val myIntercace: Runnable = InterfaceDeneme()
        // degisken bizden Runnable bir deger istiyorsa
        // InterfaceDeneme class'i da bir Runnable sa
        // o zaman biz bu degiskene, Runnable olarak bir InterfaceDeneme() verebilirim

        // InterfaceDeneme() nin icinde de sadece bir tane method oldugundan
        // parantez acip aynen bu sekilde yazabilrim, hic bir fark yok.
        // uzun hali:
        val myIntercace2: Runnable = object: Runnable{
            override fun run() {
            }
        }

        // intelij yukaridaki ifadeyi otomatik olarak buna cevirecek zaten.
        // parantezlerin icin direkt otomatik olarak run methodunun ici olmus oluyor
        // kisa hali:
        val myIntercace3: Runnable = Runnable {
            // some code inside run
        }


        // burda da cift fonksiyonu olan bir interface'yi implement ettik
        // ve gorduk ki TwoFunctionInterface si icinde cift method barindigindan bunu  parantez icinde {} yazamadik
        val interfaceWithTwoFunc: TwoFunctionInterface = object : TwoFunctionInterface {
            override fun firstFunc() {
            }
            override fun secondFunc() {
            }
        }

    }
}

class InterfaceDeneme: Runnable{   // bu class'in icinde tek bir fonsiyon oldugu icin yukaridaki parantezli Runnable sekldinde cagirabiliyoruz.
                                   // tek bir methodu olan interfacelerde calisir
    override fun run() {
    }
}
interface OurInterface {  // icinde iki tane fonksiyon olan bir interface icin bu SAM methodunu uygulayamayiz, cunku bizim hangi methoddan bahsettigimizi bilemez
    fun fire()
    fun run ( a: Int )
}

interface TwoFunctionInterface{
    fun firstFunc()
    fun secondFunc()
}
