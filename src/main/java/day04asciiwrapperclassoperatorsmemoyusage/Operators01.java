package day04asciiwrapperclassoperatorsmemoyusage;

public class Operators01 {
    /*
    1)+,/,*,/ islemleri Javada matematikte kullanildigi gibi kullanilir.
    Note 1: int/int==> int olur.
    Note 2: double/ int ==> double olur. Cunku Javada matematiksel islemlerde farkli data tipleri kullanilirsa sonuc buyuk data tipinde olur.

    2) Javada "logical operator"lar vardir. mantik operatorleri
        AND ve Or islemleri "logical operatorlerdir.
        2)Java'da "logical operator" lar vardır.
            AND ve OR işlemleri "logical operator" lardır.
        a)AND işleminden true alabilmek için her şey true olmalıdır.
        AND işlemi "perfectionist" tir.
        AND işleminde bir tane false sonucu false yapar.

        b)OR isleminde bir tane true sonucu true yapmaya yeter
        OR isleminde sonucun false olmasi icin hersey false olmalidir
        OR islemi "Polyanna"gibir.

        c) NOT operatoru(!) true olani false false olani true yapar.
            !true = false
            !false = true
            !!true = true
     3)Comparison (Karsilastirma) operators;
        <,>,<=,>=, ==,!=
        Note; Karsilastirma operatorleini kullandiginizda kesinlikle boolean(true veya false) alirsiniz
        Note; Biz AND islemi icin && kullaniriz ama & kullanim da gecerlidir
        Farklari nedir?
        "&&" kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir
        "&" kullanimda ilk iifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
         Bu yuzden biz hep "&&" kullaniriz.



     */

    public static void main(String[] args) {


        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;

        System.out.println(third);
        System.out.println(first+" - " + second);
        System.out.println(first&&second);
        System.out.println(first || second || third);




    }
}
