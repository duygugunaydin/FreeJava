package ders_04_MatematikselIslemler_Increment_Decrement;

public class C_05_Increment_Decrement {
    public static void main(String[] args) {

        int sayi1 = 10 ;

         // Bu sayiyinin degerini arttiralm ve yazdiralim.Increment.

        // 1. yontem
        sayi1 = sayi1 + 3 ;
        System.out.println(sayi1);   //13

        // 2. yontem
        sayi1 +=3;
        System.out.println(sayi1);  //16

        // 3. yontem  //postincrement
        sayi1 ++;
        System.out.println(sayi1);  //17

        // 4. yontem  //preincrement
        ++sayi1 ;
        System.out.println(sayi1);  // 18


        int sayi2 = 20
                ;
        // Bu sayiyinin degerini de azaltalim ve yazdiralim.Decrement

        sayi2 = sayi2 + 5 ;  // 25
        sayi2 *= 2 ;         // 50
        sayi2 ++;            // 51
        ++sayi2 ;            // 52

        System.out.println(sayi2);



    }
}
