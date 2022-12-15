package day02datatypemethodcreation;

public class Variables02 {
    /*
    Non-Primitive Data Types: String bir non-primitive data type'dir Non-Primitiveler sinirsizdir.
                              Uretilen her bir class ayni zamanda bir Non-Primitive Data Type dir.
                              Bu yuzden Non-Primitive Data Type'lar sinirsiz sayidadir denilebilir.
                              Non-Primitive Data Type'larin isimleri Buyuk Harfle baslar.
                              Non-Primitive Data Type'larin tamamami icin Java Memory'de ayni miktarda yer ayirir.

     Interview Sorusu: Primitive ve Non-Primitive DataTipleri arasindaki fark nedir?
        1-"Primitiv"ler sadece bizim atadigimiz degeri icerir
          "Non-Primitiv"ler bizim atadigimiz deger ve yaninda method'lar icerir.
        2-"Primitiv"ler kucuk harfle baslar  "Non-Primitiv"ler buyuk harfle baslar.
        3- "Primitiv"leri Java uretmistir 8 tanedir.
           "Non-Primitiv"leri Java ve Developerlar uretebilir sinirsizdir
        4-"Primitiv"ler Memory de Data Type ine gore yer kaplar
            "Non-Primitiv"ler icin Java Memory'de hep ayni buyuklukte yer ayirir.
     */
    public static void main(String[] args) {

        //Orn1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.

        String cityName = "Ankara";
        System.out.println(cityName);
    }


}
