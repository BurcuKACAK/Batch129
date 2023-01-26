package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        //LinkedHashSet olusturma

        //"Set" demek tekrarsiz data depolamak icin kullanilan bir Collection'dir.
        //Set tekrar kabul etmez. Yani; tekrarsiz veriler için kullanılır.

        LinkedHashSet<String> artist =new LinkedHashSet();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        artist.add("Tom");
        System.out.println(artist);//[Ajda, Tom, Brad, Angelina]==Burda gorulen Tom en son gorulen Tom'dur.
        //"Set"ler tekrarsiz eleman icerirler
        // Siz ayni elemani tekrar tekrar eklerseniz Java hata vermez ama tekrarli eklenen elemani "Set"e sadece bir kere koyar
        // Buna ower write denir

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);//[Tom, Brad]

        artist.retainAll(actress);//Ortak olanlari al
        System.out.println(artist);


    }
}

