package ders_09_String_Manipulations;

import java.util.Locale;

public class C_01_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Mutluluktur" ;

        System.out.println(str.toUpperCase());  // JAVA MUTLULUKTUR

        System.out.println(str);     // Java Mutluluktur >> atama yapmadigimiz icin eskisi gibi yazdirir.

        str = str.toUpperCase();
        System.out.println(str);   // JAVA MUTLULUKTUR >> bir ust satirda atama yaptigimiz icin buyuk harf yazdirir.

        str = "Ince Mehmet" ;

        str = str.toLowerCase();
        System.out.println(str);  // ince mehmet

        str = str.toUpperCase();
        System.out.println(str);  // INCE MEHMET

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));   // Locale.forLanguageTag >> turkce karakter



        System.out.println();
















    }
}
