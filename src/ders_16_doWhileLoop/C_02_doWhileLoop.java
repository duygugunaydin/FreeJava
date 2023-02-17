package ders_16_doWhileLoop;

public class C_02_doWhileLoop {
    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olusturalim:

        int sayi = 10;
        int toplam = 0;


        do {

            toplam = toplam + sayi ;

            sayi++;

        }while (sayi <= 12);

        /*
        do while loop'un iki avantaji vardir:
        1- Loop body'si en az bir kere calisir (ilk java ilk ustten basladigi icin)
           (ama while loop'da baslangic degeri uygun degilse, loop body'si hic calismayabilir)
        2- while bitis kontrolu loop kadar calisir.
           (ama while loop'da bir kere fazla calisrdi)
         */

















    }
}
