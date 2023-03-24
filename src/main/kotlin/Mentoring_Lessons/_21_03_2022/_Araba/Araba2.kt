package Mentoring_Lessons._21_03_2022._Araba

class Araba2(var renk: String, var sene: Int) {          // arabayi bu sekilde yazarsak da constructor olur.

    init {
        println("merhaba init")   // kod ilk calistiginda bu satir calisir
    }

    constructor(model: String) : this( renk = "sari", sene = 2002) {     // burdaki this = constructor ( yani: renk ve sene )

        println("araba rengi: $renk, yil: $sene, model: $model")
    }

    constructor(model: String, model2: String) : this( renk = "sari", sene = 2002) {     // burdaki this = constructor ( yani: renk ve sene )

        println("araba rengi: $renk, yil: $sene, model: $model")
    }
}