package W5D4

class Oyun {

    fun karakterOlustur(karakter: OyunKarakterleri) {

        when (karakter) {

            is OyunKarakterleri.Savasci -> {
                println("Savasci karakter olusturuldu. Hasar: ${karakter.hasar}, Zirh: ${karakter.zirh}")
            }

            is OyunKarakterleri.Buyucu -> {
                println("Buyu karakteri olusturuldu. Buyu: ${karakter.buyu}, Mana:${karakter.mana}")
            }

            is OyunKarakterleri.Hirsiz -> {
                println("Buyucu karakter olusturuldu.Calma yetenegi: ${karakter.calmaYetenegi}, Taklit yetenegi: ${karakter.taklitYetenegi}")
            }
        }
    }
}