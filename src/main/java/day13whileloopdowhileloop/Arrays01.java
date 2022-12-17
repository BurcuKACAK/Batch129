package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 12;//Bu yapinin icinde sadece bir tane daa depolanabilir.
        //Ama biz bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolamayabilme icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elamanlarinin "data type"i ve "eleman sayisi"mutlaka yazilmalidir

        String stdtNames [] = new String[5];


        //Array consola nasil yazdirilir?
        //to.String() methodunu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdtNames));//[null,null,null,null,null]

        //Array'e eleman ekleme nasil yapilir?
        stdtNames[2]="Ajda";
        System.out.println(Arrays.toString(stdtNames));//[null,null,Ajda,null,null]

        stdtNames[0] = "Cuneyt";
        stdtNames[1] = "Kemal";
        stdtNames[2] = "Ajda";
        stdtNames[3]= "Ezel";
        stdtNames[4] = "Besir";
        System.out.println(Arrays.toString(stdtNames));

        //Array'den spesifik bir eleman almak
        System.out.println(stdtNames[2]);

        //Example 1 : Arraydeki her elamani sonuna "!"isareti koyarak ekrana yazdiriniz.

        for (int i = 0; i<stdtNames.length; i++){

            System.out.println(stdtNames[i] + "!");
        }



    }
}
