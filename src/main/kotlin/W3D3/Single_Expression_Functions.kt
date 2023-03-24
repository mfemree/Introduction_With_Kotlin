import java.util.Calendar

fun main() {

   println(double(3))

    val y = double(4)
    println(y)

    val z = double2(5)
    println(z)

    println(sicaklik("carsamba", 29, true))

    printName("ali")
    printName(null)


}

fun double(x: Int): Int {    // sonucu Integer olarak donderecek

    return (x*2)
}



fun double2 (x:Int ): Int = x*3


fun sicaklik (gun: String, sicaklik: Int, yagis:Boolean ) :Boolean {


    return  when {

        gun == "Carsamba" -> true
        sicaklik > 30 -> true
        yagis == false -> false
        else -> false
    }
}

fun method (char: Char, byteArray: ByteArray, calender: Calendar ) {

}


fun printName ( name: String? ) {

    if ( name != null ){
        println("Hello $name")
    } else {
        println("it's null")
    }
}