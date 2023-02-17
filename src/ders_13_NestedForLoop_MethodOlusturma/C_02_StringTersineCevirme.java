package ders_13_NestedForLoop_MethodOlusturma;

public class C_02_StringTersineCevirme {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin

        String input = "Java her gecen gun guzellesiyor";
        String tersInput = "";

        for (int i = input.length()-1; i >= 0  ; i--) {

            tersInput += input.substring(i,i+1);
        }

        System.out.println("Ters Hali : " + tersInput);








    }
}
