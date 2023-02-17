package ders_02_DataTurleri_Scanner;

import java.util.Scanner;

public class C_07_Scanner {
    public static void main(String[] args) {

        // SORU3>> Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //         Isminiz : John
        //         Soyisminiz : Doe
        //         Yasiniz : 44
        //         Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble() ;

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir.");

        // NOT : \n >> ifadesini "cift tirnagin icinde kullanabilirsiniz" disinda kabul etmez.






    }
}
