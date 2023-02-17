package ders_10_String_Manipulations;

public class C_08_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));  // 21 >> en sonuncu a demek

        System.out.println(str.lastIndexOf('a'));  // 15    // aramaya sondan baslar..

        System.out.println(str.lastIndexOf("java"));  // -1

        System.out.println(str.lastIndexOf("Java"));  // 0

        System.out.println(str.lastIndexOf("e", 14));  // 11  >> 14.indexten sonra geriye gidip e yi aramaya baslar















    }
}
