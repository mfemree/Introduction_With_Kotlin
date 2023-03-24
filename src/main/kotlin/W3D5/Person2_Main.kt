package W3D5

fun main() {

//    val myPerson = Person2("Mustafa Emre", "US", 29)
//    println(myPerson.persoInfo)
//
//    myPerson.persoInfo = "Ali"
//    println(myPerson.persoInfo)
//
//    val str = "Kalemler 3 TL"
//    val comp = str.split(" ")          // cumleyi spilit ile boldugu zaman, boldukelri seyi liste haline getirir.
//    val bir = comp.get(0)                       // o yuzden get ve index ler ile ulasiriz
//    val iki = comp.get(1)
//    val uc = comp.get(2)
//
//    println(comp)
//
//    println(bir)
//    println(iki)
//    println(uc)

    /*****************************************************************************************************************************/

    val newPerson = Person2("Mustafa Emre", "US", 29)
    println(newPerson.personInfo)

    newPerson.personInfo = "Mustafa Emre US Developer"

    println(newPerson.personInfo)

    println(newPerson.newAge)

    /*****************************************************************************************************************************/

    val myPerson3 = Person2("Omer", "Aydemir",29 )
    println(myPerson3.personInfo)
    myPerson3.newAge=30
    println(myPerson3.personInfo)

}