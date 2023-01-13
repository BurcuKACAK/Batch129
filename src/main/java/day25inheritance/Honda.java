package day25inheritance;


public class Honda extends Car {

    public int price = 10000;
    public void engine(){
        System.out.println("Honda engine..");
    }
    public Honda() {

        System.out.println("Honda 1 ");
    }

    public Honda (String model, int year){
       //super yazmasaniz da ayni isi gorur. Parametre eklenecekse mutlaka yazilmali
        System.out.println("Honda 2 : "+model+ "-"+year);
    }
}














        /*2)super(); ne ise yarar ?
        Note: "super()" parent'teki constractor'i calistirmaya yarar.
        "super()" keyword'unu parent'taki parametresi belli olan constractur'lar icin kesinlikle kullanılmalıdır.*/