package day06stringmaipulationsifstatements;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Ex 1: Bir String'in bas ve sonunda "space" karateri varsa siliniz.

        String s = "  Ali Can   ";
        System.out.println(s);

        //trim() methodu bir String'in bas ve sonundaki space karaktelerini siler aradaki spacelere dokunmaz.

        String sTrimmed =s.trim();
        System.out.println(sTrimmed);

        //Ex 2:Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //      String tv = "$456.99";String laptop = "$875.99"; ==>456.99+875.99= 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$" , "");
        System.out.println(tv2);//Ondalik sayilar Java'da otomatik olarak double kabul edilir

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Ex 3 : Verilen ismin ilk isminin ilk harfini ve Soyisminin ilk harfini ekrana yazdiriniz
        //      "Ali Can"==> AC

        String name ="   ali cAN  ";
        char first = name.trim() .toUpperCase() . charAt(0);
        System.out.println(first);

        char second = name.trim() . toUpperCase() . split(" ")[1]. charAt(0);
        System.out.println(second);

        System.out.println(""+first+second);

        //Ex 4 : Bir stringin hic karakter icermedigini(bos String) kontrol eden kodu yaziniz

        String  str = "";
        //1. Yol: lenght() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu?" + result1);

        //2.Yol: is.Empyt() kullan. Java bir konuda method uretmisse, o methodu kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu?" + result2);

        //Ex 5 : Bir Stringin space haric hicbir karakte icermedigini kontrol eden kodu yaziniz

        String t = "   x    ";

        //1. Yol

        boolean result3 = t.replace(" ", ""). length()==0;
        System.out.println("Sadece space mi var?" + result3);

        //2. Yol

        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var?" +result4);

        //3. Yol
        //isBlank() metodu sadece space iceren Stringler icin true veri, space disinda bir karakter icerirse false verir
        //isBlank() ==> space+ hicbir sey icin true     isEmpty==> hicbirsy icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" +result5);

        //Ex6: Bir Stringte a,e,i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);
        int idxI = r.indexOf('i');
        System.out.println(idxI);
        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println("Total Idx:" + (idxA+idxI+idxE));

        // Ex 7: Bir Stringte "Java" kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz
        //      "Ah Java vah Java sensiz olmuyor Java"

        String u = "Ah Java vah Java sensiz olmuyor Java";
        //indexOf("Java") kullaniminda siz "Java"kelimesinin ilk gorunumundeki ilk harfin(yani J nin) indexini almis olursunuz

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        // indexOf() metodu olmayan karakterler icin kullanilirsa her zaman -1 verir.
        int idxOfxyz = u.indexOf("xyz");
        System.out.println(idxOfxyz);

        //Ex8: Bir Stringte a,i,e karakterlerinin "son'gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //       "Java is easy to learn" ==>40

        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxE);

        System.out.println("Total Idx="+ (idxOfA+idxOfI+idxOfE));

        //  //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir


        // Ex: Bir Stringteki tekrarsiz karakterleri ekrana yazdiriniz(INTERVIEW SORUSU!!!)
        //      abbcccdc ==> ad

        String y = "aac";
        char ch = y.charAt(0);
        if(y.indexOf(ch)==y.lastIndexOf(ch)){
            System.out.println(ch);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note : Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //       Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullamilir.
        // If you study hard you will lean Java

        // Exam 10; Sayi pozitif ise ekrana pozitif yazdiriniz.
        int num = 12;
        if(num>0){
            System.out.println("Pozitif");
        }

        //Ex 11: Sayi -1 ile 10 arasinda ise ekrana rakam yazdiriniz
        int number = 30;
        if(number>-1 && number<10){
            System.out.println("Rakam");

        }

        //Ex 12: Sayi 3 basamakli ise "Wooow!" yazdiriniz
        int n = -123;

        n = Math.abs(n);

        if (n>99 && n<1000){
            System.out.println("Wooow!");

        }














    }
}


