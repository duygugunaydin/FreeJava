package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_10_If_Else_If_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan cinsiyetini ve yasini alin,
        // Kadin 60 yas ve uzeri, Erkek 65 yas ve uzeri >> 'emekli olabilir' ,
        // Cinsiyet ve yasini dikkate alarak 'emekli olabilirsin'
        // veya 'emekli olmak icin ..yil calisman lazim' yazdirin.

        char cinsiyet = 'E';
        int yas = 60;


        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Emekli olabilirisin");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak icin daha " + (65 - yas) + " yil daha calismalisin.");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak icin daha " + (60 - yas) + " yil daha calismalisin.");
        } else {
            System.out.println("Gecersiz giris");
        }

    }
}




