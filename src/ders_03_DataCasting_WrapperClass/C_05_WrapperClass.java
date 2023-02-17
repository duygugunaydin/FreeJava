package ders_03_DataCasting_WrapperClass;

public class C_05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10 ;
        String  str = "Java cok guzel" ;

        // str. >> yazdiginda bircok method bulunur.
        //sayi. >> yazdiginda hicbir hazir method bulundurmaz. (primitive datalar sadece deger barindirirlar)
        //         aslinda methodlar cikar ama hicbirini kullanamazsin.kullanilabilir degildir.

        /*
        Javaya yapilan talepler sonucunda, java primitive data turleri
        ile bazi hazir medhodlarin kullanilabilmesi icin Wrapper Classlar olurturulmustur.

        Wrapper Classlar primitive data turlerindeki degerleri alirlar
        ancak methodlari da vardir.
         */

        char krk ='b';
        Character krkWrapper = 'b'  ;

        System.out.println(Character.isLetter('5')); //false

        System.out.println(Character.isDigit('7'));  //true

        String str1 = "123";
        String str2 = "12";

        // str1 ve str2'nin degerlerini matematiksel olarak toplayiniz

        System.out.println(str1 + str2);  //12312

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));  //135

        // Intager.parseInt(str)  icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir
        // Ancak bir karakter bile rakam degilse hata verir.

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);






    }
}
