package ders_12_ForLoops;

public class C_04_forLoops_rakamlarToplami {
    public static void main(String[] args) {

        // Kullanicinin verdigi sayinin rakamlar toplamini bulun

        int sayi = 500000012;
        String sayiStr = ""+sayi;

        int birlerBasamagi = 0;
        int rakamlarToplami= 0;

        for (int i = 1; i <= sayiStr.length() ; i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);
















    }
}
