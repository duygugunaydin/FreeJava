package ders_13_NestedForLoop_MethodOlusturma;

public class C_03_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim :

        // Dis dongu satirlari kontrol eder.

        for (int i = 1; i <= 4; i++) {

            // ic dongu her satirda olan degerleri kontrol eder.
            for (int j = 1; j <= 4; j++) {

                System.out.print(i * j + " ");

            }

            // ic dongu bittiginde javayi alt satira indirmeliyiz

            System.out.println("");   // alt satira indirecektir

        }
    }

}
