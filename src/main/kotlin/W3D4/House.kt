package W3D4

import com.sun.org.apache.xpath.internal.operations.Bool

class House {

    constructor( area: Int, room:Int ) {
                                                                            // bunu bu sekilde yazabildigimiz gibi, direkt class in yaninda da belirtebiliyoruz
           println("Evin metrekaresi $area, oda sayisi $room...")           // sari yere tiklarsak direkt Class'in yanina ekler
    }

    var color: String = "Blue"
    val numberOfWindows: Int = 3
    var isForSale: Boolean = false


    fun updateColor(color: String ) {
        this.color = color
    }

    fun updateSaleStatus(isSale:Boolean ) {
        this.isForSale = isSale
    }

    init {
        println("Ev olusturuldu!!!!")      // nesne olusturulur olustuurlmaz calsicak sey
    }



}