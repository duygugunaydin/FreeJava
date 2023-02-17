package ders_06_If_Else_If_Statements;

import java.util.Scanner;

public class C_09_If_Else_If_Statements {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alin,
        // Sayi negatif ise 'gecersiz sayi' ,
        // Tek basamakli ise 'rakam' ,
        // Iki basamakli ise 'iki basamakli sayi' ,
        // Bunun disindaki sayilar icin 'buyuk sayi' yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scan.nextInt();

        if(sayi<0){
            System.out.println("Gecersiz sayi");
        } else if (sayi<10) {
            System.out.println("Rakam");
        } else if (sayi<100) {
            System.out.println("Iki basamakli sayi");
        } else {
            System.out.println("Buyuk sayi");
        }

        /*
        ikinci satira gectiginde ilk satir zaten gectigi icin tekrar belirtmek gerekmez
        sayinin negatif olma ihtimali yok
        eger sayi negatif olsaydi en basta negatif der ve diger satirlara bakmaya ihtiyac duymaz
        sonucu yazdirirdi.
        ucuncu satira geldiginde sayinin negatif ve 100den kucuk olma ihtimali yok.olsa yakarlardi.
        o yuzden bir onceki satirlari tekrar tekrar yazmaya gerek yoktur.
        java kontrol ederken yukardan asagiya dogru gider.
         */


    }
}
