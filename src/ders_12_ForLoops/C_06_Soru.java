package ders_12_ForLoops;

public class C_06_Soru {
    public static void main(String[] args) {

        /* Soru 8 (interview)
        Kullanicidan pozitif bir sayi alin, 1'den baslayarak tum sayilari yazdirin,
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse, sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse, sayi yerine fizzbuzz yazdirin.
         */

        int sayi = 130 ;

        for (int i = 0; i <sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("fizzbuzz\n ");
            }else if (i%3==0){
                System.out.print("fizz ");
            }else if (i%5==0){
                System.out.print("buzz ");
            }else {
                System.out.print(i + " ");
            }
        }












    }
}
