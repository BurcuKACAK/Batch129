package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();

        dq.add(12);
        dq.add(5);
        dq.add(18);
        dq.add(9);
        dq.add(1);
        System.out.println(dq);//[12, 5, 18, 9, 1]


        /*
        Inheritance Faydalari (miras)
        1-Tekrar tekrar ayni kodu yazmaktan kurtarir
        2-Bir kodu degistirmek kolay olur
        3-Kod tamiri kolay olur
        4- Eger child classlara herseyi yerlestirirsek yavas olur. Ortaklari parent'a koyarsak child atomic olur, hizli calisir

        Polimorphism 2 oge var = Coklu Gorunum
        Overloading =Ayni isimli ama farkli isi yapan methodlar.
        Ovverriding =Parentlardaki her bir methodu ozellestirmek
        Parenttaki methodu degistirilerek her bir  child da kullanilirsa buna overriding denir Bu cok faydalidir, esneklik.

        Encapsulation=Datalari Saklamak Icin
        *Private acces modifier kullanarak saklanir
        Developer'larin kafasini karistirmamak icin. (Az gorursek kafamiz az karisir)
        *Disardan gorunmesi gerekmeyen seyleri saklamak icin
        get saklanan datayi okumak icin
        set saklanan datayi degisrtirmek icin kullaniriz

        Abstractionlar
        1-Abstract Clas = Hem normal hem abstract methodlar kondugu icin yari abstract denir
        2-Interfaceler = Tamamen abstract method lar kondugu icin fully abstract denir
        Niye ihtiyac duyduk
        Abstract kullanirsak coklu parent kullanamayiz ama interface kullanirsak coklu parent kullanabiliriz
         */



    }
}
