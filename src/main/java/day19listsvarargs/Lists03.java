package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ

        */
        //Arrays.asList() ile list olusturulabilir ama listlerdeki "eleman sayisini" degitiren hicbir method bu list icin kullanilamaz
        //Dolayisiyla bu sorunun cozumunde ihtiyaciniz olan Listi "Arrays.asList()" kullanarak olusturmamalisiniz

        Scanner input = new Scanner(System.in);
        System.out.println("**** Oyunumuza Hos Geldiniz ****");
        System.out.println("Oyunu Sonlandirmak Icin Q'ya Basiniz ");
        List<String> numsList = new ArrayList<>();

        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");

        int counter = 0;
        String num = "";
        do {

            System.out.println("Lutfen 1-10 arasinda bir tamsayi giriniz ");
           // String num = input.next();

            if (num.equalsIgnoreCase("Q")){
                break;
            }
            else if (numsList.contains(num)){
                numsList.set(numsList.indexOf(num), "Bingo");
                counter++;
            } else {
                numsList.contains(num);

            }

        }while (counter!=numsList.size());
        if (!num.equals("Q")) {
            System.out.println("****KAZANDINIZ****");
        } else {
            System.out.println("Oyundan Isteyerak Ayrildiniz. Tekrar Bekleriz");
        }

        System.out.println("Final Report = " + numsList);










    }
}
