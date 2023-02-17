package ders_14_MethodOlusturma;

public class C_07_Soru_AsalSayiKontrol {

    // Soru 3- Kullanicidan main method icinde pozitif bir tam sayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak "asal sayi" veya "asal sayi degil" sonuclarini donduren bir method olusturun.

    public static void main(String[] args) {

        int sayi = 24 ;

        System.out.println(asalSayiKontrolEt(sayi));
        System.out.println(asalSayiKontrolEt(23));

    }

    public static String asalSayiKontrolEt (int sayi){
        String sonuc= "";

        for (int i = 2; i <= (sayi-1) ; i++) {

            if (sayi%i==0){
                sonuc="asal degil";
                break;
            }

        }
        if (!sonuc.equals("asal degil")){
            sonuc= "asal";
        }
        return sonuc;



    }
}
