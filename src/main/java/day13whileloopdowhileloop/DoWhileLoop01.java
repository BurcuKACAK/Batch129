package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //1)while-loop
        int i = 1;

        while (i<1){
            System.out.println("Sen bir while loop'sun..."); //while body hic calismadi. while loop da zero exeqcuiton mumkundur.
            i++;
        }


        //2)do-while-loop
        int k = 1;

        do {
            System.out.println("Sen bir do while loop'sun");//1)do while calisti
            k++;                                            //2)do while kullandiginizda loop body en az bir kere calisir
        } while (k<1);                                      //3)do while da "zero exection" mumkun degildir



    }

}
