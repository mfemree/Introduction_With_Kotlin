package W5D3

class Araba: ArabaHareketEttirici {

    override fun ileriGit(hiz: Int) {
    println("Araba ileri gidiyor ve hizi: $hiz km/s")
    }

    override fun geriGit(hiz: Int) {
        println("Araba geri gidiyor ve hizi: $hiz km/s")
    }
}