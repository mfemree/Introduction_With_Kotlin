fun main(){

    val calculateGradeByLambda: (Int) -> String  = { grade ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> "Error"
        }
    }

    println(calculateGradeByLambda(45))

}