package ders_06_If_Else_If_Statements;

public class C_06_If_Else_Statements_Not {
    public static void main(String[] args) {

        /*
        if else statements'da { } kullanmazsak
        hem if body'si hem de else body'si icin sadece 1 satir kabul eder.

        sonraki satirlar if-else ile ilisiklendirilemez,
        her durumda calisir.
         */

        int not = 56;

        if (not>50){
            System.out.println("Sinifi gectin");       // suslu parantez icine ne kadar yazdirmak istersn
            System.out.println("Yazin kafan rahat");   // yazdirabilirsin
        } else {
            System.out.println("Bu dersten kaldin");     //Ancak suslu parantez icinde olmazsa sadece ilk satiri
            System.out.println("Yaz okuluna bekleriz");  // sart kodu kabul eder.
        }



        if (not>50)
            System.out.println("Sinifi gectin");  // sonrasinda else oldugu icin ikinci satiri kabul etmiyor

         else
             System.out.println("Bu dersten kaldin");    //else bagli kod kabul ediyor,sart saglanirsa yazdirir.
            System.out.println("Yaz okuluna bekleriz");  //else bagli kabul etmiyor her durumda yazdirir.

           //  !!!SUSLU PARANTEZLER ONEMLI!!!!




















    }
}
