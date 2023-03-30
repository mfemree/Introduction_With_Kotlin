package W6D3

fun main() {

    // bunun tek amaci bu

    val name = getPersonInfo2().first
    val age = getPersonInfo2().second

    println("isim: " + getPersonInfoTriple().first)
    println("age: " + getPersonInfoTriple().second)
    println("height: " + getPersonInfoTriple().third)
}

fun getPersonInfo(): PersonInfo {
    return PersonInfo("Emre", 29, 1.68)
}

// ikili olarak kullanim:
fun getPersonInfo2(): Pair<String,Int> {
    return Pair("Emre",29)
}

// boyle yapmiyoruz
/*fun getPersonInfo3(): String,Int,Double {
    return "Emre", 29, 1.68
}*/

// uclu olarak kullanim:
fun getPersonInfoTriple(): Triple<String,Int,Double> {
    return Triple("Emre", 29, 1.68)
}



data class PersonInfo ( val name: String, var age:Int, var height:Double)

