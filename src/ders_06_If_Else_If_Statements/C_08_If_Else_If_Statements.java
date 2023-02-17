package ders_06_If_Else_If_Statements;

import javax.swing.*;
import java.util.Scanner;

public class C_08_If_Else_If_Statements {
    public static void main(String[] args) {

        // SORU>> Kullanicidan bir ucgenin uc kenar uzunluunu alin,
        //        Kenar uzunluklari 0 veya negatifse gecersiz kenar uzunlugu yazdirin,
        //        Ucgen eskenar ucgen ise "Eskenar ucgen" yazdirin,
        //        Degilse "Eskenar ucgen degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if ( kenar1<=0 || kenar2<=0 || kenar3<=0 ) {
            System.out.println("Gecersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
