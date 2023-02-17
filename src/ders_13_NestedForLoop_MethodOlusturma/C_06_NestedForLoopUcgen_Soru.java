package ders_13_NestedForLoop_MethodOlusturma;

public class C_06_NestedForLoopUcgen_Soru {
    public static void main(String[] args) {

        /*
        nested for loop kullanarak asagidaki sekli hazirlayin

        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25

         */

        for (int i = 1; i <=5 ; i++) {  // satiri ifade ediyor

            for (int j = 1; j <=i ; j++) {  // sutunu ifade ediyor

                System.out.print(i*j + " ");
            }
            System.out.println("");
        }













    }
}
