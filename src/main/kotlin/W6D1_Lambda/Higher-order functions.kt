package W6D1_Lambda

    // bir fonskiyonu oarametre olarak alabilirler ya da bir fonsiyon dondurebilir.


fun encodeMsg( msg: String, encode: (String)-> String): String {       // iki parametre aliyor: 1.si tanesi msg isminde ve String tipinde bir parametre.
                                                                       //                       2.si encode isminde, String tipinde parametre alan ve yine String donduren bir Fonksiyon
                                                                       // disardan bir fonskiyon bekliyor anlaminda.
    return encode(msg)
    // return encode.invoke(msg)        // bu sekilde de cagirabiliriz. ayni sey
    // return encode("ajkds")           // bu da olur. herhnagi bir string yollasak da olur.
}