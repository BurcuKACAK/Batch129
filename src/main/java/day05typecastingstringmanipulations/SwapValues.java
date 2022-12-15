package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek 1. kap: Patates 2.Kap:Domates ==> Swap ==> 1. kap:Domates 2.Kap: Patates

    public static void main(String[] args) {

        int a = 12;
        int b = 5;// Swapten sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        //1. YOL
        //1.adim
        temp = a;

        //2.adim
        a=b;

        //3. adim
        b=temp;

        System.out.println("a:" + a);//5
        System.out.println("b:" + b);//12

        //2.YOL

        int x = 12;
        int y = 5;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x:" + x);
        System.out.println("y:" + y);



    }

}
