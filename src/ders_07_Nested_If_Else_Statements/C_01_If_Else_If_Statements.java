package ders_07_Nested_If_Else_Statements;

import javax.lang.model.element.Element;
import java.util.Scanner;

public class C_01_If_Else_If_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan kilosunu(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin.
        // ( kilo*10000/(boy*boy) )
        // Vucut kitle endeksi, 30'dan buyukse 'OBEZ'
        // 25-30 arasi ise 'KILOLU'
        // 20-25 arasi ise 'NORMAL'
        // 20'den kucukse 'ZAYIF' yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kilonuzu(kg olarak) giriniz:");
        double agirlik = scan.nextDouble();
        System.out.println("Lutfen boyunuzu(cm olarak) giriniz:");
        double boy = scan.nextDouble();

        double vke = agirlik*10000 / (boy*boy) ;
        System.out.println("Vucut Kitle Endeksiniz : " + vke);

        if (vke>30){
            System.out.println("OBEZ");
        } else if (vke>25) {
            System.out.println("KILOLU");
        } else if (vke>20) {
            System.out.println("NORMAL");
        } else if (vke>0) {
            System.out.println("ZAYIF");
        } else {
            System.out.println("Gecersiz giris");
        }

    }


    }

