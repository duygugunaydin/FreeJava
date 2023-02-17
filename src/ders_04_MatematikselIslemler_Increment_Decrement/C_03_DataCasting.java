package ders_04_MatematikselIslemler_Increment_Decrement;

import java.util.Scanner;

public class C_03_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki int deger alip,
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz.");

        int sayi1 = scan.nextInt();  //20
        int sayi2 = scan.nextInt();  //6
        System.out.println(sayi1/sayi2);  //3

        double ondaliklisonuc = sayi1/sayi2 ;
        System.out.println(ondaliklisonuc);  //3

        double dogruSonuc = (double)sayi1 /sayi2 ;
        //mutlaka sayilardan en az birini de double'a cevirmek gerekiyo,sonucun double olabilmesi icin.
        System.out.println(dogruSonuc);              // 3,66...




    }

}
