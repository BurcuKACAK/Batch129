package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olustudugunuzda, deger atamazsanizo variable'i "initialize" etmediniz demektir.
    //static variable'lar static block'lar icinde initialize edilirse o class'in icinde herseyden once hazi hale getirilmis olur.
    //Bazen main method calistirilmadan once variable'larin hazir hale getirilmesi gerekir. Bu yuzden static block'lar kullanilir.

    //Note 1:"static block"lar static variable'lari initalize etmek icin kullanilirlar.
    //Note 1:"static block"lar class icinde "herseyden once" calistirilirlar.

    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }
    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");

    }



}
