package W5D3

fun main() {

    val firstPlayer = PlayerDataClass("M.Emre", 100)
    println(firstPlayer)    // Player(name=M.Emre, score=100)
    // toString metodu otomatik olarak olusturuldugu icin bu sekilde cikti aldik.


    // first playi kopyladik
    val copyPlayer = firstPlayer.copy()
    println(copyPlayer)

    val copyPlayer2 = firstPlayer.copy(name="Ahmet")
    println(copyPlayer2)

    val copyPlayer3 = firstPlayer.copy(score = 35)
    println(copyPlayer3)


    println(copyPlayer.component1())  // M.Emre
    println(copyPlayer.component2())  // 100

    println(copyPlayer2.component1())  // Ahmet
    println(copyPlayer2.component2())  // 100

    println(copyPlayer3.component1())  // M.Emre
    println(copyPlayer3.component2())  // 35


    println(Calculator.add(10,20))  // 30


    // yeni bir nesne olusturmamiza gerek kalmadi. dirett olarak tum degerlere/fonksiyonlara ulasabildik
    println(PhysicsSystem.WorldConstants.gravity)


    // burda ise, fonksiyonun/class'in degerlerine ulasabilmemiz icin yyeni bir obje olusturmak zorundayiz
    val testObject = PhysicsSystem()
    println(testObject.add(10,7))


    PlayerType.ASSASSIN
    PlayerType.PRIEST
    PlayerType.WARRIOR


    getPlayerSkill(PlayerType.WARRIOR)
    getPlayerSkill(PlayerType.PRIEST)
    getPlayerSkill(PlayerType.ASSASSIN)


    getPlayerSkillTest("Priest")
    getPlayerSkillTest("Student")


    val araba1 = Araba()
    araba1.ileriGit(60)
    araba1.geriGit(30)



}

fun getPlayerSkillTest(player:String){
    when(player) {

        "Priest"-> println { ("s priest can heal the party members") }
        "Student"-> println{  ("student diye bir oyuncu yok") }
    }
}
fun getPlayerSkill(player: PlayerType) {

    when(player){

        PlayerType.PRIEST->{ println("priest can heal the party members") }
        PlayerType.ASSASSIN->{ println("assassin can increas the total power use critical damage") }
        PlayerType.WARRIOR->{ println("warrior gordun mu kac!") }
    }
}

object Calculator {

    fun add( n1: Int, n2:Int):Int {
        return  n1+n2
    }

}