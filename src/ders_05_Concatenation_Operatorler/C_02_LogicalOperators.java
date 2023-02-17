package ders_05_Concatenation_Operatorler;

public class C_02_LogicalOperators {
    public static void main(String[] args) {

        int a = 20 ;
        int b = 30 ;

        System.out.println( a>b && b>0 && a>0);   //false

        boolean sonuc = 3*a <= 2*b && a>10 && b>20 ;
        System.out.println(sonuc);                    // true


        System.out.println( a<5 || b<40);

        // && opreratoru-and- >> tek bir false varsa sonucu false kabul eder.
        // & operatoru-and-   >> o da aynisidir fakat sonucu daha yavas bulur.
        // || operatoru-or-  >> tek bir true varsa sonucu true kabul eder.












    }
}
