package ders_10_String_Manipulations;

public class C_06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));       // a ilk defa 9. indexte vardir.
        System.out.println(str.indexOf('c'));       // 8
        System.out.println(str.indexOf("hersey"));  // 15. indexten baslar.

        System.out.println(str.indexOf("e", 9));   // 13 >> 9.indexten sonra 'e' ilk ne zaman vardir.

        // 13. indexteki e'den sonra, bir sonraki e'nin indexini bulalim

        System.out.println(str.indexOf("e", 14));  // 16

        // Cumledeki ikinci c'nin indexini yazdirin:

        int ilkCindex = str.indexOf("c") ;  // 8 >>ilk once ilk c'nin indexini buluruz.

        System.out.println(str.indexOf("c", ilkCindex+1));  // 22 // sonra ikinci c'nin indexini bulabiliriz

        System.out.println(str.indexOf("ali"));  // -1 index olarak int dondurmesi bekleniyor
        System.out.println(str.indexOf("x"));    // -1 >> ancak olmadigi icin -1 doner. olmayan hersey sabittir >>-1

    }
}
