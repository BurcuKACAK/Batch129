package practice.nighttime03;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin
        Eger gun Cuma ise "Muslumanlar Icin Kutsal Gun"
        Eger gun Cumartesi ise  "Yahudiler Icin Kutsal Gun"
        Eger gun Pazar ise  "Hristiyanlar Icin Kutsal Gun"
        yazdiran kodu olusturun
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter a Day");
        String day = input.next();

        if (day.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar Icin Kutsal Gun");
        } else if (day.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler Icin Kutsal Gun");
        } else if (day.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar Icin Kutsal Gun");
        } else{
            System.out.println("Error! Not Holy Day");
        }

    }
}
