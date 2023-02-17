package ders_09_String_Manipulations;

public class C_05_length {
    public static void main(String[] args) {

        String str = "uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());  // length >> karakter sayisi >> 34

        // Son karakteri yazdirin:
        System.out.println(str.charAt(33));  // u
        System.out.println(str.charAt(str.length()-1));  // son karakteri elde etmek icin kullanilir.

        // Sondan ucuncu karakteri yazdirin:
        System.out.println(str.charAt(str.length()-3));   // g















    }
}
