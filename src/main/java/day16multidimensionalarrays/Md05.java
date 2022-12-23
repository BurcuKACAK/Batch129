package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {
        //Example 1: Bir multi-dimensional arra olusturunuz
        //           Bu arraydeki elemanlarin carpimini konsala yazdiran kodu yaziniz


        int[][] a = {{1, 2}, {3, 4, 5}};

        int carpim = 1;

        for (int[] w : a) {
            for (int k : w) {

                carpim *= k;

            }
        }
        System.out.println(carpim);
    }
}