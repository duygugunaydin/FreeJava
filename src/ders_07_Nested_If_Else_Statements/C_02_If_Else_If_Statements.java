package ders_07_Nested_If_Else_Statements;

import java.util.Scanner;

public class C_02_If_Else_If_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan aldigi urun adedi ve fiyat listesini alin.
        // Kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa, 10 urunden fazla alirsa %20, az alirsa &15 indirim yapin.
        // Musteri karti yoksa, 10 urunden fazla alirsa %15, az alirsa &10 indirim yapin.

        int urunAdedi = 20 ;
        boolean kartVarMi = false ;
        double listeFiyati = 10 ;
        double toplamFiyat = 0 ;

        if (kartVarMi==true && urunAdedi>10){
            toplamFiyat = urunAdedi * listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
        } else if (kartVarMi==true && urunAdedi>10 && urunAdedi<0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (kartVarMi==false && urunAdedi>10 ) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (kartVarMi==false && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.9);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
        } else {
            System.out.println("Gecersiz giris");
        }

        // kartVarMi== ture yarine kartVarMI
        // kartVarMi== false yarine !kartVarMI  yazabilirsin..






        }
    }


