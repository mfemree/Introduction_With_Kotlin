package W6D3

fun main() {
    val myMutableMap = mutableMapOf("omer" to 30, "mustafa" to 40, "oguz" to 35, "ismet" to 45)

    myMutableMap.remove("oguz")
    myMutableMap["can"] =45
    println(myMutableMap)

    // key degerlere yeni value deger atamis oluyoruz

}