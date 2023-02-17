package ders_10_String_Manipulations;

public class C_05_soru {
    public static void main(String[] args) {

        /*
        Mail kontrolu yapan bir program hazirlayin
        1- mail @ isareti icermiyorsa "gecersiz email"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
        seklinde sonuc yazdirin.
         */

        String mail = "dygtrn@gmail.com";

        if (!mail.contains("@")){System.out.println("gecersiz email");}
        else if (!mail.contains("@gmail.com")){System.out.println("gmail adresi giriniz");}
        else if (!mail.endsWith("@gmail.com")){System.out.println("yazim hatasi");}
        else {System.out.println("email basari ile kaydedildi");}









    }
}
