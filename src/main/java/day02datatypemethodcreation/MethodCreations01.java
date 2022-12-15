package day02datatypemethodcreation;

public class MethodCreations01 {



        /*
        Javada method nasil olusturulur?
        1-Main Method'un disinda olusturulur. Main Method'un icinde method olusturulamaz.
        2-Acces Modifier + Return Type + Method Ismi + ()  + {}

        Olusturulan methodlar nasil kullanilir?
            1-Main Method"in icinden kullanilir.
            2-Method"un ismini yazin
            3-Islem yapacaginiz sayilari parantezin icine koyun
         */
        public static void main(String[] args) {

            int sonuc = add(30, 50);
            System.out.println(sonuc);

            long carpmaSonucu = multiply(3, 6);
            System.out.println(carpmaSonucu);

            int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
            System.out.println(ucluSonuc);
            int dikdortgenAlani = carpma(9, 8);
            System.out.println(dikdortgenAlani);

            long dikdortgenCevresi = add(9, 8);
            System.out.println((2*dikdortgenCevresi));

            double daireCevresi = daireCevreHesaplama(7);
            System.out.println(daireCevresi);

            double daireAlani = daireAlanHesaplama(7);
            System.out.println(daireAlani);

            }

            public static int add(int a,int b){
                return a+b;
            }

            protected static long multiply(int a,int b){
                return a*b;

            }
            //Orn; Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu ile toplayan methodu olusturunuz ve kullanin

        private static int firstTwoMultiplyThirdAdd(int a,int b, int c){
            return (a*b)+c;}

            //Orn2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
            //Note: Access Modifier i default yapmak icin default yazmayiniz.
            public static int carpma(int x,int y){
                return x*y;    }
            private static long add(long a, long b){
                return a + b ;  }
            public static double daireCevreHesaplama (double r){
                double piSayisi = 3.14;
                return 2*piSayisi*r;}
            private static double daireAlanHesaplama (double r){
                double piSayisi = 3.14;
                return piSayisi*r*r;}
            }
    // 1-Dikdortgenin alanini hesaplayan method olustur ve kullan
    // 2-Dikdortgenin cevresini hesaplayan method olustur ve kullan
    // 3-Dairenin cevresini hesaplayan method olustur ve kullan
    // 4-Dairenin alanini hesaplayan method olustur ve kullan











