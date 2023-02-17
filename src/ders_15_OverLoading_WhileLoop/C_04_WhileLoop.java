package ders_15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C_04_WhileLoop {
    public static void main(String[] args) {


        /*
        Kullanicidan toplanmak uzere tamsayilar alin
        Kullanici 0'a basarsa sayi alma islemini bitirin

        Kullanici kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;   // verilen ilk deger bu soru icin 0 olmamali
        // cunku 0 loop'u bitimek icin kullanilacak.
        int saayac = 0;
        int toplam = 0;

        while (girilenSayi != 0) {
            System.out.println("Lutfen tolanacak tam sayilari giriniz" +    // while'in icine yazilir tekrartekrar sayi almak icin
                    "\nBitirmek icin 0'a basin");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                saayac++;
                toplam = toplam + girilenSayi;
            }
            System.out.println("Girilen " + saayac + " adet sayinin toplami: "+ toplam);


        }
    }
}