package W6D3

fun main() {

    val myMap = mapOf("Omer" to 30, "mustafa" to 40, "oguz" to 35)

    val myMap2 = mapOf("Omer" to 30, "mustafa" to 40, "oguz" to 35, "ismet" to 45)

    println("butun keyler: ${myMap.keys}")
    println("butun value: ${myMap.values}")


    if ("Omer" in myMap) {
        println("Omer var")
    }else {
        println("Omer yok")
    }

    if ( myMap == myMap2 ) {
        println("listler esit")
    }else {
        println("listeler esit degil")
    }
}