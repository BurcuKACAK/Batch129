package day31collections;

import java.util.HashSet;

public class HashSet01 {//Bir tekniktir. Bu teknigi kullanarak Java Uniqe(benzersiz) data uretir
    public static void main(String[] args) {//IT'de set kelimesi tekrar yok demek


/*       "Hash" bir tekniktir, Java biz bu tekniği kullanarak benzersiz datalar üretir.
         "Set"  tekrarsız data depolamak icin kullanilanbir Collection'dir.
         Set tekrar kabul etmez. Yani; tekrarsız veriler için kullanılır.

         "Set"ler 3e ayrilir;
            i)HashSet: a) Super hizlidir, cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                       yani HashSet'lere eklenen elemanlar rastgele siralanirlar
                       b) HashSet'ler tekrarli elemana musaade etmez
                       c) HashSet'ler sadece 1 tane "null"i eleman olarak kabul ederler.
            ii)LinkedHashSet: a) LinkedHashSet elemanlari "insertion order" a gore dizer.//eklenme sirasi
                              b) LinkedHashSet elemanlari siralamakta zaman kaybettigi icin, HashSet'e gore yavastir.
                              c) LinkedHashSet'ler tekrarli elemana musaade etmez
            iii)TreeSet : a) Treeet elemanlari "natural order" (Kucukten buyuge veya alfabetik sira) ya gore dizer
                          b) Treeet "natural order" yaparken cok zaman harcar o yuzden en yavas "Set"dir



                */

        HashSet<Integer> hs =new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78] ==> Gordugunuz gibi elemanlar rastgele siralandi

        int hc =hs.hashCode();
        System.out.println(hc);//329



    }

}
//Collection'lar ne ise yarar?
//Collection'lar coklu eleman depolamak icindir. 6 opsiyon var
//Cok Fazla Arama yapilacaksa Array List- indeksi oldugu icin
//Cok fazla ekleme cikarma yapilacaksa LinkedList kullanilir-indeks olmadigi icin
/*
"Hash" bir tekniktir biz bu tekniği kullanarak Java benzersiz datalar üretir.
        "Set" demek tekrarsız data demektir.ArrayList ve LinkedListlerde tekrar mümkündür.
        Ancak Set tekrar kabul etmez. Yani tekrarsız veriler için kullanılır.
 */
