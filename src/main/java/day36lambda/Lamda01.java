package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda01 {
    public static void main(String[] args) {


        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<Double>half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT JOHN TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);//tom john cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);//TOM JOHN AJDA BRAD CUNEYT ANGELİNA
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);//AJDA ANGELİNA BRAD TOM JOHN CUNEYT
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);//CUNEYT JOHN TOM BRAD AJDA ANGELİNA
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));//[Tom, John, Ajda, Tom, Brad]
        System.out.println();
        // System.out.println(removeElementIfStartsWithAorEndsWithd(list));//[Tom, John, Tom, Cuneyt]
        System.out.println();
        System.out.println(printLengthSquare(list));//[9, 16, 16, 64, 9, 16, 36]
        System.out.println();
        System.out.println(printElementsLengthEven(list));//[John, Ajda, Angelina, Brad, Cuneyt]

        //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    }

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList){

        return myList.
                stream().
                distinct().//==> Farkli olanlari aldik
                filter(t->t>5).//==>5ten kucuk olanlari filtreledik
                map(t->t/2).//Cikan sayilarin yarisini aldik
                sorted(Comparator.reverseOrder()).//==> Buyukten kucuge siraladik
                collect(Collectors.toList()); //==> Liste koyduk

    }
    //3)Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyUpperDistinct( List<String> list){

        list.
                stream().
                distinct().//==> Tekrarsiz olanlari aldik
                map(t->t.toUpperCase()).//Stringlerde elemani degistirmek icin map() kullaniriz
                sorted().//Alfabetik Siraya Dizdik
                forEach(t-> System.out.print(t+" "));//Herbir elemani al aralarinda bosluk koyarak ayni sirada yazdir


    }
    //3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde gore tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyLowerDistinct( List<String> list){
        list.
                stream().//Lambda methodlarina ulasmak icin
                distinct().//Tekrarsiz
                map(t->t.toLowerCase()).//Kucuk Harfe Cevirdik
                sorted(Comparator.reverseOrder()).//Alfabetik Siranin Tersi
                forEach(t-> System.out.print(t+" "));//Herbir elemani al aralarinda bosluk koyarak ayni sirada yazdir
    }
    //4)Tum list elemanlarini buyuk harfle uzunluklarina gore artan siranin tekrarsiz olarak yazdiriniz

    public static void printAllSortWithLengthUpperDistinct( List<String> list){

        list.
                stream().
                distinct().//Tekrarsiz
                map(t->t.toUpperCase()).//==> Buyuk Harfi Al
                sorted(Comparator.comparing(t->t.length())).//==> Uzunluklarini karsilastirarak sirala
                forEach(t-> System.out.print(t+" "));//Herbir elemani al aralarinda bosluk koyarak ayni sirada yazdir

    }

    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1(List<String>list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                //t->t.charAt(t.length()-1 bu ifade "lambda expression" olarak adlandirilir.
                        forEach(t-> System.out.print(t + " "));
    }
    public static void printAllSortWithLastCharUpperDistinct2(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).
                        reversed()).
                forEach(Utils::printInTheSameLineWithSpace);
    }


    //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yazdiriniz
    //           Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
        public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){

        list.
                stream().
                distinct().
                map(String :: toUpperCase).//String classtaki upperCase methodunu kullan
                sorted(Comparator.comparing(String::length).//String classtaki length methoduna gore karsilastir.(String class a git length methodunu kullan )
                thenComparing(Comparator.naturalOrder())).//Natural Order a gore sirala
                forEach (System.out::println);//
            // Class::method --> method reference  denir- classin icindeki methodu adresle


        }
//    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz
//    public static List<String>removeElementIfTheLengthGreaterThanFive(){
//        list.removeIf(t->t.length()>5);
//        return list;
//
//    }
//Example 8: "A" ile baslayan veya "d" ile biten elemanlari siliniz
//        public static List<String>removeElementIfStartsWithAorEndsWithd(List<String>list){
//              list.
//              removeIf(t->t.startsWith("A") || t.endsWith("d"));
//              Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur bu yuzden
//             "stream()"methodunu kullanmayiz."removeIf()"methodunda oldugu gibi.
//
//            //Fakat stream() methodunu daha sonradan kullanmamiz gerekebilir Bu durumda stream() methodunu
//            //kullanarak istedigimiz method'lara ulasiriz, distinct() methoduna ulastigimiz gibi
//
//            //Sonuc bize list olarak lazim ise "collect(Collectors.to.List())"ile sonucu list'e ceviririz
//            //Stream yapilirsa remove gorulmez. RemoveIf methodunu kullanmak icin stream koymayiz
//    return list;
//
//        }
    //9)List elemanlarinin karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz

    public static List<Integer> printLengthSquare(List<String>list){

        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
        //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Util class'dan cagirarak kullanmaktir

    }
//10)List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
    public static List<String> printElementsLengthEven(List<String>list){
        return list.stream().filter(Utils::isEven).collect(Collectors.toList());
    }

    //Lambda ile kod yazarken once Javanin bize verdigi methodlari method reference icinde kullanmamiz tavsiye edilir
    //Eger method reference yetmiyorsa Util Class a koyup oradan kullaniriz
    //Util tekrar tekrar kullanacagimiz methodlarda kullanilir. Surekli kullanmayacagimiz methodlar kullanilarak Util i kalabaliklastirmak iyi degildir
    //Birseyi Util'e koydugumuzda bu herkesin isine yarayacak mi diye dusunmeliyiz!!
}
