package ders_03_DataCasting_WrapperClass;

public class C_02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi = 20 ;

        /*
        genis data turundeki bir degeri
        dar data turundeki bir variable'a atamak isterseniz
        java sorumlulugu almanizi ister.

        bu sorumlulugu almak icin
        cast edecegimiz degerin onune () icerisinde
        cast etmek istedigimiz data turu yazilir.

        ancak bu durumda data kayiplari (double'dan int'e gecerken virgulden sonrasi silinir)
        veya baskalasim olabilir(int'i byte'a cevirirsek tekrar tekrar basa doner.)
         */

        short sh = (short) sayi ;

        System.out.println(sh);  // 20

        double dbl = 23.5 ;
        int sayi2 = (int) dbl ;
        System.out.println(sayi2);  // 23

        sayi2 = 15;

        byte byt = (byte)sayi2 ;
        System.out.println(byt);

        sayi2 = 128 ;
        byt = (byte)sayi2 ;

        System.out.println(byt); //-128

        sayi2 = 134 ;
        byt = (byte)sayi2 ;

        System.out.println(byt);  //-122

        //max deger 127 oldugu icin sonrasinda>> -128 e donup sifira dogru ilerler








    }
}
