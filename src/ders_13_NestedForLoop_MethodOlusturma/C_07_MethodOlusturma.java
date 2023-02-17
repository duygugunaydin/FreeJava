package ders_13_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C_07_MethodOlusturma {
    public static void main(String[] args) {

        /*
        Kullanicidan iki sayi alip, bunlarin toplamini yazdiran bir method olusturun.
         */

        isteTolpaYazdir();
        isteTolpaYazdir(); // iki kere yazdirirsan iki kere yazdirir. ve baska claslarda da yazdirabilirsin.

    }

    public static void isteTolpaYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin toplami : " + (sayi1+sayi2) );
    }
    // yukaridaki {} icinde method olusturuldu. bu methodu yazdirmak icin main methodun icine yazman gerekli








}
