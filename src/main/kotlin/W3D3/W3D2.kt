fun main() {

    var deger: Int = 20

    var myCounter: Int? =null
    var nonNullCounter : Int

   //  nonNullCounter = myCounter!!
    nonNullCounter = myCounter ?: 100

    // yukaridakinin Javacasi

    if ( myCounter != null){
        nonNullCounter = myCounter
    } else {
        nonNullCounter = 100
    }


    nonNullCounter.inc()
    myCounter?.inc()       // null degilse cagir demek //  soru isareti koymazsak NPE hatasi aliriz

    if ( myCounter != null ) {
        myCounter.inc()
    }


    // Java'da Boolean isGreaterThanThirty = false
    var isGreaterThanThirty = true


    if ( nonNullCounter > 30 ) {

        isGreaterThanThirty = true
    } else {
        isGreaterThanThirty = false
    }


     isGreaterThanThirty = if ( nonNullCounter > 30 ) {
         true
    } else {
       false
    }

    isGreaterThanThirty = nonNullCounter > 30



    val myKotlinArrayList = arrayListOf("a", "b", "c")
    val myKotlinList = listOf<String>()
    val myKotlinlist2 = mutableListOf<String>()

    myKotlinArrayList.add(3,"ali")
    // myKotlinList.add("")
    myKotlinlist2.add("")



}