package ders_17_Scope;

import java.util.Scanner;

public class C_05_ObjectVariables {

    public static void main(String[] args) {

        // C_03 class'daki instance variable'lara nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz

        C_03_ObjectVariables pers1 = new C_03_ObjectVariables(); // >> object variable'lar bu sekilde cagirilir.

        System.out.println(pers1.personelIsmi);
        System.out.println(pers1.personelYasi);
        System.out.println(pers1.personelTelefonu);

        pers1.personelIsmi = "Suleyman";
        pers1.personelYasi = 35 ;
        pers1.personelTelefonu = "5556667788";

        System.out.println(pers1.personelTelefonu);
        System.out.println(pers1.personelIsmi);


        C_03_ObjectVariables pers2 = new C_03_ObjectVariables();
        pers2.personelIsmi = "latife";
        pers2.personelYasi = 32 ;
        pers2.personelTelefonu = "5554446633";

        System.out.println(pers1.personelIsmi);  // suleyman
        System.out.println(pers2.personelIsmi);  // latife


        C_03_ObjectVariables pers3 = new C_03_ObjectVariables();
        pers3.personelIsmi = "heysem";
        pers3.personelYasi = 30 ;
        pers3.personelTelefonu = "555 222 11 22";

        System.out.println(pers1.personelYasi); // 35
        System.out.println(pers2.personelYasi); // 32
        System.out.println(pers3.personelYasi); // 30


    }
}
