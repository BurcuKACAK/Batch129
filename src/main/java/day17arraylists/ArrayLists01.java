package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
            1)ArrayList(List)'ler coklu data depolamak icin kullanilir.
            2)ArrayList(List)'ler non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
             List ler "non-primitive" data kabul ederler, "Array"ler ise "primitive"data vya reference kabul eder.
            3)ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
             List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flrexible" degildirler.
            4) Madem "Array"ler eleman sayisinda flexible degil nicin Java "Array"leri iptal etmedi?
                i)Eleman sayisi belli olan datalari depolamak icin "Array"ler tercih edilir.
                ii)Array'ler cok hizli (superfast) calisir.
                iii)Array'ler memory'de cok az yer kaplar.

         */

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);//[]

        //List'lere eleman nasil eklenir?
        //List'e eleman eklemek icin add() methodunu kullaniriz.
        //add() method'u elemanlari sizin verdiginiz sirada "list"e ekler.(Insertion order)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);

        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //Bir list'e coklu eleman eklemek icin o elemanlari once bir List'in icine koymalisiniz.
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Bir List'teki tum elemanlari nasil silebilirim?
        //toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullanimini azaltabiliriz
        //toClear() medodu: Bir List'teki tum elemanlari siler.
        //ages.clear();
       // System.out.println(ages);

        //Bir elemanin List'te var olup olmadigini nasil kontrol ederiz?
        boolean r =  ages.contains(656);
        System.out.println(r);//true

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki List'in esit olabilmesi icin ayni index'te ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s= names1.equals(names2);
        System.out.println(s);//false

        //equals() methodu: Bir List'in baska bir List 'le ayni olup olmadigini kontrol eder. Boolean dondurur.
//                  iki List'in esit olmasi icin ayni index te ayni eleman olmalidir.

        //Example 1: Verilen iki Integer list'te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);






    }

}
























