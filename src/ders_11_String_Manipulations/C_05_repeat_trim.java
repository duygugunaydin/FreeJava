package ders_11_String_Manipulations;

public class C_05_repeat_trim {
    public static void main(String[] args) {

        String str = "Java guzeldir";

        System.out.println(str.repeat(4)); // Java guzeldirJava guzeldirJava guzeldirJava guzeldir


        str = "   Java guzeldir   ";

        System.out.println(str.length());  // 19

        str = str.trim();  // >> bastaki sonraki bosluklari alir

        System.out.println(str);            // Java guzeldir
        System.out.println(str.length());   // 13


















    }
}
