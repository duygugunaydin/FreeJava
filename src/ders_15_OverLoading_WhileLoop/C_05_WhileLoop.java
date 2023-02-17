package ders_15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C_05_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere sayi alin
        sayilarin toplami 500'e esit olur veya gecerse

        girilen sayi adedi
        girilen sayilarin toplamini ve
        "Bu kadar yeter" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        int sayac = 0;
        double toplam = 0;
        double girilenSayi = 0;

        while (toplam < 500){
            System.out.println("lutfen toplamak istediginiz sayilari giriniz:");
            girilenSayi = scan.nextDouble();

            sayac++;
            toplam += girilenSayi;

            }
        System.out.println("Girilen " + sayac + " sayinin toplami : " + toplam + " oldu.Bu kadar yeter" );


        }
    }

