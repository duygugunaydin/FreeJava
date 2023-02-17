package ders_11_String_Manipulations;

public class C_03_replaceAll {
    public static void main(String[] args) {

        String str = "J1ava2 G9uyel5dir8";

        // str'daki sayilari silip metni Java Guzeldir haline donusturelim

        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir.

        System.out.println(str.replaceAll("\\d", "")); // Java Guzeldir

        System.out.println(str.replaceAll("\\D", ""));  // 12958

        String s1 = "ilk urun fiyati : 1250 tl";
        String s2 = "ikinci urunun fiyati : 1500 tl ";
        // iki urunun fiyatini toplayin:

        s1 = s1.replaceAll("\\D","");  // 1250
        s2 = s2.replaceAll("\\D" , "");  //1500

        System.out.println(s1 +s2);  // 12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));  // 26750



















    }
}
