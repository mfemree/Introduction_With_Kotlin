package W5D4

import java.util.regex.Pattern

// ExtensionFonksiyonlar


fun String.addPercent(): String {

    return "%$this"  // this + bize gelen string deger
}


fun Int.ucleCarp(): Int {
    return this * 3
}


fun String.isEmailValid(): Boolean {      // girilen bir seyin mail adresi olup olmadigini sorguluyor.

    val expression = "^[\\w.-]+@([\\w-]+\\.)+[A-Z]{2,8}$"

    val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
    val matcher = pattern.matcher(this)
    return matcher.matches()
}


fun MutableList<Int>.swap(index1: Int, index2: Int) {

    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
