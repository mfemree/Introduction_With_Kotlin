package W6D3

fun main() {

    val names = mutableListOf("Omer", "Ahmet", "Mustafa","Mehmet")

    //ekleme
    names.add("halil")

    //cikarma-silme
    names.removeAt(0)

    //guncelleme
    names[3] ="Emre"

    //icindekileri karistiriyor, random siralar halinde atiyor
    names.shuffle()
    println(names)

}