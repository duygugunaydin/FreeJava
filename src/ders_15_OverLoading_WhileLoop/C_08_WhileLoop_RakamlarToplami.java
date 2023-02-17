package ders_15_OverLoading_WhileLoop;

public class C_08_WhileLoop_RakamlarToplami {

    /*
    While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulunuz
     */

    public static void main(String[] args) {

        int sayi = 1453 ;

        int birlerBasamagi = 0;
        int rakamlarToplami= 0 ;


        while (sayi != 0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi /=10;
        }
        System.out.println(rakamlarToplami);





    }
}
