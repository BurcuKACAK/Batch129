package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Ex 1: Verilen karakter buyuk harf ise ekrana "Buyuk Harf"yaziran kucuk harf ise "Kucuk Harf" yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz: ");
        char ch = input.next().charAt(0);
        //1.Yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf...");
        }
        if (ch >= 'a' && ch < 'z') {
            System.out.println("Kucuk Harf...");
        }

        //2.Yol
        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("Buyuk Harf...");

        } else if (ch >= 'a' && ch < 'z'){

        System.out.println("Kucuk Harf...");

        } else {

            System.out.println("Harf Degil...");

        }



    }
}
