package ders_17_Scope;

public class C_04_ClassVariables {

    public static void main(String[] args) {

        // C_03 'deki hastane ismini yazdirmak istersek >>
        System.out.println(C_03_ObjectVariables.hastaneIsmi);  // >> diye yazinca hemen ulasilabiliriz
        System.out.println(C_03_ObjectVariables.hastaSayisi);  // 23453
        C_03_ObjectVariables.hastaSayisi++;
        C_03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C_03_ObjectVariables.hastaSayisi);  // >>23456

    }  // kod takibi main method'dan baslar.
       // main method'un sonuna gelindiginde hersey biter.
       // tum degisimler resetlenir.
       // variable degerleri bastaki hallerine doner.

    public static void method1 (){
        C_03_ObjectVariables.hastaSayisi++;
    }

    /*
    Java Runtime programdir.
    calismaya basladiginda variable'lara atana degerleri ister
    calistigi muddetce yapilan degisiklikleri kaydeder
    ama calismasi bittiginde degisen degerleri resetlenir.
     */
}