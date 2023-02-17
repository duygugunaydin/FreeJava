package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_04_If_Else_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan bir karakter girmesini isteyin.
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if (krk>='A' || krk<='Z' ){
            System.out.println("Buyuk Harf");
        } else {
            System.out.println("Buyuk Harf Degil");
        }












    }
}
