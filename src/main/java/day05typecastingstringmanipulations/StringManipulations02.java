package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ex 1) "s" String'inin "money"ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith(" ");
        System.out.println(isEnd);

        //Ex 2) "s" String'indeki "money"kelimesini "dollar"kelimesine ceviriniz

        String newS1 = s.replace("money", "dollar");
        System.out.println(newS1);

        //Ex 3) "s" String'indeki "earn" kelimesini "win"kelimesine ceviriniz
        //Note; replace tum kelimeleri cevirir

        String s2 = s.replace("earn", "win");
        System.out.println(s2);

        //Ex 3) "s" String'indeki "a" harfini "*"a ceviriniz
        // replace() metodunda coklu karakter ile calisirsaniz mecbur cift tirnak kullanacaksini
        // ama tek karakter ile calisirsaniz cift veya tek tirnak kullanabilirsiniz
        // ama ya ikisi de cift tirnak olmalidir ya da ikisi de tek tirnak olmalidir
        String s3 = s.replace("a", "*");
        System.out.println(s3);

        //Ex 3) "s" String'indeki "n" harfini "XXX"a ceviriniz

        String s4 = s.replace("n", "XXX");
        System.out.println(s4);

        //Ex 3) "s" String'indeki tum "e" harflerini siliniz
        // "hicbir sey" char data tipindeyok bu yuzden replace() metodu kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz
        String  s5 = s.replace("e", "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";

        //Ex 7) "t" Stringindeki tum rakamlari(0,1,2,3,4,5,6,7,8,9) "*"ceviriniz
        //Not: Bir grup datayi degistimek icin replacaAll() kullanilir.
        //Not: Bir grup datayi ifade etmek icin "Regular Expressions"(Regex) kullaniriz.Orn: [0-9], [a-z], [A-Z]

        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
                Meshur Regex'ler
        1)Tum rakamlari kastediyorsaniz ==> [0-9]
        2) Tum kucuk harfleri kastediyorsaniz ==> [a-z]
        3) Tum buyuk harfleri kastediyorsaniz ==> [A-Z]
        4)Tum kucuk harfler ve buyuk harfleri kastediyorsaniz ==> [a-zA-Z]
        5) Tum harf ve rakamlar ==> [a-zA-Z0-9]
        6 Tum noklama isaretleri ==> \\p{Punct}
        7 Tum sesli harfler ==> [aeiouAEIOU]
            x,q,w harfleri ==>[xqw]
        8) Kucuk harflerden farkli tum karakterler ==> [^a-z]
        9) Tum harflerden farkli tum karakterler ==> [^a-zA-Z]
        10) Space disindaki tum karakterler ==>\\S
         */
        //Ex 8) "t" Stringindeki tum rakamlari ve harfleri  "!"ceviriniz

        String t2 =t.replaceAll("[a-zA-A0-9]", "!");
        System.out.println(t2);

        //Ex 9) "t" Stringindeki tum sesli harfleri "?"ceviriniz

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //Ex 10) "t" Stringindeki kucuk harfler disindaki tum karakteleri "<>"ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Ex 11) "t" Stringindeki tum harfler disindaki tum karakteleri "+"ceviriniz
        String  t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Ex 12) "t" Stringindeki "spaceler" disindaki tum karakteleri "+"ceviriniz
        String  t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);

        //Ex 13) "t" Stringindeki "sesli harfler" disindaki tum karakteleri "&"ceviriniz
        String  t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


    }
}
