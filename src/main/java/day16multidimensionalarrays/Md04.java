package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
        //      [ [2,5] , [4,7,11]] ==>[2,5,4,7,11]
        /*
        - Arrayin toplam eleman sayısını bul
        - Toplam sayısı uzunluğunda bir tek boyutlu array oluştur
        - Döngü ile tek tek ekleme yap
         */

        int a [][] = { {2,5} , {4,7,11}};
        System.out.println(Arrays.deepToString(a));//[[2, 5] , [4, 7, 11]]
        //"a"array'indeki toplam eleman sayisini bulunuz

        int totalElement =0;

        for (int[] w: a){
            totalElement+=w.length;

        }

        //"b" isimli tek dimensional'li bir array olusturunuz
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0]

        // "a" array'indeki elemanlari "b" arrayine transfer ediniz
        int idx =0;

        for (int [] w : a){
            for (int k : w){

                b[idx] = k;

                 idx++;

            }
        }
        System.out.println(Arrays.toString(b));

    }
}
