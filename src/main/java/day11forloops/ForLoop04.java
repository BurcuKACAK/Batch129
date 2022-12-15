package day11forloops;

public class ForLoop04 {

    public static void main(String[] args) {

        //INTERVIEW SORUSU = Example 1: 5'ten 8'e kadar tamsayilarin toplamini veren kodu yaziniz
        //      5+6+7+8==>26
        int sum = 0;
        for (int i = 5; i <9 ; i++) {
            sum += i; }
            System.out.println("Toplam = " +sum);

        //Example 2 : 7'den 9'a kadar tamsayilarin carpimini veren kodu yazdiriniz
        //7*8*9==>504

        int multiply = 1;
        for (int i =7; i <10 ; i++) {
            multiply*=i;        }

        System.out.println(multiply);//504



    }
}
