package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    public static void main(String[] args) {

        /*
        sozluk yapisi map'a benzer
        solda kelime, sagda aciklamasi vardir
        soldakiler tekrarli olamaz sagda tekrar olabilir
        map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
        cat = evcil hayvan
        dog = evcil hayvan
        crocodile = timsah
        tiger = kaplan
        solda data sagda data
        map deyince sozluk akla gelsin
        sola unique lere key tekrarli olabilen sagdaki data lara value denir

        map te bir data stractir dir
        depolarken bu yapiya ihtiyac varsa map kullaniriz
        mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
        mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir
         */
        /*
        1) Map'lerde "USA = 400.000.000" seklinde data depolamamiz gerektiginde kullanilir
        2)"USA = 400.000.000"datasinin USA"kismi "key"olarak adlandirilir ve "key"ler "unique"dir
        3)"USA = 400.000.000"datasinin "400.000.000" kismi "value" olarak adlandirilir ve "value"ler "tekrarli"dir
        4)Map'lerde depoladiginiz her bir data'ya "Entry" denir, "Eleman" denmez.
        5)"Entry"ler unique'dir. Cunku "key"kisimlari unique oldugundan herbir "Entry" digerlerinden farklidir.

        6)"HashMap" cok hizlidir cunku "Hashmap"ler "entry"leri siralamak ile ugrasmazlar.
        7) "HashMap"lerde bir tane "key"i "null" yapabilirsiniz.
        8) "HashMap"lerde birden fazla tane "value"u "null" yapabilirsiniz.(Coklu null gorebilirsiniz)
        9) "HashMap"ler "multu thread" icin kullanilamaz ve "synchronization" yoktur.(Mantikli siraya koyma)

            Data structure = Data Yapisi
  */
        //HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);

        //HashMap'lere nasil entry eklenir?
        hm.put("USA" , 400000000);
        hm.put("Germany", 83000000);
        hm.put("Albenia", 3000000);
        hm.put("Albenia", 2800000);

        System.out.println(hm);//{USA=400000000, Albenia=2800000, Germany=83000000}
        //Ayni "key" i kullanarak yeni bir "entry" eklerseniz varolan "value"u degerini update etmis olursunuz.
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar" , null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Albenia=2800000, Germany=83000000}

        //HashMap'lerde sadece "key"leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, Myanmar, USA, Bhutan, Albenia, Germany]

        //HashMap'lerde sadece "value" lari almak istiyorum.
        //Example 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz
        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for (Integer w : hmValues){
            if (w!=null){
                sum = sum + w;
            }
        }
        System.out.println(sum);//503800000

        //HashMap'lerde belirli bir "key"in "value"sunu nasil alabiliriz
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//400000000

        //HashMap'lerde replace() methodu varolan bir "key"nin "value" sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Albenia=2800000, Germany=83000000}

        //HashMap'lerde putIfAbsent() methodu eger  entry varsa birsey yapmaz, yoksa yeni entry olusturur.
        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Albenia=2800000, Germany=83000000}

        hm.putIfAbsent("India" ,700000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Albenia=2800000, Germany=83000000, India=700000000}

        //Example 2: Yeni ogretmenin maasi standart ucretten 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);//{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}

        }else {salaries.putIfAbsent(teacherName, 11000);// Eger Kemal yoksa 11000 ile Kemal ile ekle
        }
        System.out.println(salaries);

        //hm.replace("USA", 400000000, 500000000) methodu key USA ve value 400000000 is value 500000000 yapar
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Albenia=2800000, Germany=83000000, India=700000000}

        //getOrDefault() olan "key"lerin degerini verir , olmayan "key"ler icin de sizin ikinci parametreye yazdiginiz degeri verir.
        // Bhutan varsa nufusunu verecek, yoksa 0 verecek
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);//35000000

        //entrySet(); methodu "Map"i "Set"e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet(); methodunu kullanarak Map'i Set'e cevirebiliriz
        //Map'i Set'e çevirdiğimizde Set'in bütün özelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet() methodunu kullandığınzda elde ettiğiniz Set'in elemanları "<Map.Entry<String,Integer>" şeklinde bir Map olur. Bu yüzden
        //elemanlar için Map methodları kullanılabilir
        Set<Map.Entry<String ,Integer>>myEntries = hm.entrySet();
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Albenia=2800000, Germany=83000000, India=700000000]

        //Example 3:Ulke ismindeki karakter sayisini ulke nufusuna ekleyen ve sonucu konsola yazdiran kodu yaziniz


        for (Map.Entry<String ,Integer >w : myEntries){

            if (w.getValue()!=null && (w.getKey()!=null)){
            int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }

        }
    }
}
