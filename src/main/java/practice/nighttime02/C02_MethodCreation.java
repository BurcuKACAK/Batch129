package practice.nighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan kodu yaziniz]

        System.out.println("Dikdortgen Alani="+dikdortgenAlani(10, 5));
        System.out.println("Dikdortgen Cevresi="+dikdortgenCevresi(12, 45));
        kareninAlani(25);
    }
//      Access Modifier       static  datatype    method ismi(parametreler)
          public              static    int       dikdortgenAlani (int a, int b){
             return a*b;//carpmanin sonucunu kullaniciya verdik

    }
        //Dikdortgenin cevresini hesaplayiniz
        public static int dikdortgenCevresi(int a , int b){
                return 2*(a+b);
        }

        //Karenin alanini hesaplatan kodu yaziniz
        public static void kareninAlani(int a){
        System.out.println("Karenin Alani=" + a*a );
    }


    }


