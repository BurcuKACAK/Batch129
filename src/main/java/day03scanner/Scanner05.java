package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==>Kisa Kenar*Uzun Kenar
        //ii)Cevresiniz hesaplayiniz==>2*Kisa Kenar + 2*Uzun Kenar


        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin Kisa Kenar Uzunlugunu Giriniz:");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin Uzun Kenar Uzunlugunu Giriniz:");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + shortSide*longSide);
        System.out.println("Cevre = " + 2*shortSide+2*longSide);




    }
}
