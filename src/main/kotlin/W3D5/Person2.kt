package W3D5

class Person2(var firstName: String, var lastName: String, var age: Int) {

    var personInfo: String = ""
        get() {
            return "Kisinin adi $firstName, soyadi $lastName ve yasi $age..."
        }
        set(value) {
            val component = value.split(" ")
            firstName = component[0]
            lastName = component[1]
            field = value      //   ya da personInfo = value de diyebiliriz      // field = personInfo demek

        }


    var newAge: Int = 0
        get() {
            return age
        }
        set(value) {
            age =value
            field = value
            println("$age. yasiniz kutlu olsun" )

        }

    fun updateNewAge (newAgeUpdateValue: Int ) {
        newAge = newAgeUpdateValue
        println("Yas guncellendi $newAge")
    }


}