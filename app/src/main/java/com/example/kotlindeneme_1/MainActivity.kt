package com.example.kotlindeneme_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    //printLn ekrana yazmak için
    //DEĞİŞKEN VE SABİTLER
    // Var --- variabledan geliyor. Değişebilir
    //VAL------ tek seferlik kullanımı değişmez
    var sayi: Int  = 5
    var  sayi2: Int =7
    println(sayi)
    println(sayi2)

    val x:Int =30
    println(x) // x 30 olur daha yeni değer tanımlanmaz

    //STRİNGLER
    // birden fazla harf tutacaksa
    //CHAR ---- TWK HARF TUTACAKSA
    var metin    : String="test"
        println(metin)
    var metin2: String?
    metin2="asdfgh"
        println(metin2)
    // BOOLEAN--- TRUE FALSE
    var ifadem : Boolean= true
    println(ifadem)


    //ARİTMETİKSEL OPERATÖRLER
    // + , - , * , / , ++ , --
    val age: Int= 7
    val age2: Int= 9
    val sonuc: Int= age+ age2
    println(sonuc)

    //METİNSEL İFADELER
    val metinn: String= "abcd"
    val metinnn:String="1234"
    println(metinn+ metinnn)

     val sayfloat1: Float=12.5f
     val sayfloat2: Float= 3.2f
     println("bölüm sonucu :" + (sayfloat1/sayfloat2))


     // KARŞILAŞTIRMA OPERATÖRÜ

     val booleansonuc: Boolean = 5==7
     println(booleansonuc)
     //false deeğri döner
     //Mantıksal Operatör
     //&&--- VE   ||---- VEYA
     var durumb: Boolean = 5>6 && 3<6
     println(durumb) // false


        // İF ELSE YAPISI
        val sayi1: Int= 27
        val s2 : Int= 12
        if (sayi1>s2){
            println("sayi 1 büyük")
        }
        else if (s2>sayi1){
            println("sayi2 büyük")
        }
        else{
            println("ikiside eşit")
        }








    }
}