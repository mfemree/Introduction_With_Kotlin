//  Programlamada, anonim bir fonksiyon(lambda) herhangi bir tanımlayıcıya gerek duymayan fonksiyondur.
//  Lambda genellikle Higher-Order(Üst düzey) fonksiyonlara iletilen argüman olabilir,
//  ya da bir sonuç döndürmesi gereken Higher-Order fonksiyonun sonucunu oluşturmak için kullanılır.

//  Fonksiyon sadece bir kez veya sınırlı sayıda kullanılacak ise isimlendirilmiş bir fonksiyon kullanmak yerine
//  lambda kullanmak SYNTAX açısından kolaylık sağlıyor.
//  Lambda, fonksiyonel programlama dillerinde bulunabilir.

//  val lambdaName : Type = { argumentList -> codeBody }

fun main(){
    val that : (Int) -> Int = { number -> number }
    val result =  that(35)
    //println(result)

    val more : (String, Int) -> String = { str, int -> str + int }
    //println(more("Jane", 35))

    val noReturn : (Int) -> Unit = { num -> println(num) }
    //noReturn(45)
}