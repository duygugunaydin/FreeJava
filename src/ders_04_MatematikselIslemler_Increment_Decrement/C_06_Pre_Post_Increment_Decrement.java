package ders_04_MatematikselIslemler_Increment_Decrement;

public class C_06_Pre_Post_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10 ;

        // a variable'inin degerini yazdirip, sonra a'nin degerini bir artirin.
        System.out.println("a : " +  a); //10
        a++ ;  // a'nin degeri artik 11.ama kosolda goremeyiz



        // b variable'inin degerini bir artirip, sonra yazdirin.
        int b = 10 ;
        b++ ;
        System.out.println("b : " + b); //11


        // c variable'inin degerini yazdirip, sonra c'nin degerini bir artirin.
        int c = 10 ;
        System.out.println("c : " + c++);  //10



        // d variable'inin degerini bir artirip, sonra yazdirin.
        int d = 10 ;
        System.out.println("d : " + ++d);  //11


        /*
        c++ veya ++d yi yazdirma veya atama isleminde kulanirsaniz
        c++ 'e  postincrement denir ve o satir icin once islemi yapar, sonra artirmayi yapar.
        ++d 'ye ise preincrement denir, once arttirma yapip sonra islmi yapar.

        islemin oldugu satirin bir alt satirina gecildiginde,
        c'de d'de bir artmistir.
         */









    }
}
