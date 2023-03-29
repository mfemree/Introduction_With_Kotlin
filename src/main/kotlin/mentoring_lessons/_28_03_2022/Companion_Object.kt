package mentoring_lessons._28_03_2022

class KullaniciKayit ( var id: Int, var isim: String ) {

    // basina companion object yazmadan:
/*    var kullaniciKayit =0

    init {
        kullaniciKayit++
    }

    fun BilgileriGoster()  {
        println("id: $id, isim: $isim, kullanici sayisi: $kullaniciKayit" )
    }*/


    // basina companion object yazdiktan sonra:
    companion object{
        var kullaniciKayit =0
    }

    init {
        mentoring_lessons._28_03_2022.KullaniciKayit.Companion.kullaniciKayit++
    }

    fun BilgileriGoster()  {
        println("id: $id, isim: $isim, kullanici sayisi: ${mentoring_lessons._28_03_2022.KullaniciKayit.Companion.kullaniciKayit}" )
    }
}

fun main() {

    var kullanici1: mentoring_lessons._28_03_2022.KullaniciKayit =
        mentoring_lessons._28_03_2022.KullaniciKayit(1, "Mustafa")
    kullanici1.BilgileriGoster()

    var kullanici2: mentoring_lessons._28_03_2022.KullaniciKayit =
        mentoring_lessons._28_03_2022.KullaniciKayit(2, "Emre")
    kullanici2.BilgileriGoster()

    var kullanici3: mentoring_lessons._28_03_2022.KullaniciKayit =
        mentoring_lessons._28_03_2022.KullaniciKayit(3, "US")
    kullanici3.BilgileriGoster()

    // basina companion object yazmadigimizda:
    // hepsinde 1 yazdirdi
    // cunku her seferinde farkli bir nesne olusturdu
    // ama object her seferinde ayni nesneyi kullaniyordu
    // her kullanici1, kullanici2, kullanici3'e sira geldiginde 0 dan basladi.


    // basina companion object yazdigimizda ise:
    // tek bir nesne olusturdu ve her seferinde onun uzerinden gitti
    // javadaki static gibi dusun
    // her seferinde ayni nesne uzerinden islem yapiyor
    // onemli olan hedef nesneden tek bir tane uretilmesi ve hep o nesneyi kullanmak
    // yani onun disindaki fonsiyonlarda ona bir islem yaptigimizda o nesne degismiyor

}