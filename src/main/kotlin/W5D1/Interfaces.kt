package W5D1

fun main() {


}

interface Contract {             // genel olarak interface in icinde sadece constructor seklinde/olacak yazacagimiz methodlar olur
                                 // normalde body'siz yazariz. bu yazilimcilar arasinda kuraldir ama body yazadabiliriz. kotlin hata vermez.

    // fonksiyonun/methodun imzasi = fonksiyonun/methodun ismi + donus tipi
    fun monthlyWage(): Int
    fun contractTime(): String
}

abstract class ContractAbstract {    // abstract class in altinda body'li methodlar olusturabiliyoruz veya degisken tanimlayabiliyoruz
                                     // ama interface lerde bunu yapamiyoruz. yapiyoruz aslinda ama yapmiyoruz diyelim.
    abstract fun monthlyWage(): Int
    abstract fun contractTime(): String

    val a = 3
    fun deneme() {
        // absnabba
    }

}

interface ContractInterface {
    fun monthlyWage(): Int
    fun contractTime(): String
}

interface Contract1 {
    fun monthlyWage(): Int
}

interface Contract2 {
     fun contractTime(): String
}

abstract class Contract3 {
    abstract fun monthlyWage(): Int
}

abstract class Contract4 {
    abstract fun contractTime(): String
}

class Utility: Contract3(), Contract1 {                // burda abstract bir class i extend ettik ve ayni zamanda bir interfaceyi impelemt ettik. ama ayni anda iki tane class i extend edemedik
    override fun monthlyWage(): Int {                  // interface nin yanina parantez acmamiza gerek kalmiyor
        return 30
    }
}

class Utulity2: Contract1, Contract2 {      // burda ise bir interface yi implement ettik. birden fazla interfaceyi implement edebildigimizi gorduk

    override fun monthlyWage(): Int {
        return 30
    }

    override fun contractTime(): String {
        return ""
    }
}

// interface uzerinden son zamanlarda fonksiyon da tanimlanailiyor fakat teoride cok kullanilmaz