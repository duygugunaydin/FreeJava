package ders_04_MatematikselIslemler_Increment_Decrement;

public class C_01_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20 ;
        int sayi2 = 6 ;

        System.out.println( sayi1 / sayi2 );  //3
        // Bolunen ve bolen ikiside tam sayi ise, java sonucun sadece tam sayi kismini alir.

        double sayi3 = 6 ;

        System.out.println( sayi1 / sayi3 );  // 3,333333...
        // int/double  java genis olana gore davranir. ve sonucu double verir.


    }
}
