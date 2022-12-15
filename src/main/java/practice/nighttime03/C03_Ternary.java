package practice.nighttime03;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {
        /*
        Kullanicidan sifirdan buyuk pozitif bir tmsayi girmesini isteyiniz.
        Girilen pozitif tamsayi uc basamakli ise ekrana "3 basamakli" yazidiriniz
        3 Basamakli degilse cift olup olmadigini kontrol edin
        Cift ise 3 basamakli olmayan cift sayi yazdirin
        Cift degilse 3 basamakli olmyan tek sayi yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Pozitif Bir Tam Sayi Giriniz");
        int sayi = input.nextInt();
        System.out.println("******* if ile cozumu******");
        boolean sifirdanBuyuk3Bas = sayi>99 && sayi<1000;
        boolean sifirfdanBuyuk3BasOlmayanCift = !(sifirdanBuyuk3Bas) && sayi%2 == 0;

        if (sayi>0){

            if (sifirdanBuyuk3Bas)
            {System.out.println("3 Basamakli Sayi");}

            else if (sifirfdanBuyuk3BasOlmayanCift){
                System.out.println("Uc Basamakli Olmayan Pozitif Tek Sayi");}
            else if (!sifirfdanBuyuk3BasOlmayanCift){
                System.out.println("Uc Basamakli Olmayan Pozitif Tek Sayi");}
        }else {
            System.out.println("Lutfen Pozitif Bir Tam Sayi Giriniz");
        }


        System.out.println("****** Ternary *******");

        boolean sifirdanBuyuk3BasTer = sayi>99 && sayi<1000;
        boolean sifirfdanBuyuk3BasOlmayanCiftTer = !(sifirdanBuyuk3Bas) && sayi%2 == 0;

        //sart      ?           True Action         :   False Action


    }

}
