package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*
    Numeric primiyive data tiplerinin birbirine donusturulmesine "Type Casting" denir.
    Numeric Data Type'lar byte - short - int - long - float - double

    Note 1): Kucuk data tiplerini buyuk data tiplerine cevirmeyi Java otomatik olarak yapabilir.
            Bu isleme "Autowidening"(Otomatik Genisletme) denir.
    Note 2)Buyuk data tiperini kucuk data tiplerine cevirmek riskli bir istir.
           Java bu riskli isi otomatik olarak yapmaz. Bu isi kod yazanlar yapar.
           Bu isleme "ExplicityNarrowing" (Aciktan Daraltma) denir.
     */

    public static void main(String[] args) {
        //byte data tipini int data tipine ceviriz.
        byte age = 13;
        int ageInt = age;//Autowidening
        System.out.println(ageInt);
        //long data tipini short data tipine ceviriniz
        long weight = 234;
        short weightInt = (short) weight; //Explicit Narrowing

        //int data tipini flaot data tipine ceviriniz
        int population = 700000;
        System.out.println(population);
        float populationFloat = (int) population;
        System.out.println(populationFloat);

        //double data tipini short a cevir
        double number = 12.934;
        System.out.println(number);
         short numberShort = (short) number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptiginiz sayi(260)donuseceginiz data tipinin sinirlari disinda ise Java kullandiginiz sayi ile mod islemi yapar
        // ve mod isleminin sonucu sizin yeni degeriniz olur.
        //Ex 1 )
        short num = 260;
        System.out.println(num);//260
        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Ex 2)

        short n = 1023;
        System.out.println(n);//1023
        byte nByte = (byte) n;
        System.out.println(nByte);//-1


               }


    }

