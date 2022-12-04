package com.hasangunduz.classandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.parcel.Parcelize


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = 9;
        if (j == 0) {
            firstFunction()
        } else {
            secondFunction()
        }

        subtraction(100, 203)
        var x = sum(10, 20)
        textView.text = "Total : ${x}"

        button.setOnClickListener {
            val toplamaSonucu = sum(40, 49)
            textView.text = "Total : ${toplamaSonucu}"
        }

        classTraning()
        nullSecurity()
    }

    fun firstFunction() {
        println("first func working.")
    }

    fun secondFunction() {
        println("second func started.")
    }

    //Girdi almak
    //unit : boş ya da boşluk anlamına gelir sonunda nesne döndürmeyeceği anlamına gelir.
    fun subtraction(x: Int, y: Int) {
        textView.text = "Total = ${x - y}"
    }

    //Cıktı vermek  -> Döndürmek (Return)
    fun sum(a: Int, b: Int): Int { // ne diyorsam yap sonunda da Int döndür diyor.
        return a + b;

    }


//fun changer(view: View) { //**Bir görünüm cağırılıcak yerlerde view cagırırız.
//    val toplamaSonucu = sum(4, 15)
//    textView.text = "Total : ${toplamaSonucu}"
//}


    fun classTraning() {

        var superHero = SuperHero("Superman", 32, "Gazeteci")
        textView.text = "Yas : ${superHero.age}"

        println(superHero.getHairColour())
    }

    fun nullSecurity() {
        //Null , Nullability, Null Safety

        //Tanımlama Defining
        var myString: String?


        //Initialization
        myString = "hasan"
        var myAge: Int? = null
        println(myAge)


        //1
        if (myAge != null) println(myAge * 2)
        else println("Null geldi.")

        //2
        // !! -> null olmayacak demek ,
        // ? --> null olabilir demek.
        println(myAge?.minus(2))


        //3
        // elvis operatorü

        val total =
            myAge?.minus(2) ?: 10 //sol tarafa bak ;  null gelirse soldaki işlemi yap . null gelmiyorsa 10 u al demek.

        println(total)


        //4
        //let
        myAge=5
        myAge?.let { //benim yasım eğer null ise burası calıstırılmıyor . fakat myAge  = 5 dersek 5*5 olacak.
            println(it * 5)
        }
    }

}



