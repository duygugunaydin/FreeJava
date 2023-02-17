package ders_19_Arrays;

import java.util.Arrays;

public class C_02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari yazdiran
        // bir method olusturun.

        int[] arr = {3,8,1,5,2,9};

        enKucukEnBuyukSayiBulma(arr);  //  1, 9

    }

    public static void enKucukEnBuyukSayiBulma (int[] arr){

        Arrays.sort(arr);

        System.out.println("En kucuk element : "+ arr[0]);

        System.out.println("En buyuk element : "+ arr[arr.length-1]);
    }
}
