package ders_11_String_Manipulations;

public class C_01_nullPointer {
    public static void main(String[] args) {

        String str1 = "";
         // str1'e deger atanmistir.
        System.out.println(str1);    // hiclik yazdirir.
        System.out.println(str1.concat("Java"));  // Java


        String str2 ;
        // str2 olusturuldu ama deger atanmadi.
        // System.out.println(str2);  >> degeri olmadigi icin yazdirmaz,kirmizi cizer
        // System.out.println(str2.concat("java"));  >> deger olmadigi icin methodla da kullanilamaz

        str2 = "Java candir";
        System.out.println(str2);                    // Java candir
        System.out.println(str2.concat("."));    // Java candir.


        String str3 = null ;  // str3'e deger atanmamistir,
                              // null pointer ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz
                              // basit toplama islemleri yapabilirsin ancak method kullanilamaz
                              // ilerde deger atayacagim demek istiyor

        System.out.println(str3);                       // null isaretledigimizi yazdirir.

        //System.out.println(str3.concat("Java"));    // NullPointerException hatasi verir

        System.out.println(str3+"Java");   // nullJava  >> method kullanamzsin ancak toplama yapabilirsin.

        //System.out.println(str3.toUpperCase());    // NullPointerException hatasi verir

















    }
}
