package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s, 2);
        getCharFromString(s, 4);
    }
    public static void getCharFromString(String s, int idx){

        char ch = s.charAt(idx);
        // .StringIndexOutOfBoundsException==>String de indeks kullanırken sınırların dısın a cıkma hatası

        System.out.println(ch);

    }

}
