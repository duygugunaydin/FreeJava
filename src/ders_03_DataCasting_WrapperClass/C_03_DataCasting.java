package ders_03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C_03_DataCasting {
    public static void main(String[] args) {

        /* Soru>> Kullanicidan bir tam sayi alin,
          kullanici kac girerse girsin
          konsolda -128 ile +127 arasinda bir sonuc yazdiracak kod yaziniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
         int girilenSayi = scan.nextInt();

         byte donusenSayi = (byte) girilenSayi ;

        System.out.println("Girdiginiz " + girilenSayi + " 'nin donusmus hali : " + donusenSayi);



    }
}
