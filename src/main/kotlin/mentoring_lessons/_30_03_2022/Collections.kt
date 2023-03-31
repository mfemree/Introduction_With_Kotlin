/*
COLLECTIONS

List
Elemanlarına index leriyle (liste içerisinde bulunduğu pozisyon) ulaşabileceğimiz sıralı Collection lardır.

Set
Elemanları birbirinden benzersiz olan Collectionlardır.
Sıralı olup olmaması önemsizdir.

Map
key-value (anahtar-değer) şeklinde verilerden oluşan Collectionlardır.
Her key benzersizdir ve ancak bir değeri gösterebilir ancak value ların eşsiz olmasına gerek yoktur.
*/

// 1. Immutable Collection : only read-only functionalities and can not be modified its elements
/*
    List – listOf()
    Set – setOf()
    Map – mapOf()
*/

// 2. Mutable Collection : both read and write functionalities.

/*
    List – mutableListOf(), arrayListOf() and ArrayList
    Set – mutableSetOf(), hashSetOf()
    Map – mutableMapOf(), hashMapOf() and HashMap
*/

fun main(){
    val newList = mutableListOf(1,2,3,3)
    val newSet = mutableSetOf(1,2,3,3,3)
    val newMap = mutableMapOf(1 to "11", 2 to "22", 3 to "33", 3 to "333", 3 to "3333" )    // ayni key'e sahip birden fazla value yazarsan en son yazdigin key'i kabyl eder

    println("List = $newList")
    println("Set = $newSet")
    println("Map = $newMap")

    // Adding
    newList.add(4)    // List = [1, 2, 3, 3]
    newSet.add(4)     // Set = [1, 2, 3]
    newMap[4] = "44"  // Map = {1=11, 2=22, 3=33}


    println("\nAdding\nList = $newList")   //  List = [1, 2, 3, 3, 4]
    println("Set = $newSet")               //  Set = [1, 2, 3, 4]                  // aynisindan olanlari 1 kere yazdirir
    println("Map = $newMap ")              //  Map = {1=11, 2=22, 3=3333, 4=44}


    // Removing
    newList.remove(4)
    newSet.remove(4)
    newMap.remove(4)

    println("\nRemoving\nList = $newList")  // List = [1, 2, 3, 3]
    println("Set = $newSet")                // Set = [1, 2, 3]
    println("Map = $newMap ")               // Map = {1=11, 2=22, 3=3333}


    // Getting
    println("\nGetting\nList = ${newList[2]}") // list'lerde indexi verir, hangi indexte ne oldugunu goruruz.
    println("Set = ")
    newSet.forEach {                     // set'lerde tum set'i forEach ile ve it ile yazdiririz
        println(it)                           // Set = 1 2 3
    }
    println("Map = ${newMap[2]}")             // map'lerde key'i verir value'yu aliriz.
                                              // Map = 22

    val people = listOf(
        Person("Joe", 15),
        Person("Agatha", 25),
        Person("Amber", 19)
    )
    val visitors = people.filter { it.age >= 18 }   // filter ile filtre yapiyoruz ve listenin her bir elemanini it ile ifade ediyoruz
    println(visitors) // [Agatha, Amber]

    println(people.find { it.age > 18 })

}

data class Person(val name: String, val age: Int)


