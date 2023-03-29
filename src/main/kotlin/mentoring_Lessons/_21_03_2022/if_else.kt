package mentoring_Lessons

fun main() {

    val saat = 22

    if (saat < 12) {
        println("gunaydin")
    } else if (saat > 12 || saat < 19) {   // bir tanesi dogru ise direkt onu yazar, digerine hic bakmaz
        println("iyi gunler")
    } else if (saat > 19) {
        println("iyi gunler2")
    } else println("iyi geceler")

}