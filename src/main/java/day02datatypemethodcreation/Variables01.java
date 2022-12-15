package day02datatypemethodcreation;

public class Variables01 {

    //primitive data types--> char - boolean - byte - short - int - long - float- double
    //float: Virgullu sayilar (Ondalik Sayilar- Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
    //double: Virgullu sayilar (Ondalik Sayilar- Decimal Numbers) icin kullanilir. (Hucre Agirligi - 0.000000000122

    //Note: Primitive Data Typlerini Java olusturmustur biz olusturamayiz.
    //Note: Primitive Data Typleri kucuk harfle yazilir
    //NOte: Primitive Data'lar memory de farkli farkli yer kaplarlar.
    //Note: Float memory de 4 byte yer kaplar, double 8 byte yer kaplar
    //Note: Primitive Datalar iclerinde sadece sizin atadiginiz degeri barindirirlar.
    

    public static void main(String[] args) {
        // Orn 1: Gomlek ve ayakkabi fiyatlari icin 2 tane variable olus. Ekrana yazdiriniz
        //Note. Java "Decimal Numbers"i otomatik olarak "double" kabul eder.
        //Float olmasinda israr ediyorsaniz sonuna "F"veya"f"koymalisiniz.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println()ekrana yazdirir ve pointeri bir sonraki satira koyar
        //System.out.print() ekrana yazdirir ve pointeri ayni satirda tutar

        System.out.println(shirtPrice + shoesPrice );
        //Orn2: Hucre agirligi ve amip in agirligi icin 2 tane variable olusturup agirliklari farkini ekrana yazidiriniz

        double cellWeight = 0.000025;
        double amipWeight = 0.00000021;

        System.out.println(cellWeight-amipWeight); // E==>Exponent uslu sayi





        }

    }

