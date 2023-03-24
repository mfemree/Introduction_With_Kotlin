package W5D1

fun main() {

    val mainActivity = MainActivity()
    mainActivity.showProgress()

    val secondActivity = SecondActivity()
    secondActivity.showProgress()

    val thirdActivity = ThirdActivity()
    thirdActivity.showProgress()

    val activities = listOf<BaseActivity>(mainActivity, secondActivity, thirdActivity)


    val deneme1 = MainActivity()
    val deneme2 = SecondActivity()
    val deneme3 = BaseActivity()
    deneme3.showProgress()

    // val deneme4 = BaseAbstractActivity()  // abstract classlardan yeni bir nesne olusturulamiyor. kendisini turetemiyoruz
    // deneme4.provideProgressBarColor()

    val deneme5 = FifthActivity()        // fakat abstract class'i impelemnt etmis bir class ile nesne olusturulabiliniyor.fakat kendisinden tureyenleri turetebiliyoruz
    deneme5.provideProgressBarColor()    // ve onun fonksiyonlarina ulasabiliniyor  // kodun ciktisi "red"

    val deneme6 = object : BaseAbstractActivity() {
        override val counter: Int
            get() = 10

        override fun provideProgressBarColor(): String {
            return "deneme 6 calisir"
        }

        override fun deneme() {}
    }

    val deneme7= object : Contract2 {            // abstract class ile interface arasinda bu konuda bir fark yok.
        override fun contractTime(): String {
            return  "next year"
        }
    }





    for (activity in activities) {

        // java da olsak boyle yazacaktik
        /*        if ( activity instaanceOf MainActivity )
                       ((MainActivity)activity).showRecyclerView()*/

        // yazim sekli 1: hataya acik, patlayabilir
        (activity as MainActivity).showRecyclerView()   // javadaki instance of
                                                        // activity i bu sefer MAin activity olarak al
                                                        // mainActivity olarak alinca da diger tum methodlara da ulasabildik
                                                        // ama dongunun tamamina bakildiginda sira secondActivity e geldiginde kod patlar
                                                        // ve casting exception aliriz

        // yazim sekli 2: hata almaz
        (activity as? MainActivity)?.showRecyclerView()  // patlamamasini istiyorsak sonuna ? koyacagiz
                                                        // activity'i mainActivity olarak alabilir misin?
                                                        // alabilirse zaten sikinti yok, alamazsa null atayacak
        // yazim sekli 3: hata almaz
        if (activity is SecondActivity) {
            activity.something()
        }
        activity.showDialog()
        activity.showProgress()
    }
}

abstract class BaseAbstractActivity {       // sadece class i abstract yapmak birsey olmus olmuyor. onemli olan icine de abstract method yazmamiz, ki kendisini parent ilan eden classlar bu methodlari override etsin

    abstract val counter: Int

    open fun showProgress() {
        // ..
        val color = provideProgressBarColor()
        // display colored progress
    }

    abstract fun provideProgressBarColor(): String

    abstract fun deneme()                // abstract=soyut methodlarin body si olmaz.

}

open class BiggestBaseActivity           // yanlarina illa parantez acmak zorunda degiliz

// base, parent, super
open class BaseActivity : BiggestBaseActivity() {            // class larin default degeri = final dir. ki hickimse extend ya da implement alamasin.
    // herkese acmak istersek basina open yazarız
    open fun showProgress() {
        // show red progress
    }
}       // class lari open yapmazsak override edemeyiz. cunku diger class lardan ulasamayiz

// class Dog extends Animal
// class Dog ímplements Animal

class MainActivity : BaseActivity() {    // extend de etsen, implement de etsen : koyuyoruz sadece

    // @Override -> Annotation
    override fun showProgress() {
        // super.showProgress() --> super class i kullanmak/belirtmek zorunda degiliz. zaten bu amacimiza aykiri
        // show blue progress
    }

    fun showDialog() {}

    fun showRecyclerView() {}

}

class SecondActivity : BaseActivity() {

    fun something() {}
}

class ThirdActivity : BaseActivity() {}

class ForthActivity :
    BaseAbstractActivity() {         //  bir abstract claass'i parent class ilan edersen o abstract class'in altindaki tum abstract methotlari override etmek zorundasin.

    override val counter: Int
        get() = 25

    override fun provideProgressBarColor(): String {
        return "blue"
    }

    override fun deneme() {
        TODO("Not yet implemented")
    }


}

class FifthActivity : BaseAbstractActivity() {
    override val counter: Int
        get() = 24

    override fun provideProgressBarColor(): String {
        return "red"
    }
    override fun deneme() {}

}


// note: 2 classi ayni anda extend edemeyiz. boyle bir seyi yapmak istiyorsak interface uzerinden yapmaliyiz
// interfaceleri daha cok davranissal seyler uzerinde kullaniyoruz
// abstrac class lar ise hem state hem davranissal seyleri yazarken kullaniyoruz