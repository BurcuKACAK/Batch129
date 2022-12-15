package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Ex 1 : Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Iki Sayi Giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1. Yol : If-else
        if(a<b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        //2.Yol Ternary
        //              Condition  ?  Conditipn true ise calisir   : Condition false ;
        double result =    a<b     ?            a                   :       b        ;
        System.out.println(result);


        }
    }
