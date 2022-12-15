package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Ex1) Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
                1) En az 8 karakter olsun
                2) Space olmasin
                3) En az bir tane buyuk harf olsun
                4) En az bir tane kucuk harf olsun
                5) En az bir tane sembol olsun
                6) En az bir tane rakam olsun

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Password Giriniz:");
        String password = input.nextLine();

        //1) En az 8 karakter olsun
            boolean first = password.length()>7;

        //2) Space olmasin

            boolean second =!password.contains(" ");

        //3) En az bir tane buyuk harf olsun
        //Note; Buyuk harf olmayanlari sil,
        //      Kalan karakter sayisina bak
        //      Karakter sayisi sifir ise buyuk harf yok demektir
        //      Sifirdan buyuk ise buyuk harf var demektir

            boolean third = password.replaceAll("[^A-Z]", "").length()>0;


        //4) En az bir tane kucuk harf olsun

            boolean fourth =password.replaceAll("[^a-z]", "").length()>0;


        //5) En az bir tane sembol olsun

            boolean fifth = password.replaceAll("[a-zA-Z0-9]", "").length()>0;


        //6) En az bir tane rakam olsun

        boolean sixth = password.replaceAll("[^0-9]","").length()>0;


        System.out.println("Password gecerli mi?"+(fifth && second && third && fourth && fifth && sixth));


    }
}
