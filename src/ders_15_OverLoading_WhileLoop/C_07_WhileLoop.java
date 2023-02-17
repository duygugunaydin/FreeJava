package ders_15_OverLoading_WhileLoop;

import java.util.Scanner;

public class C_07_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru 5 >> Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin
        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        bir method olusturun.
         */


        int girilenSayi = 5;
        int girilenUs = 3;

        usHesapla(5,3);
        }

        public static void usHesapla ( int sayi , int us ){

        int sonuc =1;

        while (us>0){
            sonuc *= sayi;
            us--;
        }
            System.out.println(sonuc);






    }
}
