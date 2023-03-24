package W3D5

fun main() {


    val myPerson = Person("Oguz", 29)

    println(myPerson.name)    // Oguz
    println(myPerson.age)     // 29

    myPerson.name = "M.Emre"
    myPerson.age = 30

    println(myPerson.name)    // M. Emre
    println(myPerson.age)     // 30

}
