package practice.nighttime03;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile isleme koyup yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\nToplama Yapmak Icin 1,\nCikarma Yapmak Icin 2, \nCarpma Yapmak Icin 3, \nBolme Yapmak Icin 4, \nGiriniz.");

        int islem =input.nextInt();
        System.out.println("Lutfen Iki Tam Sayi Giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


        if (islem == 1){
            System.out.println("Toplama Isleminin Sonucu : " + num1+" + "+ num2+" = " + (num1+num2));
        } else if (islem == 2){
            System.out.println("Cikarma Isleminin Sonucu : " + num1+" - "+ num2+" = " + (num1-num2));
        } else if (islem == 3){
            System.out.println("Carpma Isleminin Sonucu : " + num1+" * "+ num2+" = " + (num1*num2));
        }else if (islem == 4){
            System.out.println("Bolme Isleminin Sonucu : " + num1+" / "+ num2+" = " + (num1/num2));
        } else {
            System.out.println("Hatali Giris Yaptiniz! Tekrar Deneyin");
        }

    }
}


