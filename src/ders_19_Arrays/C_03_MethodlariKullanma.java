package ders_19_Arrays;

import ders_18_Arrays.C_03_ArrayElementleriniArttirma;
import ders_18_Arrays.C_04_ArrayElementleriTopla;
import ders_18_Arrays.C_05_ArraydeElemanArama;
import ders_18_Arrays.C_06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C_03_MethodlariKullanma {
    public static void main(String[] args) {

        // Verilen bir int array'in elementlerini 2 arttirin.

        int[] arr = {2,3,4};

        arr = C_03_ArrayElementleriniArttirma.elementleriIkiArttir(arr);

        System.out.println(Arrays.toString(arr));  // 4,5,6


        // arr array'inin elementlerini toplayip sonucu yazdirin.

        System.out.println(C_04_ArrayElementleriTopla.pozitifelementleritopla(arr));   // 15


        // arr array'inde 10 element olarak var mi?

        C_05_ArraydeElemanArama.elemanAra(arr,10);   // Aranan sayi array'de yok


        // Kullanicidan deger alarak bir deger olusturun

        int[] yeniArr = C_06_KullaniciyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr));


    }
}
