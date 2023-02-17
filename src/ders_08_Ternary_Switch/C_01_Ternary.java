package ders_08_Ternary_Switch;

import java.util.Scanner;

public class C_01_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // Sayi pozitif ise iki katini yazdirin,
        // Sayi pozitif degilse sayiya 10 ekleyip yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println(sayi*2);
        }else{
            System.out.println(sayi+10);
        }

        // TERNARY ILE >>

        System.out.println(sayi>0 ? sayi*2 : sayi+10);

        sayi = sayi>0 ? sayi*2 : sayi+10 ;
        System.out.println(sayi);























    }
}
