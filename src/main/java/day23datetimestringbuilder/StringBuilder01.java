package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
    Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
    "String Class" kullanarak urettiginiz String'ler "Immtable"(Degistirilemez) dir.
    "StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirilebilir) dir.
     */

    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        String t = s +"!";
        String w = t+ "?";


        //String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz ola container'lari siler.

        String a = "Money";
        a = a + " More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1. Yolu:
        StringBuilder sb1= new StringBuilder("Phyton");
        System.out.println(sb1);//Phyton

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Phyton!?.

        //StringBuilder kullanarak String uretmenin 2. Yolu:

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0

        //StringBuilder kullandiginizda baslangic kapasitesi 16'dir.
        // Kapasite asildiginda varolan kapasitenin iki fazlasi kadar varolan kapasiyete ekleme yapilir,
        //16==> 16*2+2      -       34==>34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16


        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2


        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 34*2+2

        //StringBuilder kullanarak String uretmenin 3. Yolu:
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        //append'i gorunce akliniza concat gelsin
        //ofset ilk 2 karakteri es gec araya istedigini insert et
        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        sb3.insert(2,"XXXXXX");
        System.out.println(sb3.length());//9
        System.out.println(sb3);//FlXXXXXXo

        //toString methodu String builder'i String'e cevirir
        //String Class'ta var olan ama String builder class'ta var olmayan split() methot gibi
        //method'lara ihtiyac duydugumuzda toString() methodunu kullanarak String class'a gecer ve o methodlari kullaniriz
        sb3.toString().split("l");

        //String'i tekrar StringBuilder'a cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse() method'u String'leri ters cevirir.
        sb3.reverse();
        System.out.println(sb3);//oXXXXXXlF

        sb3.deleteCharAt(1);// indeks 1'deki karakteri sil//deleteCharAt(); istenen indexteki characteri siler
        System.out.println(sb3);

        //delete(1,6); index 1 deki karakter'den index 5(6 dahil olmadigi icin 5 yazdim)  deki
        // karakter e kadar tum karakterleri siler.
        sb3.delete(1,6);
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //(sb5.compareTo(sb6) method'u sb5 ile sb6'yi alfabetik siralama olarak karsilastirir
        //sb5 alfabetik siralamada once ise sonuc nagtif olr, sonra ise sonuc pozitif olur.
        System.out.println(sb5.compareTo(sb6));//1

        //setCharAt(2, 'm'); index 2 deki karakteri 'm' ye cevirir
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza

        // Stringbuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class methodlari vardir,
        //Bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez.

        String s7 = sb6.substring(1, 3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza








    }

}
