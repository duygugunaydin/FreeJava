package ders_15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C_06_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan sifre isteyin, asagidaki satlari saglamayan sifrelerde hatalari yazdirip,
        kullanicidan yeni sifre girmesini isteyin.
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca "Sifreniz basari ile kaydedildi" yazdirin

        sartlar:
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak = 0 ;

        while (sifreGecerliMi != true){

            System.out.println("Lutfen sifrenizi giriniz:");
            sifre = scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')){
                System.out.println("Sifrenin ilk harfi kucuk harf olmali");
                bayrak++;
            }
            if (!((sifre.charAt(sifre.length()-1) >= '0' && sifre.charAt(sifre.length()-1) <= '9'))){
                System.out.println("Sifrenin son karakteri sayi olmali");
                bayrak++;
            }
            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("Sifreniz basari ile kaydedildi");
            }
        }






    }
}
