package ders_12_ForLoops;

public class C_02_ForLoops {
    public static void main(String[] args) {

        for (int i = 1 ; i<=10 ; i++){
            System.out.print( i + " ");   // Bu sayeyle sayiyi 1'den 10'a kadar yan yana yazdirabiliriz
        }                                 // System.out.print() yaptik  ln'i sildik yan yana yazdirsin diye..
        System.out.println("");    // >> bir sonraki yazdirdigimiz variable'in konsolda bir alt satira inmesi icin""

        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin.

        for (int sayi = 10 ; sayi<100 ; sayi++ ){
            if (sayi%7==0){
                System.out.print(sayi + " ");     // >> yan yana yazdirmasi icin ln'i siliyoruz..
            }                                     // 14 21 28 35 42 49 56 63 70 77 84 91 98
        }
        System.out.println("");

        // 13'den baslayip, 100'e kadar 7'ser 7'ser artirip yazalim:

        for (int i = 13 ; i<100 ; i+=7){
            System.out.print(i + " ");       // 13 20 27 34 41 48 55 62 69 76 83 90 97
        }
        System.out.println("");

        // 1'den 10'a kadar sinirlar dahil sayilarin karelerini yazdiralim:

        for (int i = 1 ; i<=10 ; i++){
            System.out.print(i*i + " ");   // 1 4 9 16 25 36 49 64 81 100
        }
        System.out.println("");






























    }
}
