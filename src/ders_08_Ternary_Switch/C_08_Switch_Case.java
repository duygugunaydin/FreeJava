package ders_08_Ternary_Switch;

public class C_08_Switch_Case {
    public static void main(String[] args) {

        // SORU >> Kullanicidan ay numarasi alip mevsimi yazdirin.

        int ayNo = 5 ;

        switch (ayNo){
            case 12 :
            case 1  :
            case 2  :
                System.out.println("KIS");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ILKBAHAR");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("YAZ");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("SONBAHAR");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");


        }










    }
}
