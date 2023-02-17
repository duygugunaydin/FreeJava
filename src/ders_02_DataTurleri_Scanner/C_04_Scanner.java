package ders_02_DataTurleri_Scanner;

import java.util.Scanner;

public class C_04_Scanner {
    public static void main(String[] args) {

        // SORU1>> Kullanicidan ismini alip, buyuk harflrle yazdirin.

        // 1.Adim : scan objesi olusturma..
        Scanner scan = new Scanner(System.in);

        // 2.Adim : kullaniciya ne istedigimizi yazdirma..
        System.out.println("Lutfen isminizi giriniz");

        // 3.Adim : Kullanicidan istedigimiz bilginin turune uygun bir variable
        //          olusturup scanner metholarindan uygun olani kullanarak alinan degeri
        //          variable'a atayalim.
        String kullaniciAdi = scan.next() ;  // .next() istenilenin sadece ilk space'e kadar olan kismini alir.
                                             // .nextLine() ise o satirdaki tum bilgiyi alir.

        System.out.println(kullaniciAdi.toUpperCase());


    }
}
