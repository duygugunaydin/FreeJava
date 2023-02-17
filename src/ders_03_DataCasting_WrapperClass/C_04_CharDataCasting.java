package ders_03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C_04_CharDataCasting {
    public static void main(String[] args) {

        System.out.println('a' + 'b' ); //  97 + 98 = 195 >> ASCII tablosuna gore degeri

        //Kullanicidan char bir karakter alin
        //o karakterden sonra gelen 3 karakteri yazdirin.
        //Ornek, input : a , output: bcd

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz.");

        char girilenKrk = scan.next().charAt(0); //0 >> kacinci harf oldugudur.

        // Mesela yazilan karakter ALI ise>> A>0. karakter ; L>1. krk ; I>2. krk'dir

        System.out.println((girilenKrk+1) + (girilenKrk+2) + (girilenKrk+ 3));  //>>ASCII tablosuna gore degeri

        System.out.println("" + (char)(girilenKrk+1) + (char)(girilenKrk+2) +(char)(girilenKrk+3));
        //basa char koyarsak harf olarak kalir.
    }
}
