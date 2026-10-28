package com.ecemkurt.kotlinogreniyorum

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //KOTLİNDE SÖZ DİZİMİ
        //******************************

        println("merhaba dünya")
        println("loglara ikinci yazdırılacak satır")
        //notları böyle alırız
        //yorum satırı

        //println içine sadece tırnak içnde yazılmaz.
        println(5*2)
        println(10/5)
        //bu şekilde yazsak da kotlin bunu anlar ve logcat üzerinde gösterir.




        //KOTLİNDE VERİ TİPLERİ VE DEĞİŞKENLER
        //************************************


        //integer - tam sayı
        println("--------Integer--------")
        var x = 10
        //var -> tam sayı veri tipidir.
        // x -> değişkenimiz =10 ise değişkenimize atadığımız değerdir.
        //yani artık kotlin x gördüğü yerde 10 olarak düşünecek.
        println(x) // bunu çalıştırınca logcat'e 10 değerini gösterir.
        println(x*20)// bunu çalıştırınca logcat'e 200 sonucunu verir.

        x=30 // bu satırdan itibaren x  artık 30 değerini alır.
        println(x)//bu satırı da çalıştırınca logcate 30 değerini gösterir.

        var y = 5 //y isimli yeni bir değişken tanımlıyoruz.
        println(x+y) // logcate 35 sonucunu verir.

        val z = 20
        //val -> sabit olarak tanımlanan tam sayı değişkenleri için kullanılan veri tipidir.
        // z=30 //bunu kullanamayız, bize hata verir. çünkü z değişkenini sabit olarak tanımladık, değiştiremeyiz.


        //EXPLICIT -> Veri tipini belirterek tanımlamaya açık bir şekilde tanımlama denir.
        //IMPLICIT -> Veri tipini belirtmeden tanımlamaya kapalı bir şekilde tanımlama denir.
        var ornek : Long = 10
        //ornek değişkenini integer olarak değil long olarak tanımladık. Artık integer değil long olarak hafızada 64 bit yer kaplar.
        var ornekShort : Short = 250
        //ornekShort değişkenini short olarak tanımladık. Hafızada 16 bit yer kaplar.
        var ornekByte : Byte = 15
        //ornekByte değişkenini byte olarak tanımladık. Hafızada 8 bit yer kaplar.
        var ornekInt : Int = 50
        //Integer olan bir değişkeni : Int olarak tanımlamasak da varsayılan olarak int algılar.
        println(ornekByte+ornekShort)

         // DEĞİŞKEN İSİMLENDİRİLMESİ
        //******************************************


        //snake_case -> kullanici_adi
        //camelCase -> kullaniciAdi
        //Kotlinde genellikle camelCase şekli kullanılır.


        // ornekDegisken  -> uzun, iki veya daha fazla kelimeden oluşan değişken oluştururken kodun düzgün okunabilmesi için bu şekilde büyük harfler kullanılarak yazılır.
        //kullaniciAdi, kullaniciYasi, kullaniciBoyu vb. kodun okunabilirliğini kolaylaştırır ve clean kod oluşturmamıza yardımcı olur.

        val m = 10
        val n = 20
        println(m+n)//bunu çalıştırınca doğru sonucu verir.

        //Diyelim ki m+n ifadesinin sonucunu bir değişkene atamak istiyoruz:
        val sonuc = m+n
        println(sonuc)//artık iki değişkeni bir işlemden geçirip başka bir değişkene atadık.

        //**KESİRLİ SAYILAR
        //*****************************//


        //float -> 32 bit, double -> 64 bit
        println("-------------Double-Float-------------")

        //Tam sayılar ile kesirli sayılar farklı veri tipleriyle yazılır.
        //Kesirli sayılar için   veri tipi kullanılır.

        val pi = 3.14 // kesirli değişkenlere değer atarken virgül değil nokta kullanılır.
        //kotlinin kesirli sayılar için varsayılan veri tipi double'dır.

        println(pi*2)//matematiksel olarak sonucu doğru verir. 6.28
        println(5/2)//bunun sonucu olarak 2 verir. bunun sebebi ise kotlinde integer bir değeri yine integer bir değere bölersek sonucu yine integer verir.
        //eğer 2.5 sonucunu elde etmek istersek:
        println(5.0/2.0)//bu şekilde double değeri yine double bir değere bölmemiz gerekir. Bunun sonucu 2.5 gelir.

        val ornekDouble = 3.0
        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f //float değer tanımlarken syntaxı Float olarak belirlesek bile atadığımız değerin sonuna f eklememiz gerekiyor. Diğer türlü kotlin bunu kabul etmiyor.
        println(ornekFloat)
        //kotlinin bunu yapmasının sebebi double kullanımını artırmak.

        //**UNSIGNED INTEGER

        val unsignedByte : UByte =10u
        val unsignedShort : UShort = 10u
        val unsignedInteger : UInt = 10u
        val unsignedLong : ULong = 10u

        //**STRINGLER
        //Metin değişkenleri içiin kullanılır.
        println("--------------String----------------")

        val benimString = "Benim String'im" //string değişkenlerine değer atarken tırnak içinde yazılır
        println(benimString)

        val ornekString : String = "ornek" //string veri tipini tırnak içinde tanımladığımız için değişken tanımlamada tekrardan string olduğunu belirtmemize gerek yok.

        val isim = "ecem"
        //isim. yazarsak isim değişkeninin yapabildiği birçok farklı metodlar ve sahip olduğu özelliklerini görebiliriz.
        println(isim.uppercase())// bu şekilde uppercase metodunu kullanabiliriz. uppercase() şeklinde yazılır. parantez açıp kapatması bu metodu çalıştır demek.
        // uppercase() metodu atadığımız değeri büyük harflerle yazmasını sağlar. Ama bu bir string değişken oludğu için kullanabildiğimiz bir metoddu.
        //Örneğin println(x.uppercase()) metodu çalışmaz. Çünkü x değişkenimizin değeri integer veri tipindedir.

        val soyisim = "kurt"
        //stringlerde de toplama işlemi yapılabilir.
        println(isim+soyisim) //bunun çıktısı ecemkurt şeklinde olur. Çünkü string ifadelerde toplama yapmak demek değerleri yan yana yazmak demektir.
        println(isim + " " + soyisim) //Bunun çıktısı ise ecem kurt şeklinde olur.

        val deger1 = "15"
        val deger2 = "20"
        //iki değişkeni integer yerine string olarak atadığımızı düşünürsek:
        println(deger1 + deger2)// Burada beklentimiz 15+20nin sonucunu yani 35'i vermesidir ama bundeğişkenleri string olarak atadık ve yazdırdığımızda iki string ifadeyi yan yana yazdırdığını yani 1520 sonucunu görürüz.
        //bu şekilde olmaması için atadığımız değişken değerlerini dönüştürebileceğimiz
        //yani birbiri arasında geçiş yapabileceğimiz fonksiyonlar kullanırız.


        //deger1.toInt()  // string değişkenini integera çevirdik
        println(deger1.toInt()*20) // string veri tipinde olan deger1 değişkenini integera çevir ve 20 ile çarp ekrana yaz.

        //CONVERSION
        val deger2Int = deger2.toInt() // bu şekilde de dönüşüm yapabiliriz.

        //tabi bu çevirme işlemi mantıklı olduğu takdirde çalışır.
        // örneğin val degisken = "on beş" şeklinde atanmış bir değişkeni integera çeviremeyiz.

        val stringDegiskenim : String //Bir değişken oluşturup veri tipini belirleyebilirz. Değer atamasını daha sonra yapabiliriz.
        stringDegiskenim = "string değişkenim" //sonradan atamak istersek, belirli hesaplamalar yaptıktan sonra atamak, değerini kullanıcıdan almak, veri tabanından çekmek durumlarında sonradan atayabiliriz.
        //tabi değeri atanmadan bir metod kullanamayız.
















    }
}