package mentoring_Lessons._22_03_2022


abstract class Person(name: String) {

    // class ilk cagirildiginda calistirilan fonsiyonumuz
    init {
        println("My name is $name")
    }

    // abstract class'lar icinde body'e sahip normal bir fonksiyon tutabilirler
    fun displaySSN ( ssn: Int) {
        println("My SSN is: $ssn")
    }

    // fakat icinde abstract bir methot tutacaksa, o method'un body'si olamaz.
    abstract fun displayJob ( description: String )
}

// Class'larda: Teacher bir Person'dur yani "is a" iliskisi vardir
// Burda abstract bir class'i extend ettik ve sadece bir tane class'i extend edebiliriz.
class Teacher(name: String): Person(name) {
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main() {

    val jane = object :Person("Jane") {

        override fun displayJob(description: String) {
            println("Hello2")
        }
    }


//    val jack = Teacher("Jack Smith")
//    jack.display Job("I am a mathematics teacher.")
//    jack.displaySSN(1225)

}

// abstract class'larda bir fonksiyonu override edebilmemiz icin onu open yapmaliyiz