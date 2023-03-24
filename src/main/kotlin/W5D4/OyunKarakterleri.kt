package W5D4

sealed class OyunKarakterleri  {  // sealed = gizli, mühürlü

    class Savasci(val hasar: Int, val zirh: Int) : OyunKarakterleri()
    class Buyucu(val mana: Int, val buyu: Int) : OyunKarakterleri()
    class Hirsiz(val calmaYetenegi: Int, val taklitYetenegi: Int) : OyunKarakterleri()

}





