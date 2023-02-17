package ders_11_String_Manipulations;

public class C_02_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));  // JAvA cAndir  >> a'lari A'yla yer degistirdi.

        System.out.println(str.replace(' ','_'));  // Java_candir
        System.out.println(str.replace("candir","cok guzeldir"));  // Java cok guzeldir
        System.out.println(str.replace(" ", ""));  // Javacandir

        System.out.println(str.replace("", "_"));  //_J_a_v_a_ _c_a_n_d_i_r_

        // String'deki tum a'lari silin
        System.out.println(str.replace("a", ""));  // Jv cndir

        // Java yerine Hava, candir yerine cok guzel yazdiralim.
        System.out.println(str.replace("Java","Hava")
                              .replace("candir", "cok guzel"));

        // Sadece 1. a'yi A yapin
        System.out.println(str.replaceFirst("a", "A"));  // JAva candir





    }
}
