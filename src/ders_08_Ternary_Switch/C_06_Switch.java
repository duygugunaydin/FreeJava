package ders_08_Ternary_Switch;

import java.util.Scanner;

public class C_06_Switch {
    public static void main(String[] args) {

        //Soru >> Kullanicinin girdigi gun numarasinin gun ismini yazdirin.

        // if else yontemi kimi zaman uzun ve zor olabiliyor.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun numarasi giriniz");
        int gunNo = scan.nextInt();

        if (gunNo==1){System.out.println("Pazartesi");}
        else if (gunNo==2){System.out.println("Sali");}
        else if (gunNo==3){System.out.println("Carsamba");}
        else if (gunNo==4){System.out.println("Persembe");}
        else if (gunNo==5){System.out.println("Cuma");}
        else if (gunNo==6){System.out.println("Cumartesi");}
        else if (gunNo==7){System.out.println("Pazar");}
        else{System.out.println("Gecersiz sayi girisi");}

        // bunun yerine switch case daha anlasilir ve kolay oluyor >>

        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;                             // Bu her bir break'i koymazsak calismaya devam eder
            case 2 :
                System.out.println("Sali");
                break;                             // dogru sonuca ulastiktan sonra durmasi icin break koyariz
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:                                    // DEFAULT >> 'da else gibidir ustekilerden biri degilse
                System.out.println("Gecersiz gun no");  // tum sonuclar defoultta yazdirilan cikacaktir.
        }
















    }
}
