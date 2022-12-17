package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
                Gecerli Username = "admin"Password="pwd123"dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise "Hesabiniza hosgeldiniz!" yazidirin.
                Username veya password yanlis ise 4 kere "Username ve Password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz Bloke Olmustur"mesaji vererek islemi tamamlayiniz.
         */

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{
            if(counter==4){
                System.out.println("Hesabiniz Bloke Olmustur!");
                break;
            }

            System.out.println("Username'i Giriniz");
            String  userName = input.next();

            System.out.println("Password'u Giriniz");
            String password = input.next();

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza Hosgeldiniz!");
                break;
            }
            counter++;
        }while (true);

    }
}
