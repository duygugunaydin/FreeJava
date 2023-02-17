package ders_14_MethodOlusturma;

public class C_03_StringTerseCevirme {

    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini donduren bir method olusturun

    public static void main(String[] args) {


        String input = "Java kod yazdikca ogrenilir";

        System.out.println(stringiTerseCevir(input));

    }

    public static String stringiTerseCevir(String input) {

        String tersInput = "";

        for (int i = input.length()-1 ; i >= 0 ; i--) {

            tersInput = tersInput+input.charAt(i);

        }

        return tersInput ;


    }






}
