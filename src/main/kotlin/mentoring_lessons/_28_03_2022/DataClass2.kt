package mentoring_lessons._28_03_2022

fun main() {

    //declaring a data class
    data class DataClass2(val name: String, var age:Int) {

        //property declared in class body
        var height: Int = 0

    }
    //declaring a variable of the above data class and
    //initializing values to all parameters

    val man1=DataClass2("manish", 20)
    //class body properties must be assigned uniquely
    man1.height = 70

    //this method prints the details of class that
    //are declared in primary constructor
    println(man1.toString())         // DataClass2(name=manish, age=20)

    //printing the height of man1
    println(man1.height);            // 70

    /***********************************************************************************/

    val man2 = DataClass2("Mustafa",29)
    val man3 = man2.copy(name="Emre")
    println(man2)   // DataClass2(name=Mustafa, age=29)
    println(man3)   // DataClass2(name=Emre, age=29)

    man2.age=5
    val man4 = man2.copy()
    println("man4: $man4")            // man4: man4: DataClass2(name=Mustafa, age=5)

    var  x = man2.height
    println("man2: $x")               // 0
                                      // en basta default deger atandigindan bunu kopyalamiyor
}



