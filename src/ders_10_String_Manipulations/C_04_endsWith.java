package ders_10_String_Manipulations;

public class C_04_endsWith {
    public static void main(String[] args) {

        String str = "Java heryerde guzel";

        // .endsWith >> ile mi bitiyor demek

        System.out.println(str.endsWith("guzel"));  // true
        System.out.println(str.endsWith(""));       // true
        System.out.println(str.endsWith("Java heryerde guzel"));  // true
        System.out.println(str.endsWith("Java"));   // false










    }
}
