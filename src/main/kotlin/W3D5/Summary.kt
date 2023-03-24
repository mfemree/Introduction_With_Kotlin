/*

package W3D5

fun main() {

    //string bir değeri null olarak tanımla. safe call ile uzunluğunu yazdır
    val name: String? = null
    println(name?.length)

    //string bir değeri tanımla. not null ile uzunluğunu yazdır
    val name1: String? = "John"
    println(name1!!.length)

    //string bir değeri null olarak tanımla. safe call ile büyük harf fonksiyonunu çağırarak yazdır
    val name2: String? = null
    println(name2?.toUpperCase())

    // string bir değeri tanımla.not null ile büyük harf fonksiyonunu çağırarak yazdır
    val name3: String? = "John"
    println(name3!!.toUpperCase())

    //string bir değeri null olarak tanımla.safe call ile uzunluğunu yazdır ve elvis operatorunu kullan
    // eğer null ise "Name is null" yazsın
    val name4: String? = null
    println(name4?.length ?: "Name is null")

    // string bir değeri tanımla.not null ile uzunluğunu yazdır ve elvis operatorunu kullan
    // eğer null ise "Name is null" yazsın
    val name5: String? = "John"
    println(name5!!.length ?: "Name is null")

    // function nedir? türleri?
    // in Kotlin, a function is a set of statements that perform a specific task.
    // Functions are used to break down a program into smaller, more manageable pieces of code,
    // and they can be called from other parts of the program to perform their designated tasks .

    //değer almayan, unit
    fun sayHello() {
        println("Hello!")
    }

    //değer alan, unit
    fun printFullName(firstName: String, lastName: String) {
        println("Hello $firstName $lastName")
    }

    //değer almayan, değer döndüren
    fun getRandomNumber(): Int {
        return (0..10).random()
    }

    fun main1() {
        val randomNum = getRandomNumber()
        println("Random number: $randomNum")
    }

    //değer alan değer döndüren
    fun getLength(inputString: String): Int {
        return inputString.length
    }

    fun main2() {
        val inputString = "Hello, world!"
        val stringLength = getLength(inputString)
        println("Length of input string: $stringLength")
    }

    //function default value
    fun greetPerson(name: String = "John", age: Int = 30) {
        println("Hello, my name is $name and I'm $age years old.")
    }

    fun main3() {
        greetPerson("Jane", 25) // prints "Hello, my name is Jane and I'm 25 years old."
        greetPerson("Bob") // prints "Hello, my name is Bob and I'm 30 years old."
        greetPerson() // prints "Hello, my name is John and I'm 30 years old."
    }

    //çok değer alan bazıları default değer func yaz
    fun calculateArea(length: Int, width: Int = 10, height: Int = 5): Int {
        return length * width * height
    }

    fun main4() {
        val area1 = calculateArea(2) // uses default values for width and height, returns 100
        val area2 = calculateArea(4, 3) // uses default value for height, returns 60
        val area3 = calculateArea(5, 6, 2) // uses all provided values, returns 60
        println("Area 1: $area1")
        println("Area 2: $area2")
        println("Area 3: $area3")
    }


    // compact function nedir örnek
    // Compact functions, also known as single-expression functions,
    // are a feature in Kotlin that allow you to define functions with a very short syntax when the function body is a single expression .
    fun add(a: Int, b: Int) = a + b
    fun isEmpty(str: String) = str.isEmpty()

    // lambda func nedir örnek
    // In Kotlin, a lambda function is a function that can be defined anonymously and passed as a parameter to other functions.
    // It is a concise way to define a function that can be used as a variable or passed around as a value.
    // { arguments -> body }

    val square = { x: Int -> x * x }
    println(square(5)) // prints "25"

    val containsSubstring = { s: String, sub: String -> s.contains(sub) }
    println(containsSubstring("hello world", "world")) // prints "true"


    val greeting: (String, String) -> Unit = {
        name, message = "Hello" ->
        println("$message, $name!")
    }
    greeting("John") // prints "Hello, John!"
    greeting("Mary", "Hi") // prints "Hi, Mary!"


    val add = { a: Int, b: Int -> a + b }

    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }

    println(squaredNumbers) // prints "[1, 4, 9, 16, 25]"

    // high order func nedir örnek
    // In Kotlin, higher-order functions are functions that take other functions as parameters, or that return functions as results.

    fun printMessage(message: String, printer: (String) -> Unit) {
        printer(message)
    }

    // Usage:
    printMessage("Hello, world!", { println(it) })
    // Output: "Hello, world!"

    ------------------------------------------------------------------
    fun createMultiplier(factor: Int): (Int) -> Int {
        return { number -> number * factor }
    }

    // Usage:
    val double = createMultiplier(2)
    val triple = createMultiplier(3)
    println(double(5)) // Output: 10
    println(triple(5)) // Output: 15


    // :: operator ve örnekler
    // In Kotlin, the::operator is called the "member reference" operator, and it is used to create a reference to a function, property, or constructor.

    fun main() {
        val list = listOf(1, 2, 3, 4, 5, 6)

        val evenNumbers = list.filter(::isEven)
        println(evenNumbers) // Output: [2, 4, 6]
    }

    fun isEven(num: Int) = num % 2 == 0


    // inline fun ve örnek
    // If we don't use the inline keyword in the example I provided, the lambda expression passed to the perform
    // Operation function would be treated as a function object and would be allocated on the heap at runtime.This would result in additional memory overhead and could potentially impact the performance of our program .


    //filter operation for list örnekler
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4, 6]


    // eagerfilter ne örnek
    // In Kotlin, eagerFilter is an operation that is similar to filter,
    // but it returns a new list that is eagerly evaluated, meaning that the filtering is done immediately, rather than being lazily evaluated.
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.eagerFilter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4, 6]

    // In this example, we have a list of numbers and we want to filter out the even numbers.
    // We use the eagerFilter function on the list and pass in a lambda expression that
    // checks whether each number in the list is even (it % 2 == 0).
    // The eagerFilter function then returns a new list containing only the even numbers.


    // lazyfilter ne örnek
    // In Kotlin, lazyFilter is an operation that is similar to filter,
    // but it returns a new sequence that is lazily evaluated,
    // meaning that the filtering is done only when needed, rather than being eagerly evaluated.

    val numbers = sequenceOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.lazyFilter { it % 2 == 0 }
    println(evenNumbers.toList()) // Output: [2, 4, 6]

    // In this example, we have a sequence of numbers and we want to filter out the even numbers.
    // We use the lazyFilter function on the sequence and pass in a lambda expression that checks whether each number in the sequence is even (it % 2 == 0).The lazyFilter function then returns a new sequence containing only the even numbers.The toList function is used to force the sequence to be evaluated and printed to the console.


    // sequence nedir ve asSequence() kullanımı
    // In Kotlin, a Sequence is a collection-like object that represents a sequence of elements,
    // and can be used to perform lazy evaluations of operations on those elements.The asSequence function in Kotlin is used to convert a collection or an array into a sequence.

    val list = listOf(1, 2, 3, 4, 5, 6)
    val sequence = list.asSequence()
    val evenNumbers = sequence.filter { it % 2 == 0 }
    println(evenNumbers.toList()) // Output: [2, 4, 6]


    // In summary, List is a good choice for small to medium-sized collections that require random access to their elements and support for mutable operations.
    // Sequence, on the other hand, is better suited for larger collections that require lazy evaluation and can benefit from improved performance.


    // map() ve flatten()
    // map(): The map() function is used to transform each element of a collection into a new element by applying a given transformation function to each element.
    // The result of map () is a new collection containing the transformed elements.

    val list = listOf(1, 2, 3, 4, 5)
    val squaredList = list.map { it * it } // squares each element in the list
    println(squaredList) // [1, 4, 9, 16, 25]


    // flatten(): The flatten() function is used to flatten a collection of collections into a single collection.
    // This is useful when you have a collection of nested collections, and you want to combine them into a single collection.

    val nestedList = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flattenedList = nestedList.flatten()
    println(flattenedList) // [1, 2, 3, 4, 5, 6]


}
*/
