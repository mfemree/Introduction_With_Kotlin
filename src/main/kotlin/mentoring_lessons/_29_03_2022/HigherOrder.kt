fun main(){

    fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
        return lambda(4.329)
    }

    //println(invokeLambda { num -> num > 0 })

    fun performAction(action: () -> Unit) {
        // Do things before the action
        println("Before action")
        action()
        println("After action")
        // Do things after the action
    }

    val cal = {
        val number = 24
        val number2 = 2
        val result = number * number2
        println("Hello, world! $result")
    }

    performAction(cal)
}