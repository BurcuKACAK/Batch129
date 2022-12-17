package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        /*
        Kullanicinin verdigi sayi icin carpim tablosunu
        olusturup konsola yazdiran kodu olustunuz
        3==> 3*1=3  3*2=6 3*3=9 3*4=12 ...3-*10=30

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num = input.nextInt();


        int i = 1;

        while (i<11){


            System.out.println(num + "*" + i + "=" + (num*i));

            i++;
        }

        //Example 2 : Verilen bir Stringde her harfin sonrasina "*"sembolunu ekleyiniz
        //              Java ==> J*a*v*a*


        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord = "";

        int k = 0;

        while (k<word.length()){

            newWord = newWord + word.charAt(k) + "*";
            //newWord += word.charAt(k)+"*"; yazabiliriz usttekinin yerine

            k++;
        }
        System.out.println(newWord);


        }
    }

