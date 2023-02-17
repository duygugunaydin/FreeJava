package ders_14_MethodOlusturma;

import java.util.Scanner;

public class C_01_Carpim {
    public static void main(String[] args) {

        // Main method icerisinde kullanicidan iki sayi alin
        //bu iki sayiyi parametre olarak kabul edip, carpimlari main method'a donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi yaziniz:");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(carpimMethodu(sayi1, sayi2));

        double carpimSonucu = carpimMethodu(6,2);
        System.out.println(carpimSonucu);
    }


    public static double carpimMethodu (double sayi1, double sayi2) {
        System.out.println("carpim methodu calisti");
        return sayi1 * sayi2;

    }

}

