package ders_08_Ternary_Switch;

public class C_02_Ternary {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        // Verilen iki metin birbiri ile ayni ise "metinler ayni",
        // farkl ise "metinler farkli" yazdirin.

        if (str1.equals(str2)){
            System.out.println("Metinler ayni");
        }else{
            System.out.println("Metinler farli");
        }

        // TERNARY ILE >>

        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler farkli");
        // equals metinlerin ayni olup olmadigina bakar.buyuk harf kucuk harf duyarlidir.

        System.out.println(str1.equalsIgnoreCase(str2) ? "Metinler ayni" : "Metinler farkli");
        // equalsignorcase ise yine ayni olup olmadigina bakar, buyuk kucuk harf duyarli degildir.






















    }
}
