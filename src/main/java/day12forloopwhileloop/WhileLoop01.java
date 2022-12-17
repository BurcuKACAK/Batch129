package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example1: 3'ten 10'a kadar tamsayilari konsola yazdiriniz

        for (int i = 3; i <11 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2.Yol While Loop

        int i = 3;
        while (i<11){

            System.out.print(i + " ");

            i++;
        }
        System.out.println();
        //Example1: 23'ten 12'ye kadar cift tamsayilari konsola yazdiriniz

        int k = 23;

        while (k>11){
            if (k %2 == 0){
                System.out.print(k + " ");
            }
            k--;

        }
        System.out.println();
        //Example 3: Verilen bir tam sayinin rakamlari toplamini konsola yazdiran kodu yaziniz

        //1. Yol: while-Loop
        int num = -578;

        num = Math.abs(num);
        int sum = 0;

        while(num>0){
            sum = sum + num%10;
            num/=10;
        }
        System.out.println(sum);

        //2. Yol : for-Loop

        int a = 6841;

        int toplam = 0;

        for (int m = a; m>0 ; m/=10) {

            toplam = toplam + m%10;
            System.out.println(toplam);



        }





    }


}
