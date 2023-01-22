package day22staticblocksconstructors.day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s = "Java";
        getCharFromString(s, 2);
        getCharFromString(s, 4);
    }
    //String'lerde var olmayan index'ler kullanildigind Java StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s, int idx){
// .StringIndexOutOfBoundsException==>String de indeks kullanırken sınırların dısın a cıkma hatası

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanma hatasi yaptiniz..."+e.getMessage());
            e.printStackTrace();//Hatanin seceresini doker
            System.out.println(e.getCause());//Hatanin sebebini soyler

        }




    }

}
