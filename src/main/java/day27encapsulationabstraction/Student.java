package day27encapsulationabstraction;

public class Student {

    private  String stdId = "AC123";
    private double gpa = 3.99;//gpa (Grade Points Average)mezuniyet ortalamasi
    private boolean poor = true;

    //Encapsulation yapilmis datay'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmis (saklanmis) data'yi okumamiza yarar.
    //get method'larin(getter) her zaman "public" olur.
    //get method'larin(getter)  return type'i variable'in data type í ile ayni olur.
    //get method'larin(getter) isimleri "get + variable name" seklinde olur.
    //get method'larin(getter) isimleri boolean ise "is + variable name" seklinde olur
    //get method'lar(getter) parametre kullanmazlar.


    public String getStdId() {
        return stdId;
    }
    public double getGpa() {//iki kelime kullanirsa ikinci kelimenin ilk harfi buyur
        return gpa;
    }
    public boolean isPoor() {//Variable 'in data type'i boolean ise is ile baslar
        return poor;
    }

    //Encapsulation yapilmis datalarin degeri degistirilebilir mi?
    //set method'lar (setter) encapsule edilmis datalarin degerlerini update etmemize ( degistirmemize) yarar.
    //set method'lar (setter) her zaman "public" olur.
    //set method'larin (setter) return type'i her zaman void olur.
    //set method'larin (setter) isimleri "set + variable name" seklinde olur.
    //set method'lar (setter) variable ile ayni data type' inda parametre kullanirlar.

    //getter ve setter'larin ikisine birden "Java Beans" denir.

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
















    /*
    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilanin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
    */
    //Encapsulation : Data hiding = Data Saklama: Access modifier private yapilirsa data saklanmis olur
}
   /* Encapsulation faydası;
1. guvenlık..saklamazsak dısardan etkıler data yı bozabılır.
        2. dıkkatı dagılır..odak dagınıklıgının onune gecer

    */