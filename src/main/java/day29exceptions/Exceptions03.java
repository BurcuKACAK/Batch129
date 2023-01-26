package day29exceptions;

import java.io.FileInputStream;// io==> Input Output
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {
    /*
        1)FileNotFoundException ve IOException Compile Time Exception'lardir, yani code'u yazarken hata aliriz.
        2)FileNotFoundException path'in dogrulugu ve dosya'nin varligi ile ilgilidir.
          IOException tum input ve output islemleri ile ilgilidir.
        3)IOException Class, FileNotFoundException Class'in parent'idir.
        4)Istenirse FileNotFoundException yerine IOException da kullanilabilir.
        5)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException altta kullanilmalidir.
     */

    public static void main(String[] args) {

        try {
            FileInputStream fis =new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");

            int k=0;

            while ((k = fis.read()) != -1){

                System.out.print((char) k);

                       }


        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println( );

        System.out.println("Hi!");
    }
}
    /*
    Javada birbirine benzeyen 3 tane keyword vardir. Aciklayiniz. (INTERVIEW SORUSU)
        1) "final"          2) "finally"        3)"finalize"
        1) "Final" bir keyword'dur. Variable,Class ve Methodlar icin kullanilir...
        "final" keyword i)Variable'larda kullanilabilir.
    public final int age = 12;
        a)Atanan deger degistirilemez.
        b)Deger atamasi yapilmak zorundadir.
    final variable'lar isimlendirilirken büyük harfler kullanılır, isimlendirmede birden fazla kelime
        kullanılırsa kelimeler arasina "_" konulur.
        ii)Method'larda kullanilabilir.
    public final int add(){
        return a+b;
        }
        a)Bir method olusturulurken "final" olarak olusturulmus ise
        o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.
        iii)Class'larda kullanilabilir.
        Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
        Bir Class "final" ise o Class'a extend edilemez.
        "final" Class Child olabilir.
        2) "Finally" bir "code block"dur.
        "try-catch" veya sadece try ile kullanilir.
        "finally" code block icine yazilan kodlar her halukarda calistirilir.
        Mesela Database ile connection'i kesmek her halukarda yapilmasi gereken bir fiildir. Bunu finally ile yapabiliriz.
        3) "finalize" bir method'dur. Bu method Java tarafindan datalar imha edilmeden once cagrilir. bu method datalari
        imha edilecek hale getirir ve daha sonra garbage collector bu data'lari imha eder.
        "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.
        */


    /*
                    Interview sorusu : "final", "finally", "finalize" nedir?
            final(keyword): ==> final method override edilemez.
                          final variable degeri degistirilemez.
                          final class child class sahibi olamaz.
            finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.
            finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.
     */