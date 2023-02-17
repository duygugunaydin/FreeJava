package ders_04_MatematikselIslemler_Increment_Decrement;

public class C_07_Pre_Post_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;   // b=10 a=11
        int c = ++b ;  // c=11 b=11

        System.out.println("a : " + a + ", b : " + b + ", c : " + c);

        a = 20 ;
        b = ++a ;  // a=21, b=21
        c = a++ ;  // a=22, c=21

        System.out.println("a : " + a + ", b : " + b + ", c : " + c);


        a=30 ;
        System.out.println(a++); //30
        System.out.println(--a); //30
        System.out.println(a--); //30
        System.out.println(a);   //29








    }
}
