package day11forloops;

public class ForLoop03 {
    public static void main(String[] args) {

        //INTERVIEW SORUSU = Ex 1 : Size verilen bir Stringi tersten yazdiriniz
        // Germany ==> ynamreG

        String  s = "Java";
        String t = "";
        for (int i = s.length()-1 ; i>=0 ; i--) {
             t= t+s.charAt(i);}
            System.out.println(t);

        // Ex 2: Size verilen bir Stringin "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        // civic, nalan, kacak , 11211==> Palindrome

        //INTERVIEW SORUSU=Logic: Stringi ters cevir sonra da duz hali ile ters halini karsilastir ayni ise "Palindrome" demektir

        String duz = "Civic";
        String ters = "";

        for (int i =duz.length()-1; i >=0 ; i--) {
            ters = ters + duz.charAt(i);
        }

        if (duz.equalsIgnoreCase(ters)){
        System.out.println(duz +" : Palindrome'dur");}
        else {
            System.out.println(duz + " : Bu String Palindrome Degil");
        }






    }
}
