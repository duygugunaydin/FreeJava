package ders_07_Nested_If_Else_Statements;

import java.util.Scanner;

public class C_04_Nested_If_Else_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan cinsiyetini ve yasini alin,
        // Kadin 60 yas ve uzeri, Erkek 65 yas ve uzeri >> 'emekli olabilir' ,
        // Cinsiyet ve yasini dikkate alarak 'emekli olabilirsin'
        // veya 'emekli olmak icin ..yil calisman lazim' yazdirin.

        // Simdi de ana degisken yas olsun >>

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi giriniz: E/K");
        char cinsiyet = scan.next().charAt(0);

        if (yas>65){
            System.out.println("Emekli olabilirsin");
        } else if (yas>60) {
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet=='E' || cinsiyet=='e'){
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman lazim");
            } else {
                System.out.println("Hatali cinsiyet girisi");
            }
        } else if (yas>15){
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman lazim");
            } else if (cinsiyet=='E' || cinsiyet=='e'){
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman lazim");
            } else {
                System.out.println("Hatali cinsiyet girisi");
            }
        } else {
            System.out.println("Hatali yas girisi");
        }
    }
}
