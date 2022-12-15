package day03scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Class ismi    Object Ismi     Assignment     "new"keyword     Constructor
            Car            myCar            =              new             Car();

        System.out.println(myCar.fiyat);

        System.out.println(myCar.model);

        myCar.hareket();

        myCar.dur();

        Student TomHanks = new Student();
        System.out.println(TomHanks.name);
        System.out.println(TomHanks.grade);
        System.out.println(TomHanks.address);

        TomHanks.feed();
        TomHanks.study();


    }
}
