package ders_01_ProgamlamayaGiris;

public class C_02_Variables {
    public static void main(String[] args) {

        int sayi = 111 ;

        System.out.println("HelloJava");    // HelloJava

        System.out.println(sayi);           // 111

        System.out.println("sayi");         // sayi

        /*
        Javada iki turlu yazdirma yapabiliriz.
        Eger cift tirnak icinde bir bilgi yazdirirsak
        java ne yazmissak aynen yazdirir.

        Ancak cift tirnak icerisinde olmayan bir sey gorurse
        onun yazdirilacak bir metin degil, bir deger tasiyan variable oldugunu anlar,
        hafizada o variabla icin ayirdigi bolume gider,
        o bolumde hangi deger varsa onu yazdirir.
         */


        //  int not ; >>deger atanmadan yazdirilamaz!

        // System.out.println(not); >>hata verir.deger atanmamis olabilir.diye


        int not ;
        not = 50 ;

        System.out.println(not);  // 50

        not= 70 ;

        System.out.println(not);  // 70

        // yazdirirken konsolda oncekini silmez.
        // en son ne atarsak deger olarak onu kabul eder.












    }
}
