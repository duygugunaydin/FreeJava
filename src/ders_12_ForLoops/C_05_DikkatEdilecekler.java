package ders_12_ForLoops;

public class C_05_DikkatEdilecekler {
    public static void main(String[] args) {

        /*
        Sonsuz Loop  >> eger calistirirsan sonsuza kadar (rem'i bitirene kadar) devam eder!!  DIKKAT  !!

        for (int i = 0; i > -10 ; i++) {
            System.out.println(i+" ");
        }

        */


        for (int i = 0; i > 10 ; i++) {     // ilk deger icin bitis sarti true olmuyorsa >> i>10,=> 0>10 >> false
            System.out.println(i);          // for body'si hic devreye girmez
        }


        // Eger bir loop'u sonunu beklemeden bitirmek istersek break koyariz!  ==> ornek uzerinden gidecek olursak

        // Kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun :

        int sayi = 103 ;
        boolean asalMi = false ;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalMi=true;
                break;                              // break koyarak loop'un sonunu beklemeden bitirmis oluruz..
            }
        }
        System.out.println(asalMi);

        // ya da bayrakla da yapabiliriz ayni ornegi ==>

        int sayi2 = 100 ;
        int bayrak = 0; ;

        for (int i = 2; i <sayi2 ; i++) {
            if (sayi2 % i == 0) {
                bayrak++;                       // Bayrak kac olursa o kadar sayiya bolunebiliyor demek..
            break;               // break ' i kaldirabilirsin.bunu koyarsan hepsini denemeden ilk bulusta sonuc verir
            }}
            if (bayrak == 0) {
                System.out.println("Asal Sayi");
            } else {
                System.out.println(bayrak);
                System.out.println("Asal Sayi degil");
            }

        }}
