package ders_14_MethodOlusturma;

public class C_04_Tekrar {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 20;
        // bu iki sayinin carpim sonucunu yeni bir kod yazmadan konsola yazdirin

        System.out.println(C_01_Carpim.carpimMethodu(a, b));

        String c = "Nasil";
        String d = "yani?";
        // bu iki String'i aralarinda bir bosluk birakarak yazdirin

        System.out.println(C_02_StringConcate.birlestirMethodu(c, d));


        String e = "Bu da mi oldu?";
        // e String'ini tersten yazdirin
        System.out.println(C_03_StringTerseCevirme.stringiTerseCevir(e));


        // "Bu cumleyi terse cevirin"

        System.out.println(C_03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevir"));

    }
}
