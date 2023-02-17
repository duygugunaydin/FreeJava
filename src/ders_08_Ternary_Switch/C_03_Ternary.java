package ders_08_Ternary_Switch;

public class C_03_Ternary {
    public static void main(String[] args) {

        int a = 5 ;

        /*
        Ternary operatoru tek basina kullanilmaz.
        Ternary bize sonuc uretir.
        Bu sonucu ya direk yazdirmali ya da bir variable'a atamaliyiz.
        Atayacagimiz variable turu de sonuca uygun olmali;string,int,..
         */
        //  a%2==0 ? "cift sayi" : "tek sayi" ;  >> bu sekilde kabul etmez..

        String sonuc = a%2==0 ? "cift sayi" : "tek sayi" ;

        // String sonuc2 = a>10 ? "buyuk sayi" : 2*a ;>> 2*a yi da kabul etmez iki sonuc da ayni data turunde olmali

        String sonuc2 = a>10 ? "buyuk sayi" : ""+2*a ; // >> onune hiclik ekleyip stringe cevirmeliyiz

        System.out.println(a>10 ? "buyuk sayi" : 2*a); // >> ya da bu sekilde direkt yazdirmak istersek de olur.













    }
}
