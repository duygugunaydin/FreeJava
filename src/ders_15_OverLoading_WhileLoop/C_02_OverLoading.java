package ders_15_OverLoading_WhileLoop;

public class C_02_OverLoading {
    public static void main(String[] args) {

        carpim(3,5);    // method call sirasinda method parantezine yazilanlara argument denir.
        carpim(3.4,2);  // minimum casting >> double integer --6.8
    }
    // Bir class'da ayni isim ve ayni signature'a sahip iki method olmaz

    /*
    Method overloading olan class'larda Java hangi method'un caliscagina
    su sekilde karar verir

    1- once method ismine bakar
    2- argument sayisi ile parametre sayisina bakar
    3- argument ve parametre uyumuna bakar
    4- minimum casting
     */



    public static void carpim(int sayi1 , int sayi2){       // carpim >> int*int

        System.out.println("Iki integer sayinin carpimi : " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1 , int sayi2, int sayi3){       // carpim >> int*int*int

        System.out.println("Uc integer sayinin carpimi : " + sayi1 * sayi2 * sayi3);
    }
    public static void carpim(double sayi1 , int sayi2){       // carpim >> dopuble*int

        System.out.println("double-integer sayinin carpimi : " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1 , double sayi2){       // carpim >> int*double

        System.out.println("integer-double sayinin carpimi : " + sayi1 * sayi2);
    }
    public static void carpim(double sayi1 , double sayi2){       // carpim >> double*double

        System.out.println("Iki double sayinin carpimi : " + sayi1 * sayi2);
    }






}
