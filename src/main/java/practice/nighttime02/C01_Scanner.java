package practice.nighttime02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        /*
        TechProEd spor salonu icin kullanicidan isim, soyisim, yas, kilo, boy, salona devam edecegi ay suresi bilgilerini
        alip aylik 20$ olarak toplam ucreti yazdiriniz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("...TechProEd Spor Salonuna Hosgeldiniz...");

        System.out.println("Lutfen Adinizi Soyadiniz Giriniz:");
        String tamIsim = input.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz:");
        byte yas = input.nextByte();

        System.out.println("Lutfen Kilonuzu Giriniz:");
        double kilo = input.nextDouble();

        System.out.println("Lutfen Boyunuzu Giriniz:");
        double boy = input.nextDouble();

        int aylikUcret = 20;
        System.out.println("Aylik Ucret = " +aylikUcret +"$");

        System.out.println("Lutfen Uyelik Suresini Giriniz: ");
        int aylik = input.nextInt();

        int toplamTutar = aylikUcret*aylik;
        System.out.println("Odemeniz Gereken Toplam Tutar =" + toplamTutar+"$");

        System.out.println("AD SOYAD:" +tamIsim +"\nYAS: " +yas+ "\nKILO: " + kilo+ "\nBOY:"+ boy+ "\nAYLIK UCRET:" +
                aylikUcret+ "\nDEVAM EDECEGI SURE:"+ aylik+"\nODEMENIZ GEREKEN TOPLAM TUTAR:"+ toplamTutar+"$");

        }



    }

