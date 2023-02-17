package ders_09_String_Manipulations;

public class C_06_substring_ilk {
    public static void main(String[] args) {

        String str = "Java ogren isi kap";

        System.out.println(str.substring(5));  // 5. indexi ve sonrasini yazdirir. >> ogren isi kap <<
        System.out.println(str.substring(0));  // 0. indexi ve sonrasini yazdirir >> java ogren isi kap <<

        System.out.println(str.length());  // >> 18mus

        // Son karakteri stirng olarak kaydedin:
        String sonHarf = ""+str.charAt(str.length()-1) ;   // Basina hiclik koymazsam kabul etmez..

        sonHarf = str.substring(str.length()-1) ;
        System.out.println(sonHarf);   // p

        // Son indexteki karakteri uppercase olarak yazdirin:

        System.out.println(str.substring(str.length()-1).toUpperCase()); // P

        // Son 3 harfi uppercase olarak yazdiralim:

        System.out.println(str.substring(str.length()-3).toUpperCase());










    }
}
