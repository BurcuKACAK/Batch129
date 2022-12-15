package day04asciiwrapperclassoperatorsmemoyusage;

public class AsciiValues {
    //Note: Javada her karakterin sayisal bir degeri vardir.
    // Bu degerler ASCII degerler olarak adlandirilir.
    // Bu degerlerin tamaminin bulundugu tabloya "ASCII Table"denir.


    public static void main(String[] args) {

        //Herhangi bir degerin ASCII degerini bulmak icin o karakteri int data tipinde bir variable in icine koyunuz

        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        //Javada char'lari matematiksel islemlerde kullanirsaniz Java o char'larin ASCII degerlerini kullanir.
        System.out.println(c1+c2);
    }
}
