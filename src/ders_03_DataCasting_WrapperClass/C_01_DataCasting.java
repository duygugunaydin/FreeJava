package ders_03_DataCasting_WrapperClass;

public class C_01_DataCasting {
    public static void main(String[] args) {

        // NOT >> bazi data turleri asla birbirine cast edilemez.

        // String str = 20 ; >> kabul etmez, cift tirnak icinde olmali

        // boolean mutluMu = "true" ; >> cift tirnak icinde olmamali

        // int a = true ; >> sayi olmali.true olmaz

        double s = 20 ; //int variable double olarak yazdirilabilir.
        int sayi = 15 ;
        long ln = sayi ; //esitligin sol tarafi long-sag tarafi int >> java itiraz etmedi



        /*
        dar data turunden bir degeri genis data turundeki variable'a
        atama yaparsaniz java bunu otomatik olarak yapar.
         */
        short sh = 23 ;
        int a = sh ;
        long lng = sh ;
        float fl = lng ;

        /*
        ama tersini yapmak isterseniz>> yani buyuk data turundeki
        variable'a atamak isterseniz java kabul etmez.
         */

        double  dbl = 20;
        // a = dbl ;
        // short abc = dbl ;



    }
}
