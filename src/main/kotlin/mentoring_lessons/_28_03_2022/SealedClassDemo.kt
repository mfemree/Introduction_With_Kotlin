package mentoring_lessons._28_03_2022

sealed class SealedClassDemo {

    class A:SealedClassDemo(){
        fun display(){
            println("Subclass A of Sealed class Demo ")
        }
    }
    class B:SealedClassDemo(){
        fun display(){
            println("Subclass B of sealed class Demo")
        }
    }
}

fun main(){  // class in altindaki class lardan fonksiyonlara ulasiyoruz

    val obj =SealedClassDemo.B()
    obj.display()

    val obj1=SealedClassDemo.A()
    obj1.display()
}
