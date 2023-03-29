package mentoring_lessons._28_03_2022

// A sealed class with a string property
sealed class SealedClassFruit (val x : String)
{
    // Two subclasses of sealed class defined within
    class Apple : SealedClassFruit("Apple")
    class Mango : SealedClassFruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate: SealedClassFruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: SealedClassFruit)
{
    when(fruit)
    {
        is SealedClassFruit.Apple -> println("${fruit.x} is good for iron")
        is SealedClassFruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}
fun main()
{
    // Objects of different subclasses created
    val obj = SealedClassFruit.Apple()
    val obj1 = SealedClassFruit.Mango()
    val obj2 = Pomegranate()    // direkt ulastik kendisine

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
}
