package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive bir data tipidir ve ayni zamanda bi classtir

    public static void main(String[] args) {

        String s = "Java is easy";

        //Ex 1 : "s" String'indeki tum karaterleri buyuk harf yapiniz.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Ex 2 : "s" String'indeki tum karaterleri kucuk harf yapiniz.

        String sLower =  s.toLowerCase();
        System.out.println(sLower);

        //Ex 3 : "s" String'indeki ilk karaterleri aliniz.

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Ex 4 : "s" String'indeki ikinci ve sondan ikinci karaterleri aliniz ve ekrana yanyana yazdiriniz.

        char secondChar = s.charAt(1);
        char secondLast = s.charAt(10);
        //1.Yol Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLast);
        //2.Yol Ayni satirda yazdirmak icin
        System.out.println("" +secondChar + secondLast);

        //Ex 5 : "s" String'inde kullanilan karakter sayisini bulunuz.

        int sLenght =  s.length();
        System.out.println(sLenght);//12

        //Note: Indeksler 0dan baslar . Sayma sayilari 1den baslar.

        //Ex 6 : "s" String'indeki ilk dort karakteri aliniz.

        //substringde(0,4)==> "0" yani ilk index dahil, "4"yani ikinci index harictir.(0,4)
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Ex 7 : "s" String'indeki "is"kelimesini aliniz.

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Ex 8 : "s" String'indeki "easy" kelimesini aliniz.

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

       //Bir karakteden baslayip String in sonuna kadar almak istersenizikinci index yazmayiniz
        // s.substring(8,12); yerine s.substring(8); yaziniz
        String sub4 =  s.substring(8);
        System.out.println(sub4);

        //Ex 9 : "s" String'inde "money" kelimesinin olup olmadigini kontrol ediniz

       //Contains metodu istediginiz sayida kelimenin olup olmadigina bakar
        Boolean isExist = s.contains(" ");
        System.out.println(isExist);
        /*
        Bir metodu ogrenirken 3 seyi mutlaka ogrenmeliyiz;
        1)Bu metod ne ise yarar?
        2)Bu metodun farkli kullanimlari nasildir?
        3)Bu metod size ne return eder?

         */

        //Ex 10 : "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ex 8 : "s" String'inin 6. karakterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);


    }
}
