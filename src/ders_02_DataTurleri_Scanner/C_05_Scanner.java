package ders_02_DataTurleri_Scanner;

import java.util.Scanner;

public class C_05_Scanner {
    public static void main(String[] args) {

        // SORU2>> Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi yazdiriniz.");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz.");
        int tamSayi = scan.nextInt();

        System.out.println("Girilen sayilarin toplami : " + (ondalikliSayi+tamSayi));
        System.out.println("Girilen sayilarin carpimlari : " + (ondalikliSayi * tamSayi));



    }
}
