package W6D2

import java.lang.IllegalArgumentException

fun main() {

    val result1 = add1(13,7)
    println(result1)

     val resultAdd = add(13,7)
     println(resultAdd)

    /*****************************************************************************************************************/

    val result = calculate(10, 5, "/")
    println(result)

    val result2 = calculate(10, 5, ::divide)
    println(result2)

    /*****************************************************************************************************************/

    sayYourMessage(::getHelloMessage)

    sayYourMessage { "deneme" }

    /*****************************************************************************************************************/

    sayYourMessage {
        getHelloMessage()
    }

    /*****************************************************************************************************************/

    sayYourMessage2 { param: Int -> getHelloMessage() }

    /*****************************************************************************************************************/

    sayYourMessageWithAction("My message", { println("and my action") })


    sayYourMessageWithAction("My message") {
        println("and my action")
    }


}

// normalde nu sekilde yazardik biz hep
fun add1 ( firstNum: Int, secondNum: Int ): Int {
    return firstNum + secondNum
}

fun add ( firstNum: Int, secondNum: Int ) = firstNum + secondNum

fun substract ( firstNum: Int, secondNum: Int )= firstNum - secondNum

fun times2 ( firstNum: Int, secondNum: Int )= firstNum * secondNum

fun divide ( firstNum: Int, secondNum: Int )= firstNum / secondNum


// normalde biz bu skeilde yazardik
/*fun calculate( firstNum: Int, secondNum: Int, operation:String ) {

    when (operation) {

        "+" -> add(firstNum, secondNum)
        "-" -> substract(firstNum, secondNum)
        "*" -> times2(firstNum, secondNum)
        "/" -> divide(firstNum, secondNum)
    }
}*/

// ama artik bu sekilde de yazabilriiz
fun calculate( firstNum: Int, secondNum: Int, operation:String ): Int {

    return when (operation) {

        "+" -> add(firstNum, secondNum)
        "-" -> substract(firstNum, secondNum)
        "*" -> times2(firstNum, secondNum)
        "/" -> divide(firstNum, secondNum)
        else -> throw  IllegalArgumentException()
    }
}

fun calculate ( firstNum: Int, secondNum: Int, operation: (Int,Int) -> Int ) = operation(firstNum,secondNum)

fun getHelloMessage() = "Hello"

fun getGoodByeMesssage() = "Good Bye"

fun sayYourMessage( message: String ) { println(message) }

fun sayYourMessage(getMessageFunc: () -> String ) {  // bana bir fonksiyon ver, hicbir parametre almasin ve String donsun
    println(getMessageFunc())
}

fun sayYourMessage2(getMessageFunc: (Int) -> String ) {
    println(getMessageFunc(1))
}
fun sayYourMessageWithAction( message: String, action: () -> Unit) {
    print(message)
    action()
}

