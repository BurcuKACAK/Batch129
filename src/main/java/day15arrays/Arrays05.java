package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Example 1: String array elemanlarini uzunluklarina gore kucukten buyuge siralayiniz
        //              ["Michael", "Ajda" ,"Thomas" , "Tom"]==> ["Tom", "Ajda", "Thomas", "Michael"]

        String arr[] = {"Michael", "Ajda" ,"Thomas" , "Tom"};
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //Example 1: String array elemanlarini uzunluklarina gore buyukten kucuge siralayiniz
        //              ["Michael", "Ajda" ,"Thomas" , "Tom"]==> ["Tom", "Ajda", "Thomas", "Michael"]
        String brr[] = {"Michael", "Ajda" ,"Thomas" , "Tom"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3 : String Array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz
        //              Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz.
        //              ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas","Tom", "Ali", "Cin", "Cuneyt","Cem"]
        //            [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

           String crr[] = { "Michael", "Ajda", "Reyhane", "Gabriel", "Thomas","Tom", "Ali", "Cin", "Cuneyt","Cem" };
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        /*
        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
System.out.println(Arrays.toString(arr));

Arrays.sort(arr, Comparator.comparingInt(String::length));

//burdaki arr comparator'u sort kismindan cektik
//yukardaki kodun son kisminda ise string'e gir lenght'ini al dedik
//::==> bunun anlami "method referance" yani bir metodu kullan
//::==>bununla birlikte farkli methodlarda kullanabiliriz
//:: ==> kutuphanenin kapisini aciyor
//karakter sayilarina gore siralayacagimiz icin comparator.int kullandik
//comparator ==> karsilastir demek
         */
    }
}
