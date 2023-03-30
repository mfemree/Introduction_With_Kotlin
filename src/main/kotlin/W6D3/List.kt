package W6D3

fun main() {

    // list olusturduk
    val numbers = listOf(1,2,3,4,5,6)

    // tum listeyi yazdirma
    println("numbers: $numbers")

    // listenin uzunlugunu alma:
    println("numbers'in uzunugu: ${numbers.size}")           // numbers'in uzunugu: 6

    // index ile listenin herhangi bir elemanina ulasma
    println("numbers'in 1.elemani: ${numbers.get(0)}")      // numbers'in 1.elemani: 1

    // yukaridakinin yerine bunu kullanmak daha iyi:
    println("numbers'in 2.elemani: ${numbers[1]}")          // numbers'in 2.elemani: 2

    // bir elemanin indexini bulma
    println("5 in indexi: ${numbers.indexOf(5)}")         // 5 in indexi: 4

    // bir elemanin var olup olmaidigni kontrol etmek
    println("9 un indexi: ${numbers.indexOf(9)}")        // -1 ( listede olmayan bir seyin indexini ararsak -1 verir )

/****************************************************************************************************************************/

    val person = Person("Emre", 29)

    // iki tane yeni liste olusturuyoruz
    // ve listeye person kisilerini farkli sekilde ekliyoruz
    val peopleList = listOf(Person("Mustafa",25 ), person,person)
    val peopleListTwo = listOf(Person("Mustafa",25), Person("Mustafa",25),person)

    val peopleListThree = listOf(Person("ahmet",35), Person("mehmet",30))

    println("listelerin esitlik durumu: ${peopleList == peopleListTwo}")   // true

    println("listelerin esitlik durumu: ${peopleList == peopleListThree}")   // false

}


data class Person ( val name: String, var age:Int)