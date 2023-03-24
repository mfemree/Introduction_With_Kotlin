package W5D4

fun main(){

    // Let'ler genelde null check icin kullanilir.


    var name: String? = "Omer"
    // name=null

    name?.let {
        println("Name: $it")
    } ?: println("name is Null")       // nullable name degeri null degilse it'i yazdir, null ise 'name is Null' yazdir.

    /******************************************************************************************************************/

    var x : Int? =null
    // x=10

    val y = x?.let {  // x null degilse x i 25 artir ve y ye esitle, null ise x i 0 yap ve y ye esitle
        it + 25
    } ?: 0

    println("x: $x, y: $y")

    /******************************************************************************************************************/

    val name2: String? = "Johnnnn"

    val result = name2?.run {

        println("Name: $this")  // this =yukardaki donen string deger
        this.length
    } ?: 0                            // null ise 0 yazdir degilse uzunlugunu yazdir

    println("Lenght: $result")

}