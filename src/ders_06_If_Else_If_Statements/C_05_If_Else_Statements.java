package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_05_If_Else_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan yasini isteyin, 65yas ve uzeri ise 'emekli olabilirsin' yazdirin,
        // degilse emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas = scan.nextDouble();

        if (yas>65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olabilmeniz icin " +(65-yas) + " sene daha calismalisin");
        }




    }
}
