package ders_11_String_Manipulations;

public class C_04_replaceAll {
    public static void main(String[] args) {

        // SORU >> Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli


        String input = "Ja5+va cok 1*guzel";

        input = input.replaceAll("\\d", "");  // Ja+va cok *guzel
        input = input.replace(" ", "5");      // Ja+va5cok5*guzel
        input = input.replaceAll("\\W", "");  // Java5cok5guzel
        input = input.replace("5", " ");      // Java cok guzel

        System.out.println(input);
















    }
}
