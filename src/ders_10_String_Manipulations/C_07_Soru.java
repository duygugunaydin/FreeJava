package ders_10_String_Manipulations;

import java.util.Scanner;

public class C_07_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir metin alin.
        cumlenin durumuna gore;
        1- Cumle metni icermiyor.
        2- Cumle metni sadece 1 kere iceriyor.
        3- Cumle metni birden fazla iceriyor.
        seceneklerinden uygun olani yazdirin
         */

        String cumle = "Java cok guzeldir cok";
        String metin = "cok";

        if (!cumle.contains(metin)) {
            System.out.println("Cumle metni icermiyor");
        } else {
            int ilkindex = cumle.indexOf(metin);                                 // ilk indexi bulacak

            int ikinciIndex = cumle.indexOf(metin , ilkindex+1);  // ilk indexten sonraki ilk metin, yoksa -1

            if (ikinciIndex == (-1)) {
                System.out.println("cumle metni sadece bir kere iceriyor");
            } else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }
    }
    }

