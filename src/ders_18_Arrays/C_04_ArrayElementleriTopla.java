package ders_18_Arrays;

public class C_04_ArrayElementleriTopla {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int [] arr1 = {3,-3,5,-7,-6,1,-2};

        System.out.println(pozitifelementleritopla(arr1));
    }

    // method olusturalim :

    public static int pozitifelementleritopla(int[]arr){
        int toplam = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam += arr[i];
            }
        }
        return toplam ;
    }
}
