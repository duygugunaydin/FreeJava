package ders_09_String_Manipulations;

public class C_07_substring_ikinci {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));  // >> gun yazdirir
        // 5. indexten baslar(dahil) 8. indexe kadar(haric) yazdirir.

        // gectikce >> yazdirin!!

        System.out.println(str.substring(9, 17));  // gectikce

        System.out.println(str.substring(3,7));  // o gu


        String isim = "HUSEYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar kucuk harf olarak kaydedin.

        System.out.println(isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase());

        // Daha acik yazacak olursak >>>
        isim = isim.substring(0,1).toUpperCase()+   // ilk harfi alip buyuk harf yaptik..
               isim.substring(1).toLowerCase() ;   // 1. index ve sonrasini alip kucuk harf yaptik

        System.out.println(isim);


        // sadece 3. indexdeki harfi yazdirin : e
        System.out.println(isim.substring(3,4));  // e

        System.out.println("zor sorunun cevabi : " + isim.substring(2,2));  // hiclik, hicbirsey yazdirmaz

        // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException hatasi verir.













    }
}
