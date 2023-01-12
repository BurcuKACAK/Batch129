package day24accessmodifiersinheritance;

public class Animal {
    /*
        Inheritance'in faydalari; (Inheritance = Miras demek)
    1)Code standardında tekrar iyi değildir.
    2)Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
    3)Gelişime update'e açık olmalıdır.
    4)Code atomic yapıda olmalı.
    Note:   "parent class"(super class)(Ortak ozellikleri icerir)-child class(sub class)(Class'a ozel ozellikleri icerir)
    parent class'ta yalnızca ortak özellikler bulunur. Yazılan fonksiyonlar tüm child class'lar için ortak fonksiyonlar içerir.
    Spesifik özellikler child class'ta yer alır
    Note:   bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız.
    Note:   "public" method'lar child class'lar tarafindan kullanilabilir.
            "child class'lar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
    Note:   "protected" method'lar "inherit edilebilir" demektir.
             Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
    Note:   "default"method'lar object ile ayni package' olduklari surece "inherit edilebilir"
            Ama default ile object'in uretildigi class farkli package'lerde ise inherit edilemezler.
    Note:   "private" method'lar "inherit edilmezler"
    Note:   Java birden fazla parent'i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
    Note:   Child--> Parent-->Grand Parent --> Grand Grand Parent ....seklinde ilerleyen inherritance'lara "Multi Level Inheritance" denir.
    Note:   Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
    Note:   Java'da "Object Class" haric tum class'larin parent'i vardir.
    Note:   Java'da "parent"dan "child"a olan iliskilere "HAS-A Relationship" denir.
    Note:   Java'da "child"dan "parent"a olan iliskilere "IS-A Relationship" denir.
    Note:   Java'da her class'in bir tane default constructor'i vardir.
            Bu default construcytor class'in icinde gorunmez. Cunku default constructor "Object Class"icindedir
            Bizim class'imiz default constco'a ihtiyac duydugunda parent olan "Object Class"a gider ve oradaki constructor'i kullanir

     */
    protected void eat(){

        System.out.println("Animals eat...");
    }

    public void drink() {
    System.out.println("Animals drink...");

        }
}
