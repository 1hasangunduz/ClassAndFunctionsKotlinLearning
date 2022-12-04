package com.hasangunduz.classandfunctions

class SuperHero(var name: String, var age: Int, var job: String) {
//yukarıdaki kullanım -> (Primary Constructor) demektir.
    // Kotlin icin güzel gelişme ikiside calısır kotlindeki constructor bu şekilde daha güzel calısıyor.

    private var hairColour= "red"
     fun testFunc() {
        println("Test")
    }

    //Getter
    fun getHairColour(): String{
        return this.hairColour
    }

    //Setter
    fun changerHairColour(){
        this.hairColour="Yesil"
    }

    //Access Levels - Erişebilirlik  Seviyeleri
    // private -> özel , Sadece yazdığım sınıf icerisindek kullanılır baska yerden erişim sağlayamazsın demek.
    // protected -> korunmus, Yazılan sınıf icerisind erişebilir ama aynı dosya icerisinde farklı class olusturulursa onun icinde de ulasilabilir
    // internal -> Sadece kendi modülümüz icerisinden ulasılar. Dış kütüphane eklersek ordan ulasılamayacak.
    // public -> her yerden ulasılır.


/*
    //Property

    var name = ""
    var age = 0
    var job = ""

    //Constructor
    constructor(name: String, age: Int, job: String) {
        this.name = name
        this.age = age
        this.job = job
        println("Constructor calisti.")
    }*/


}

//**** it : setOnClickListiner da ve foreachte da görülmüştü. 'it' daha küçük kod blokları içerisinde ; görünümün
//kendisine veya foreachte elemanların kendine referans vermek için kullandığımuz anahtar kelime.

//*** this : içinde bulunduğumuz yerin bir üst seviyisine referans verdiğimiz kelimedir.