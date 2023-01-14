package day26overriding;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override//Override Annotation : Override kurallarinin Java tarafindan kontrol edilmesini saglar
    public void eat() { //Child'daki override edilmis eat method'una "Overriding Method"denir
        System.out.println("Cats eat...");
    }


    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+ b;
    }

    @Override
    public Integer Multiply(int a, int b) {
        return  a* b;
    }
}



// new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin olusturdugumuz Cat'i Animal data type'ina koyabiliriz.


// @ ile baslayan override Annotation'i denir.Ne ise yarar method tepesine koyarsaniz
// Java override kurallarini kontrol eder.
// Eger kurallar ihlal edilmis ise hata verir.