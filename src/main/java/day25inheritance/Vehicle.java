package day25inheritance;

public class Vehicle {

    /*
           1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
           parent class'dan baslatilarak alta dogru calistirilirlar.
           2)Child Class'taki constructor'dan Parent Class'taki constructor'a gidebilmek icin "super()"kullanilir.
           3)Parent Class'da birden fazla Constructor varsa istenilen Constructor,  "super()" ifadesinin parantezi icine yazilan
           parametreler yardimi ile secilebilir.
           4) Ayni Class icindeki bu constructor'lari secmek icin "this()"kullanilir.
              Ayni Class'da birden fazla Constructor varsa istenilen Constructor,  "this()" ifadesinin parantezi icine yazilan
           parametreler yardimi ile secilebilir.
           5)"super()"ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()"varmis gibi davranir.
            Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
           6) "super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
           7)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6. kural...
           8)Inheritance'da Variable'lari ve method'lari cagirmak icin "this" veya "super" kullanilir.
             "this" ayni class icindeki variable'lari ve method'lari cagirmak icin kullanilir
             "this" parent class icindeki variable'lari ve method'lari cagirmak icin kullanilir
           9) Inheritance'da object kullanarak variable cagirirsaniz, object'in data taype'ini temsil eden class'dan
           variable'i aramaya baslayiniz. O class'da yoksa parent'lara bakilir
           10)  Inheritance'da object kullanarak method cagirirsaniz, object'in constructor'ini temsil eden class'dan
           method'u aramaya baslayiniz. O class'da yoksa parent'lara bakilir

           OOP Pricipals:
           i)Inheritance +
           ii)Polymorphism: Method Overloading + Method Overriding
           iii)Encapsulation -
           iv)Abstraction -
     */

           //Paratezli olunca constructor cagiriyor parantezsiz olunca variable cagirir

           //Method cagirirken costructor'lara bakicaz
           //Variable cagirirken data type'ine bakicaz

           /*
           9) Method cagirirken constructora bakilir.
              Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
           10) Variable cagirirken data type'a bakilir.
             Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.
     */




        public int price = 12000;
        public void engine(){
            System.out.println("Vehicle engine..");
        }

    public Vehicle(){
        System.out.println("Vehicle 1");
    }

        public Vehicle(int price){
            super();
            System.out.println("Vehicle 2 : " +price);
}
}
