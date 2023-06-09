package mentoring_lessons._Araba

open class Araba3_getter_setter(var renk: String, var sene: Int) {

    var yeniRenk: String = renk
        get() = field                     // field = yukaridan alacagimiz deger olmus oluyor. get()'i = ile atiyoruz. set()'i { ile
        set(value) {                      // sadece okunacagi zaman "field" ( yani eski deger ), yeni deger atanacagi zaman da "value" oluyor
            field = value
        }
}