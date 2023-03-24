package W3D4

class House2(var area: Int=300, room:Int) {        // burdaki area parametresini sonradan degistirmek istiyorsak basina var yazmaliyiz
                                                   // baska bir yerden, bir House2 nesenesi uretmek istiyorsak artik onun area'sini belirtememiz gerekiyor
                                                   // veya burda default olarak deger de verebiliriz "class House2(var area: Int = 200)"
                                                   // boyle yapinca da, olusturdugumuz yeni deger parametre girmemizi istemeyecek. ama yeni bir deger giredebilir ve girersek o degeri alacak.

    var houseArea = area   // yeni bir degisken olusturduk ve onu da yukardaki area ya esitledik

}