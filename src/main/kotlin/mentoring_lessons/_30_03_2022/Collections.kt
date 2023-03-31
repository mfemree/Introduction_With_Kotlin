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
    val newList = mutableListOf(1,2,3)
    val newSet = mutableSetOf(1,2,3,3,3)
    val newMap = mutableMapOf(1 to "11", 2 to "22", 3 to "33")

    println("List = $newList")
    println("Set = $newSet")
    println("Map = $newMap")

    // Adding
    newList.add(4)
    newSet.add(4)
    newMap[4] = "44"


    println("\nAdding\nList = $newList")
    println("Set = $newSet")
    println("Map = $newMap ")


    // Removing
    newList.remove(4)
    newSet.remove(4)
    newMap.remove(4)

    println("\nRemoving\nList = $newList")
    println("Set = $newSet")
    println("Map = $newMap ")


    // Getting
    println("\nGetting\nList = ${newList[2]}") // index verdik
    println("Set = ")
    newSet.forEach {
        println(it)
    }
    println("Map = ${newMap[2]}") // key verdik value alıcaz


    val people = listOf(
        Person("Joe", 15),
        Person("Agatha", 25),
        Person("Amber", 19)
    )
    val visitors = people.filter { it.age >= 18 }
    println(visitors) // [Agatha, Amber]

    println(people.find { it.age > 18 })

}

data class Person(val name: String, val age: Int)


