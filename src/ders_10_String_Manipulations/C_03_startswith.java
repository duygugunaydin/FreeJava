package ders_10_String_Manipulations;

public class C_03_startswith {
    public static void main(String[] args) {

        String str = "manti acarken java ogrenilmez";

        // stratswith den iki tane vardir birincisi:

        System.out.println(str.startsWith("Manti"));  // false
        // String Manti ile mi basliyor demek. kucuk m ile basladigi icin false.

        System.out.println(str.startsWith("m"));   // true
        // String "m" ile mi basliyor.

        System.out.println(str.startsWith("manti acarken java ogenilmez"));  // true

        System.out.println(str.startsWith(""));  // true
        // m'den once hicbirsey olmadigi icin true kabul eder.


        // stratswith den iki tane vardir ikincisi:

        System.out.println(str.startsWith("acarken",6));  // true
        // 6. index > acarken ile mi basliyor demek

        System.out.println(str.startsWith("manti",0));  // true

        System.out.println(str.startsWith("java" , 10));  // folse

















    }
}
