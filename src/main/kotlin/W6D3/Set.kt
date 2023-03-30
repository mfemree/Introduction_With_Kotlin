package W6D3

fun main() {
    val namesSet = setOf("Ahmet", "Mahmut", "Muhammed", "Mustafa", "Ahmet", "Mahmut")
    println("namesSet'in elemanlari: ${namesSet}")      // ayni degerleri iki kere yazdirmaz.
    println("namesSet'in uzunlugu: ${namesSet.size}")   // ayni degerleri iki kere saymaz yani uzunluga dahil etmez
}