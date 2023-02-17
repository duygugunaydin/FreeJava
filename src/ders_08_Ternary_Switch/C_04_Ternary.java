package ders_08_Ternary_Switch;

import java.util.Scanner;

public class C_04_Ternary {
    public static void main(String[] args) {

        // SORU >> Kullanicidan bir ucgenin uc kenar uzunlugunu alin,
        // Ucgen eskenar ise "eskenar ucgen" yazdirin, degilse "eskenar degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar degil");

        String ucgen = kenar1==kenar2 && kenar2==kenar3 ? "eskenar ucgen" : "eskenar degil" ;
        System.out.println(ucgen);

        // >> 0 0 0 verirsen eskenr yazdirir.ternary op ile bunu yapmak isi daha karmasik hale getiriyor
        // bu yuzden sadec basit durumlarda kullaniriz


        // SORU >> Kullanicidan iki sayi alin, ve
        // buyuk olmayan sayiyi yazdirin.

        int sayi1 = 10 ;
        int sayi2 = 12 ;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);












    }
}
