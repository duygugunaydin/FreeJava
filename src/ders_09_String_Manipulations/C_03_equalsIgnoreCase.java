package ders_09_String_Manipulations;

public class C_03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2));  // false
        System.out.println(str1.equals(str3));  //false

        /*
        equalsIgnoreCase >> ayni metnin buyuk kucuk harf kullanilarak olusturulan
        farkli yazimlarini esit kabul eder.
        yani >> ali,Ali,aLi,ALI,.. birbirine esittir.
        ama kelimede farklilik varsa bunu tolere etmez.
        a li ile ali ya da ali ile ali.  birbirine esit degildir.
         */

        System.out.println(str1.equalsIgnoreCase(str2));  //true
        System.out.println(str1.equalsIgnoreCase(str3));  //true
        System.out.println(str1.equalsIgnoreCase("ali "));  // false cikar cunku sonunda bosluk(space) var.














    }
}
