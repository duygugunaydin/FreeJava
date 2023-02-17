package ders_05_Concatenation_Operatorler;

import java.util.Scanner;

public class C_04_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi alin
        // Eger birinci sayi 100'den buyukse, "Ilk sayi 100'den buyuk" yazdirin.
        // Eger ikinici sayi ciftse, "Ikinci sayi cift" yazdirin.
        // Eger ilk sayi, ikinci sayidan buyukse, "Ilk sayi daha buyuk" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1>100){
            System.out.println("Ilk sayi 100'den buyuk");
        }

        if (sayi2%2==0){
            System.out.println("Ikinci sayi cift");
        }

        if (sayi1>sayi2){
            System.out.println("Ilk sayi daha buyuk");
        }













    }
}
