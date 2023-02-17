package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_07_If_Else_Statements {
    public static void main(String[] args) {

       // SORU >> Kullanicidan bir harf isteyin,
       // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
       // degilse girilen harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf>='a' && harf<='z'){
            System.out.println((char)(harf-32));
        } else {
            System.out.println(harf);
        }












    }
}
