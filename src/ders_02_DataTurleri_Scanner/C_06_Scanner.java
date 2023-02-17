package ders_02_DataTurleri_Scanner;

import java.util.Scanner;

public class C_06_Scanner {
    public static void main(String[] args) {

        // SORU4>> Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //         dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenar uyunlugunu giriniz" +
                "\niki kenar uzunlugu arasinda enter'a basiniz.");

        // NOT >> \n (ters slach n) konsoldaki bilgiyi alt satira gecirir.

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Dikdortgenin Alani : " + (kenar1 * kenar2));



    }
}
