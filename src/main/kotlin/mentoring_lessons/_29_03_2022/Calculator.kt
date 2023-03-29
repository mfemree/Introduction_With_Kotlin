fun sum(x: Int, y: Int): Int {
    return x + y
}

fun product(x: Int, y: Int): Int {
    return x * y
}

fun calculator(x: Int, y: Int, calculate : (Int, Int) -> Int ):Int {
    return calculate(x, y)
}

fun main() {
    val sumResult = sum(10, 20)
    val productResult = product(10, 20)
    println("sum = $sumResult, product = $productResult")

    val sum = { a: Int, b: Int -> a + b }
    val product = { a: Int, b: Int -> a * b }

    println(calculator(10, 20, sum) )
    println(calculator(10, 20, product) )


    val sum2 = calculator(10, 20) { x, y -> x + y }
    val product2 = calculator(10, 20) { x, y -> x * y }

}















/*
fun calculator(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    println("Entered Values are $x , $y")
    return operation(x, y)
}

fun main() {
    val sum = calculator(10, 20) { x, y -> x + y }
    val product = calculator(10, 20) { x, y -> x * y }
    println("sum = $sum, product = $product")
}
*/