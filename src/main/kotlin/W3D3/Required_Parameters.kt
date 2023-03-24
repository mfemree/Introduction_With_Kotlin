fun main() {

    // parametre gerektiren metodlar


    tempToday("pazartesi", 30)     //  pazartesi is 30 centigrade

    gununSıcaklıgı(sicaklik = 20)            //  Bugun Cuma ve hava sicakligi 20 derece

}

fun tempToday (day: String, temp:Int ) {

    println("$day is $temp centigrade")

}

fun gununSıcaklıgı(gun: String = "Cuma", sicaklik:Int ) {

    println("Bugun $gun ve hava sicakligi $sicaklik derece")
}