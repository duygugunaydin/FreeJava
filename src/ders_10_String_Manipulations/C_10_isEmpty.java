package ders_10_String_Manipulations;

public class C_10_isEmpty {
    public static void main(String[] args) {

        String str = "";

        System.out.println(str.isEmpty());  // true

        str = "  ";

        System.out.println(str.isEmpty());  // false >> space karakteri var
        System.out.println(str.isBlank());  // true  >> bosluk mu var.space kabul ediyor.

        str = "x" ;

        System.out.println(str.isBlank());  // false
        System.out.println(str.isEmpty());  // false


    }
}
