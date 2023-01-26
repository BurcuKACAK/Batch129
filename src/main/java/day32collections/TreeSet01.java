package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {


        long one =System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]
        long two =System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hts);//[3, 8, 12, 25, 32]

        System.out.println(hs);//[32, 3, 8, 25, 12]==Rastgele
        long three = System.nanoTime();

        System.out.println("TreeSet'in uygulama suresi : " + (two-one));
        System.out.println("HashSet'in uygulama suresi : " + (three-two));

        //Note : TreeSet eleman eklemede cooook yavas, Hashset ise cooook hizlidir
        ///Treeset'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler ve sonra HashSet'i TreeSet'e ceviririz
        // Elemanlari hashset ile alip bunu treeset'e atarsak Treeset'in yavasligindan kurtuluruz


        int first = ts.first();
        System.out.println(first);//3

        int last = ts.last();
        System.out.println(last);//32

        int floor1 = ts.floor(15);
        System.out.println(floor1);//12 == Treeset'teki verdiginiz degerin bir onceki degeri verir

        //floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz
        int floor2 = ts.floor(12);// 12 ==12 elemanlardan biri o yuzden 12 direkt yazdirdi

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25 elemanlardan biri degil o yuzden 15den bir sonraki elemani yazdirdi

        //floor() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25 elemanlardan biri o yuzden 25 direkt yazdirdi

        SortedSet<Integer>tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>12 elemanlardan biri o yuzden "12 ve sonraki elemanlar" bir set icinde yazdirildi

        SortedSet<Integer>tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil o yuzden "15 den sonraki elemanlar" bir set icinde yazdirildi


        NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);
        System.out.println(tailSet3);//[25, 32]==>//12 elemanlardan biri normalde  "12 ve sonraki elemanlar" bir set icinde yazdirildi
        // ama ikinci parametre'de "false"kullandigim icin 12 haric tutuldu. True olursa 12'yi de ekler

        //-dan itibaren : tailSet
        //-e kadar : headSet

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println(headSet1);//[3, 8]==>12 elemanlardan biri o yuzden "onceki elemanlar" bir set icinde yazdirildi.12 yazdirilmadi

        SortedSet<Integer> headSet2 = ts.headSet(12, true);
        System.out.println(headSet2);//[3, 8, 12]

        //Generic Method : Normal method'lar paramtrelerde belirtilen data type'lari ile calisirlar.(Tofas generic , tesla normal)
        //                 Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.
        Integer higher1 = ts.higher(12);
        System.out.println(higher1);//Her data tipi ile calisabilen method'lara generic denir

        Integer lower1 = ts.lower(12);
        System.out.println(lower1);//8 ==> 12 den bir onceki elemani verir.

            }


}
