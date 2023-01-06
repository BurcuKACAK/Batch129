package day11forloops;

public class ForLoop01 {

    public static void main(String[] args) {
        //Example 1 : Verilen Bir Stringte ilk 'a' harfinden onceki verilen tum karakterleri konsola yazdiriniz
        // I love Java==>I love J
        String str = "Tramvay";

        for(int i = 0 ; i<str.length() ; i++){

            char ch = str.charAt(i);
            if(ch == 'a'){
                break;
            }
            System.out.print(ch);//Tr
        }
        System.out.println();
        //Example 2 : Verilen bir Stringte son 'a'dan sonraki tum karakterleri ters sirada yazdiriniz
        // Germany==>yn
        String str1 = "Germany";

        for (int i = str1.length()-1 ; i>=0; i--) {

            char ch =str1.charAt(i);
            if (ch == 'a'){
                break;
            }
            System.out.print(ch);
        }


        System.out.println();




    }
}
