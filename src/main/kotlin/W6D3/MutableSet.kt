package W6D3

fun main() {

    val myMutabelSet = mutableSetOf("Omer", "Ahmet", "Mustafa")

    // normal bir set olsa bu islemi yapamazdik
    myMutabelSet.remove("Omer")
    myMutabelSet.add("mehmet")

    println(myMutabelSet)   // [Ahmet, Mustafa, mehmet]  - yeni elemani en sona ekler

    // listede olmayan bir seyi silemye kalkarsak false aliriz
    println(myMutabelSet.remove("asdasf"))

    println("listeye en son eklenen eleman: ${myMutabelSet.last()}")    // mehmet

    println("listeye ilk eklenen eleman: ${myMutabelSet.first()}")      // ahmet


}