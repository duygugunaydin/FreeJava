package ders_04_MatematikselIslemler_Increment_Decrement;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C_02_DataCasting {
    public static void main(String[] args) {

        // SORU1 >> Kullanicidan iki double sayi alin.
        // Ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tam sayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(sayi1/sayi2);


        int bolum = (int)(sayi1/sayi2) ;

        System.out.println(bolum);






    }
}
