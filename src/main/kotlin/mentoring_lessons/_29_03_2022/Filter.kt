fun evenNumbers(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            result.add(item)
        }
    }
    return result
}

fun checkNumbers(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (item > 3) {
            result.add(item)
        }
    }
    return result
}

fun check(list: List<Int>, condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (condition(item)) { // lambda'nın döndürdüğü Boolean sonucu if'in içerisindeki kontrolü yapmamızı sağladı
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = evenNumbers(numbers)
    val result = checkNumbers(numbers)

    println("evenNumbers = $evenNumbers") // prints "[2, 4]"
    println("result = $result") // prints "[4, 5]"

    val resultList = check(numbers) {num -> num % 2 != 0 }
    println(resultList)
}














/*
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = filter(numbers) { it % 2 == 0 }
    println(evenNumbers) // prints "[2, 4]"
}

fun filter(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}
*/
