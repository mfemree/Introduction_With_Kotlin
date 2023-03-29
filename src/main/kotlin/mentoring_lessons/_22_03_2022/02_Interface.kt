package mentoring_lessons._22_03_2022


interface Person2 {

    // init {} --> Interface'ler consctructor veya init fonksiyonu almazlar

    val name: String

    fun displaySSN ( ssn: Int) {
        println("My SSN is: $ssn")
    }

    // interface'lerin en buyuk ozelligi, body'e sahip olmayan fonsiyonlar yazip onlari daha sonra kullanmak
     fun displayJob ( description: String )
}

// Implementlerde ise: Teacher Person'a ait islevleri gerceklestirebilir. "can do" iliskisi vardir.
// burda once Person2'yi implement ettik ve ardindan name'i degiskenini override etmemizi istedi
class Teacher2(override val name: String) : mentoring_lessons._22_03_2022.Person2 {

    // ve icindeki body'si olmayan methodlari impelemnt etmemizi isteyerek, onlari override etti
    // body'si olan fonksiyonlari implement etmemizi istemedi ve override etmedi
    override fun displayJob(description: String) {
        println(description)
    }

    // interface'lerde butun interfaceler public durumunda oldugu icin methodun basina "open" yazmamiza gerek kalmadan fonsiyonu cagirabildik
    override fun displaySSN(ssn: Int) {
        super.displaySSN(ssn)
    }

}

fun main(){

    val jane = mentoring_lessons._22_03_2022.Teacher2("Jane Smith")

    println("name= ${jane.name}")
    jane.displayJob("I am a teacher")
    jane.displaySSN(12235)
}
