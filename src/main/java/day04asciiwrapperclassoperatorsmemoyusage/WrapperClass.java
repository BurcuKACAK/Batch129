package day04asciiwrapperclassoperatorsmemoyusage;

public class WrapperClass {
    public static void main(String[] args) {
        // primitivler :    char  ,   boolean , byte , short , int ,    long , float, double
        // Wrapper Class: Character - Boolean , Byte , Short , Integer, Long , Float , Double
        // Wrapper Class lar Non-Primitiv'dir. O yuzden memory de cok yer kaplarlar!!! Sart degilse kullanmayiz
        // Java Primitiv'i  Wrapper yapmaya "Autoboxing" der. Tam tersi isleme de "Unboxing" denilir.


        int n = 12;//"n" yazip "nokta"koyarsaniz hic metot goremezsiniz; cunku "primitiv"ler metot icermez
        Integer m = 12;//"m" yazip "nokta"koyarsaniz bircok metot gorursunuz; cunku "wrapper class"lar bircok metot icerir.

        byte p = 23;
        Byte r = 43;

        //Ex; short data tipinin minimum ve maksimum degerlerini kod yazarak bulunuz.


        short max = Short.MAX_VALUE;
        System.out.println(max);

        short min = Short.MIN_VALUE;
        System.out.println(min);

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Toplam="+intMin+byteMax);

        //Ex: i) Primitiv Int'i Wrapper Integer'a ceviriniz(Autoboxing)

        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        // ii) Wrapper byte i Primitive byte a cevirelim. (Unboxing)

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ex 4:Primitive Char'i Wrapper Characteré ceviriniz
        //Wrapper Boolean'i primitive boolean a ceviriniz

        char x = 'B';
        Character ilkHarf = x;
        System.out.println(ilkHarf);

        Boolean calisanMisin = false;
        boolean calisanMisinWrapper = calisanMisin;
        System.out.println(calisanMisinWrapper);

        //Ex; Size String olan verilen iki fiyatin toplamini ekrana yazdiriniz


        String shirt = "2300";
        String shoes = "5200";
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


        //Javada "+"sembolu iki sayi arasinda kullanilirsa "Toplama Islemi"olur.
        //Javada"+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "Concatenation Islemi"olur
        // Note : Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir
        // Islem onceligi kurallari: 1)Once uslu sayilar 2) Parantez ici islem yapilir 3)Carpma Bolme 4)Toplama Cikarma

        //Ex;Size String olarak verilen iki Fiyatin toplamini ekrana yazdirin
        //Note: valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.

        String tv = "$1100";
        String radio = "$3000";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);





    }
}
