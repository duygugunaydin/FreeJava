package ders_17_Scope;

public class C_01_LocalVariables {
    public static void main(String[] args) {

        // bir methodun icerisinde olusturulan variable'larin scope'u
        // icinde olusturulduklari method'dur
        // o method'un disindan ULASTIRILAMAZLAR
        // hangi methodun icerisinde olusturulduysa sadece orada gecerlidir, baska yerde kullanilamazlar.

        int sayi = 10;
        String isim = "Ramazan";
        // System.out.println(dogruMu);  >> farkli methodun icinde oldugu icin ulasamaz

        for (int i = 0; i < 10; i++) {
            String adres ="Ankara";
            isim = "Duygu";  // >> for loop'un disinda olusturulani loop'da kullanabiliriz..ayni method'daysa..
            // bir loop icerisinde olusturulan variable'lar sadece o loop icerisinde gecerlidir.
        }
        // System.out.println(adres);  >> loop disarisinda kullanilamaz.


        double pi ;
        // System.out.println(pi);
        // local variable'lar deger atamadan olusturulabilir, ancak KULLANILAMAZ
        // kullanmadan once deger atanmis OLMALIDIR..

        }

    public static void method(){

        // System.out.println(sayi) ;  >> farkli methodun icinde oldugu icin burada tekrar atama yapmaliyiz
        // isim = "tugay" ;            >> tekrar atama yapip oyle degeri degistirebilirz
        boolean dogruMu = true ;

    }





}
