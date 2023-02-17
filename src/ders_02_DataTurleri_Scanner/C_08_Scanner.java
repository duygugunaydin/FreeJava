package ders_02_DataTurleri_Scanner;

import java.util.Scanner;

public class C_08_Scanner {
    public static void main(String[] args) {

        // Soru 7 (interview)
        // Kullanicidan iki sayi alip, ikisinin degerlerini degistiriniz(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz.");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz.");
        int sayi2 = scan.nextInt();

        int bos ;

        bos = sayi2 ;
        sayi2 = sayi1 ;
        sayi1 = bos ;

        System.out.println("Sayi1'in degeri : " + sayi1);
        System.out.println("Sayi2'in degeri : " + sayi2);

    }
}
