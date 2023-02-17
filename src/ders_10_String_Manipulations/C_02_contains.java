package ders_10_String_Manipulations;

public class C_02_contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok zevkli";

        // CharSequence : char dizisi
        // bu karakterleri iceriyor mu demek cevap daima true false doner.

        System.out.println(str.contains("cok"));   // true

        System.out.println(str.contains("odla"));  // true

        System.out.println(str.contains("a"));     // true

        // System.out.println(str.contains('a'));  // parametre olarak char kabul etmez. hata verir.

        System.out.println(str.contains("java"));  // false >> java kucuk harfle basladigi icin..


        String  str2 = "Java" ;
        System.out.println(str.contains(str2)); // true >> str'in icinde str2 var mi demek..













    }
}
