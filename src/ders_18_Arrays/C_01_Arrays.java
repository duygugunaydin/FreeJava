package ders_18_Arrays;

public class C_01_Arrays {
    public static void main(String[] args) {

        int [] arr1 = {2,4,6,8,10};

        // array'in bir elementine ulasmak ve update etmek istersek :

        System.out.println(arr1[2]);  // 6

        arr1[3] = 20;
        System.out.println(arr1[3]);  // 20

        System.out.println(arr1.length);  // >> uzunlugu 5 dir ama toplam index sayisi 4 dur

        // son elementi yazdirin :
        System.out.println(arr1.length-1);

        // array'in tum elementlerini yazdirin

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        // array'in uzunlugu degistirilemez
        // eger array'de olmayan bir index'e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException hatasi verir
        // bu hata Compile Time Error (CTE) degil , run time error'dur
        // arr1 [5] = 35 ;  >> hata vermesin diye yoruma alindi.


    }
}
