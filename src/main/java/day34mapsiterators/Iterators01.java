package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {
        /*
        Iterators'lar looplarin yaptigi islemi yapar.
Loop --> elemani alir isleme sokar eleman bitince loop break olur.
Iterator --> elemani alir isleme sokar eleman bitince loop break olur.

    o zaman neden loop ve iterators diye ayri yapilar var ?
Loop'lar infinite loop'a girebilir. Loop infinite olursa app p0 (priority 0 [en onemli seviye]) olur. Memory dolana kadar bekler.
Iterators'da infinite soz konusu olmaz.
    Java Loop'lari eskiden olusturmustur. Iterator yeni bir yapidir. Her programlama dilinde de iterator yoktur.
         */

        /*Sonsuz Loop'lar memory dolana kadar çalışmaya devam eder. Application bu süreçte donar.
Buna Java'da "fire of the day" denir.
        /*
Iterators'lar Loop'ların yaptığı işi yapar.
Iterator's'lar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
Java'nın Iterator'ları ortaya çıkarma sebebi Infinite Loop riskini bitirmektir.
Iterator'larda sonsuz loop yoktur.
Iterator'lar Java tarafından sonradan oluşturulmuşlardır ve loop'larin yaptiklari butun islemleri yapabilirler.
Loop'lar ile Iterator'larin performance farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar

  Iki tip Iterator var;
  i)Iterator : Sadece elemanlari remove edebilirsiniz.Update etme ozelligi olmadigi icin degistirilmesini istemedigimiz datalari bu sekilde kullanabiliriz
             : Sadece sol'dan sag'a calisir yani tek yonludur
  ii)ListIterator : Elemani "remove etme" ve "update etme" ve "add" yapabilirsiniz
                   Hem sol'dan saga hem de sagdan sola calisabilir yani cift yonludur
         */

        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");

        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()){
             itr1.next();
             itr1.remove();
        }
        System.out.println(list1);//[]


        //ListIterator
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);


        ListIterator<String> listItr = list2.listIterator();

        while ((listItr.hasNext())){

            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]


        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr2 = list3.listIterator();

        //Asagidaki loop "pointer"i en saga almak icin yazildi.
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //Asagidaki loop elemanlari en sondan en basa dogru yazdirmak icin yazildi
        while (listItr2.hasPrevious()){

            String  el = listItr2.previous();
            System.out.println(el+"<==");
        }
    }
}
