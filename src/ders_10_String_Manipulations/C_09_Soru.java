package ders_10_String_Manipulations;

public class C_09_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir metin alin.
        cumlenin durumuna gore;
        1- Cumle metni icermiyor.
        2- Cumle metni sadece 1 kere iceriyor.
        3- Cumle metni birden fazla iceriyor.
        seceneklerinden uygun olani yazdirin
         */

        String cumle = "Java cok guzeldir cok";
        String metin = "cok";

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");

        }else if (ilkIndex==sonIndex){
            System.out.println("cumle metni sadece 1 kere iceriyor");

        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }










    }
}
