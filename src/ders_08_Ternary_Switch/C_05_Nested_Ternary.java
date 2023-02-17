package ders_08_Ternary_Switch;

public class C_05_Nested_Ternary {
    public static void main(String[] args) {

        // Nested Ternary cok karmasiktir kullanilmasi tavsiye edilmez,onun yerine if else daha anlasilirdir.

        // ORNEK >> Kullanicidan bir tam sayi alin
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin.
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin.

        int sayi = 10 ;

        System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi" : "tek sayi" : sayi<-99 && sayi>-1000 ? "ucbasamakli" : "ucbasamakli degil");

        String sonuc = sayi>0
                       ?
                       sayi%2==0 ? "cift sayi" : "tek sayi"
                       :
                       sayi<-99 && sayi>-1000 ? "ucbasamakli" : "ucbasamakli degil" ;
        System.out.println(sonuc);  // daha anlasilir..

        if (sayi>0){
            System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
        }else {
            System.out.println(sayi<-99 && sayi>-1000 ? "ucbasamakli" : "ucbasamakli degil");
        }











    }
}
