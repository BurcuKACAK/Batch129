package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {

        /*
        Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Note1: Bir method'da 1den fazla Varargs Parametre kullanilamaz. Cunku ikincisi "Unreachable Code" olur
        Note2: Varargs, varargs disindaki parametrelerle kullanilabilir ama Varargs her zaman "son parametre" olmalidir
         */
        addTwoNumbers(3, 5);
        addThreeNumbers(4,7,2);
        add(4, 5, 6, 7, 8, 9, 1);
        //Method olusturma main method un disinda cagirma main method un icinde

    }

    //Iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a, int b) {

        System.out.println(a+b);

}

    //Uc Sayiyi toplayan method olusturuyoruz
    public static void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);

    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    //...3 noktayi gorunce varargs oldugunu anlariz
    // 3 nokta Data tipinin hemen sonrasi veya ismin oncesine konur
    // varargs array gibi çalışır ama array değildir

    //Varargslar dipsiz kuyu gibidir. Ilk parametre asla dolmayacagi icin ikinci varargs yanina yazilamaz.
    //Eger yanina yazilirsa buna "Unused Code" veya "Unreachable Code" denir ve her zaman hata verir.

    public static void add(int...a){
        int sum = 0;

        for (int w : a) {
            sum+= w;
        }
        System.out.println(sum);

    }


























}
