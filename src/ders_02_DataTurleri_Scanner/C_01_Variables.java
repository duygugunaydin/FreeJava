package ders_02_DataTurleri_Scanner;

public class C_01_Variables {
    public static void main(String[] args) {

        int okulNo = 885 ;

        System.out.println(okulNo);    // 885

        System.out.println("okulNo");  // okulNo

        System.out.println("Okul No : " + okulNo);  // Okul No : 885


        /* int okulNo = 976 ;  >>kabul etmez>>
         okulNo degerini degistirirken tekrar int yazilmaz!
         Zaten boyle bir variable var diye hata verir.
         deger degistirmek icin 'okulNo= 976;' yazmak yeterlidir.
         */

        okulNo = 976;

        System.out.println("Yeni Okul No : " + okulNo);

        int not2 = 60 ;
        not2 = not2 + 10;  // 70 olur.
        System.out.println(not2);

        double bankadakiParam = 1000 ;           //deger atamayi, ayni satirda da, farkli satirda da yapabilriz.
        bankadakiParam = bankadakiParam + 100 ;  //yeni deger 1100 olur.
        bankadakiParam = bankadakiParam - 200 ;  //yeni deger 900 olur.
        System.out.println(bankadakiParam);  // 900 yazdirir.










    }
}
