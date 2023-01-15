package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student myStd = new Student();

        //Student 1
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.00);
        myStd.setPoor(false);


        String stdId = myStd.getStdId();
        myStd.getStdId();// Bu bize Variable degerini verecek.

        System.out.println(stdId);//AC123
        myStd.setGpa(4.0);//encapsule yapilmis variable'i set methodu ile degistirdik
        //set method kalibi degistirmez objedeki degeri degistirir.
        //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

        System.out.println(myStd.getGpa());


    }
}
