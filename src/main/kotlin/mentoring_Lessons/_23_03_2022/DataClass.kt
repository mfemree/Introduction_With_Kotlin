package mentoring_Lessons._23_03_2022

// sadece verileri tutan model bir class gibi dusun bu classi
data class PersonalInfo( val name: String, val email: String, val phoneNum: Long)

object Convertor {
    
    fun brutToNet ( brutMaas: Double ): Double {
        
        return brutMaas - (brutMaas*0.05)
    }
}

class Employee {
    
    companion object {
        
        var jobDescription: String = "Engineer"
        var brutMaas:Double = 20000.0
        fun displayInfo ( info: PersonalInfo ) = println("Hello! My name is ${info.name}")  // PersonalInfo'dan alacak objelerini
    }
}

fun main() {

    val info = PersonalInfo("Jane", "email", 123456)
    Employee.displayInfo(info)      //  Hello! My name is Jane

    println(Employee.jobDescription)
    println(Employee.brutMaas)

    val netMaas = Convertor.brutToNet(Employee.brutMaas)
    println(netMaas)



    /*println(Convertor.brutToNet(Employee.brutMaas))
    println(Employee.jobDescription)
    Employee.displayInfo(PersonalInfo())*/
    
}

