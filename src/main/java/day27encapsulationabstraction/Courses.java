package day27encapsulationabstraction;

public abstract class Courses {


        /*
        1) Bazen method body'sini yazmak gerekmez; bu durumlarda body'siz method olusturmak gerekir.
            Body'si olmayan method'lara "abstract method"lar denir
        2)"abstract method"lar child class'lar tarafindan "override" edilmek zorundadirlar.
            Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
            o method'u abstract yapmak gerekir

        3) Bir mthod'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
            "acces modifier"ile "return type" arasina "abstract"keyword koymak gerekir.

        4)  "abstract method"lar siradan class'larin(concrete) icine yazilamazlar, "abstract method"lar icine yazildiklari class'lar da
        abstract olmak zorundadir.

        5)"abstract class" larda hem "abstract method"lar hem de "concrete method" lar kullanilabilir.

        6)"concrete class" lar "abstract class" larin child'i olabilirler.
         "abstract method"larin override edilme zorunlulugu "concrete class" lar icindir.

         */


        public abstract void math();
        public void art(){
                System.out.println("Painting...");
        }

        //final method'lar override edilemezler, halbuki abstract method'lar override edilmek icin olusturulurlar.
        //Bu celiskidir, bu yuzden Java abstract method'larin final olmasina musaade etmez
        //public final abstract void science();
        //"concrete class" lar final oldugunda Child Class'a sahip olamazlar
        // ama "Abstract Class" lar Child Class olmalidir, cunku Child Class'lar abstract parent class'daki abstract method'lari kullanirlar.
        //Bu yuzden Java "Abstract Class"larin "final"olmasina musaade etmez.

        //"" abstract method"lar "private"olamazlar, cunku Child Class'lar absract method'lari kullanirlar, private yapinca kullanima kapali olur.
        //Bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musaade etmez

        //"" abstract method"lar "static" olamazlar, cunku static method'lar override edilemez,
        //halbuki abstract method'lar Override edilmek icin olusturulmustur.

        public Courses (){

        }















    /*
    --Body'si olmayan method'a Abstract Method denir.
    --Bir method Abstract ise o methodu tum child'ler kullanmak zorundadir
        ---Bir method "parent class" da "abstract method" ise;
       Child Class o method'u "override" edip kullanmak zorundadir.
      Bu yuzden herhangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.

    */
}
