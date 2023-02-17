package ders_12_ForLoops;

public class C_03_Faktoryel {
    public static void main(String[] args) {

        // Kulllanicinin verdigi sayinin faktoryelini bulalim:

        int sayi = 5 ;

        int faktoryel = 1 ;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel=faktoryel*i ;
        }
        System.out.println(faktoryel);


        // 1'den 100'e (sinirlar dahil)kadar olan sayilari toplayin:

        int toplam = 0 ;

        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);   // Yazdirmayi suslu parantezin icine yazmiyoruz.
                                      // Cunku oraya yazilirsa her bir islemi ayri ayri yazdiriyor
                                      // Disinda olursa sadece sonuc yazdiriyor.














    }
}
