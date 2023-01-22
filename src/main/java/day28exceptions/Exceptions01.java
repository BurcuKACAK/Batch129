package day28exceptions;
//Exceptions = Umulmadik Problem
//Handle= Bir isi ele alip cozmek(Ustesinden gelmek)
public class Exceptions01 {

    /*
    1)Exception demek beklenmedik problem demektir. Seyahatte benzinin bitmesi, arabani bozulmasi gibi...
    2)Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince Yol Yardimï arariz.
        Application'larda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir.
    3)Exception'lar temel olarak ikiye ayrilirlar.
            i) Compile Time Exception: Siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
            ii) Run Time Exception: Siz code yazarken farkedilmez ama code'u calistirdiginizda console'da hata alirsiniz
    4)Exception'lar disinda "Error"diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
      Gercek hayatta soforun olmesi gibi, handle edilemeyecek durumlar "Error"dur.
      Application'larda "Memory"nin dolmasi "Error"dur.
      Iki tur memory var  i)Stac Memory dolarsa "StackOverFlow Error" alirsiniz.
                          iiHeap Memory dolarsa "OutOfMemory Error" alirsiniz.
    5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
    6) if else kullanirsak olusabilecek her problemi spesifik olarak  if parantezinin icine yazmamiz gerekir.
        Bu da ciddi bir matematik bilgiz gerektirir, ve yazacagimiz kodu cok uzatir.
        Ama try Catch'te Java ile ilgili Exception ile alakali olusabilecek butun problemleri yakalar.
    7

     */
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

       divide(a,b);
        divide2(a,b);
    }

    // Arithmetic Exception yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception 'dir
    // Nasil handle edilecegini asagida yazdik.
    public static void divide(int a , int b){
        try {
            System.out.println(a/b);//Handle etmezsek burda Java vefat eder.
            System.out.println("I am here");
        } catch (ArithmeticException e){//Bunun sayesinde application durmuyor devam ediyor
            System.out.println("Do not divide by zero");
        }
        System.out.println("You are here");

    }
    //"Exception Handlin"de if - else kullanilmaz. Bakiniz 6.Note
    public static void divide2 (int a, int b){

        if (b==0){  //if else yaparsak bu hatayi biliyor olmamiz gerekiyor. Ama try catch 'de bizim bilmedigimiz bir problem varsa onu da handle eder
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }

    }
}
//Exception olustugunda Java calismayi durdurur
//Yazdiginiz kod calismadiginda ne yaparsiniz?//Interview Sorusu
//"Log"lara bakariz

   /*
        Interview Sorusu==> Why we use try-catch instead of useing if-else ?
        if else kullanirsak olusacak her problemi spesifik olarak tum ihtimalleri gozetmemiz gerekir.
        Ama try catch'te boyle bir seye gerek yok. Try Catch'te ne hatasi olursa olsun her exception'i yakalar.

    */
