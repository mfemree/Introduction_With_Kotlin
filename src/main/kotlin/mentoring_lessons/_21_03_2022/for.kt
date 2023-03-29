package mentoring_lessons

fun main() {

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (x in cars) {
        println(x)            // Volvo BMW  Ford  Mazda
    }

    mentoring_lessons.main2()  // 012345678910


}

fun main2() {

    for (x in 0..10) {
        print(x)

    }
}