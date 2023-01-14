package day26overriding;


/*
 1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
        2)Overriding'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
        3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar
        4)Overriding'de parent class'daki method'a "Overridden Method", child class'daki  method'a ise "Overriding Method" denir.
        5)"private" method'lar "override" edilemezler.
        6)Child Class'daki override edilmis method(Overriding Method)'un
          access modifier'i Parent Class'daki override edilmis method(Overridden Method)'un
          access modifier'indan dar olamaz
          Overridden Method ==> protected ise Overriding Method ==> protected + public
          Overridden Method ==> default ise Overriding Method ==> default + protected + public
          Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. (Bkz 5. kural)
        7)Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin aynisi veya o data type'inin
          parent'i olarak secilebilir.
        8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir ama
          primitive'ler arasinda "parent-child iliskisi" olmadigindan parent'dan secmek mevzu bahis olamaz o zaman tek secenek aynisi olmalidir kalir.
        9)Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez. Cunku; return type ya ayni olur veya parent'dan secilir,
          ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
        10)Method'un return type'i "void" ise, Overriding yaparken return type degistirilemez.

        11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez
        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

        13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" method'lar ve "static" method'lar "override"  edilemezler.
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.
     */

           // public int add(int a, int b){};==> Coklu Gorunum=Polymorphism


public class Animal {
    public void eat(){//Child'daki override edilmis eat method'una "Overridden Method"denir
        System.out.println("Animal eat");

    }
    public void drink(){
        System.out.println("Animal drink");
    }

    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }
    public Integer Multiply(int a,int b){
        return a*b;

    }
}
// override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
// Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
// Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
// Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

//primitiveler class olmadigindan Overridden'a Object de yazamayiz.
//Wrapper Class'lar Class oldugu icin Overridden'a Object yazabiliriz.

//inheritance yoksa overriding den bahsedilemez

    /*Final kelimesinin Variable'larda kullanabilirsiniz
           -->final ise
        i)Mutlaka deger atanmalidir
        ii)Ilk atanan deger degistirilemez.
        Ornek kullanimi : public final double pi = 3.14;

        final kelimesi onemli bir kelimesidir.
        final variable ve methodlar vardir.
        final keywordu 3 yerde kullanilir.
            1) variable'larda
            2) method'larda
            3) Class'larda
        final variable :
            1- Bir variable "final" ise mutlaka deger atanmalidir.
            2- ilk atanan value degistirilemez.
        final method :
            1- Bir method "final" ise methodun body'si degistirilemez. Bu yuzden final methodlar override yapilamaz.
        final Class :
            1-Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz

     */
