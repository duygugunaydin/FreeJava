package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_03_If_Else_Statements {
    public static void main(String[] args) {

        // SORU>> Kullanicidan bir ucgenin uc kenar uzunluunu alin,
        //        Ucgen eskenar ucgen ise "Eskenar ucgen" yazdirin,
        //        Degilse "Eskenar ucgen degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }



    }
}
