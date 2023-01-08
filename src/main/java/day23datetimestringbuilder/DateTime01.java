package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example: Time'i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        //hh==> 12lik saat sistemini kullanir   - HH==>24luk saat sistemini kullanir
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir. Yani; "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println(dtf.format(myTime));

    }
}
