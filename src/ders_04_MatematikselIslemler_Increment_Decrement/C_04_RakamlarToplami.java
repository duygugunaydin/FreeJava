package ders_04_MatematikselIslemler_Increment_Decrement;

public class C_04_RakamlarToplami {
    public static void main(String[] args) {

        //  Kullanicinin girdigi dort basamakli sayinin,
        // rakamlar toplamini veren bir kod yaziniz.

       int input = 1453 ;

       int birlerBasamagi = 0 ;
       int rakamlarToplami = 0 ;

        // 1- birler basamagini al.
       birlerBasamagi = input % 10 ;  //3

        // 2- birler basamagini, rakamlar toplamina ekle
       rakamlarToplami = birlerBasamagi + rakamlarToplami ;

        // 3- birler basamagindan kurtul.
        input = input / 10 ;



        birlerBasamagi = input % 10 ;  //5
        rakamlarToplami = birlerBasamagi + rakamlarToplami ;
        input = input / 10 ;


        birlerBasamagi = input % 10 ;  //4
        rakamlarToplami = birlerBasamagi + rakamlarToplami ;
        input = input / 10 ;


        birlerBasamagi = input % 10 ;  //1
        rakamlarToplami = birlerBasamagi + rakamlarToplami ;
        input = input / 10 ;


        System.out.println("Verilen sayinin rakamlar toplami : " + rakamlarToplami);














    }
}
