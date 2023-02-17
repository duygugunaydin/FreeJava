package ders_17_Scope;

public class C_02_ClassLevelVariables {

    // Class level variable'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusturulmalaridir

    static String hastaneIsmi = "Yildiz Hastanesi";  // tum herseyi etkiliyorsa static olmali
    static int hastaSayisi = 23453 ;                 // tum objeler icin gecerli deger
    static String bashekimIsmi ;
    String personelIsmi ;                            // herkes icin farkli olacagindan static olmamali
    String personelTelefonu ;
    int personelYasi ;



    public static void main(String[] args) {

        System.out.println(hastaneIsmi);     // Yildiz Hastanesi
        System.out.println(bashekimIsmi);    // null
        // System.out.println(personelIsmi); >> static olmadigi icin static method'dan KULLANILAMAZ!!
        /*
        Class level variable'lara deger atamasi yapilmamis olursa
        Java bu variable'lara data turune gore
        default olarak tanimlanan degerleri atar.
        defoult degerler
        sayisal variable'lar : 0
        boolean : false
        char : ''
        objeler (String dahil) : null
        bu yuzden atamak yapmamak yerine isim girilmedi vs yazmak daha dogru olur
         */
    }

    public static void method1(){
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        // System.out.println(personelIsmi);
        // yine ayni sekilde static method oldugu icin static variable'lar cagirilabilir
        // ama static olmayanlar kullanilamaz !

    }

    public void method2 (){
        System.out.println(hastaneIsmi);  // static method olmadigi halde static variable'lar kullanilabilir
        hastaSayisi++;
        System.out.println(personelIsmi); // null  >> static olmayan method oldugu icin bu variable'lar kullanilabilir
        System.out.println(personelYasi); // 0
        /*
        static variable'lar her yere gidebiliyor,
        ama static methodlar static olmayanlari almiyor
         */

    }
        }