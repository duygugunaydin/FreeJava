package ders_07_Nested_If_Else_Statements;

public class C_03_Nested_If_Else_Statements {
    public static void main(String[] args) {

        // SORU >> Kullanicidan cinsiyetini ve yasini alin,
        // Kadin 60 yas ve uzeri, Erkek 65 yas ve uzeri >> 'emekli olabilir' ,
        // Cinsiyet ve yasini dikkate alarak 'emekli olabilirsin'
        // veya 'emekli olmak icin ..yil calisman lazim' yazdirin.


        // Nested if else kullanim icin once ana degiskeni secip,
        // ona gore ana yapiyi olusturalim.

        // Cinsiyet ana degisken olsun >>

        char cinsiyet = 'K' ;
        int yas = 12 ;

        if (cinsiyet=='k' || cinsiyet=='K'){         // NOT // alttaki icerde olan kisim bu satira bagli
            if (yas>60){
                System.out.println("Emekli olabilir.");
            } else if (yas>15 && yas<60) {
                System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calisman lazim");
            }else {
                System.out.println("Hatali yas girisi");
            }
        } else if (cinsiyet=='e' || cinsiyet=='E'){   // NOT // alttaki icerde olan kisim bu satira bagli
            if (yas>60){
                System.out.println("Emekli olabilir.");
            } else if (yas>15 && yas<60) {
                System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calisman lazim");
            }else {
                System.out.println("Hatali yas girisi");
            }
        } else {
            System.out.println("Yanlis cinsiyet girisi");
        }

        // bir tik daha icerde olunca nested if else oluyor.
        // bir tik icerde olan kisim usttekine bagli














    }
}
